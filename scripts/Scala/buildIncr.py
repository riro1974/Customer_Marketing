def buildMart(sc):
        from pyspark.sql import HiveContext
	from pyspark.sql import functions as F

        hc= HiveContext(sc)
	
# load all CustMkt_Ext staging tables and datamart tables

	pos_df=  hc.sql("select * from CustMkt_Ext.pos")
        customer_df =  hc.sql("select * from CustMkt_Ext.customer")
        customerCur_df=  hc.sql("select * from CustMkt_tgt.customer_dim")
        salesrep_df =  hc.sql("select * from CustMkt_Ext.salesrep")
        salesrepCur_df =  hc.sql("select * from CustMkt_tgt.salesrep_dim")
        dept_df=  hc.sql("select * from CustMkt_Ext.dept")
        class_df=  hc.sql("select * from CustMkt_Ext.class")
        vendor_df=  hc.sql("select * from CustMkt_Ext.vendor")
        style_df=  hc.sql("select * from CustMkt_Ext.style")
        store_df=  hc.sql("select * from CustMkt_Ext.store")
        storeCur_df=  hc.sql("select * from CustMkt_tgt.store_dim")
        return_reason_df = hc.sql("select * from CustMkt_Ext.return_reason")
        promotion_df = hc.sql("select * from CustMkt_Ext.promotion")
        promotionCur_df = hc.sql("select * from CustMkt_tgt.promotion_dim")
        productCur_df= hc.sql("select * from CustMkt_tgt.product_dim")

        pos_df.registerTempTable("pos")
        dept_df.registerTempTable("dept")
        class_df.registerTempTable("class")
        vendor_df.registerTempTable("vendor")
        style_df.registerTempTable("style")
        store_df.registerTempTable("store_temp")
        storeCur_df.registerTempTable("store_dim")
        customer_df.registerTempTable("customer_temp")
        customerCur_df.registerTempTable("customer_dim")
        salesrep_df.registerTempTable("salesrep_temp")
        salesrepCur_df.registerTempTable("salesrep_dim")
        return_reason_df.registerTempTable("reason_cd")
        promotion_df.registerTempTable("promotion_temp")
        promotionCur_df.registerTempTable("promotion_dim")
        productCur_df.registerTempTable("product_dim")

	# read json file (product_review)

	review_df = sqlContext.read.format('json').load('file:///home/cloudera/Class/Project/CustMkt/data/product_reviews.dat')


	from pyspark.sql.functions import concat,md5,decode,lit,current_date,split


# create product_id from MD5 function


	pos_product_df = pos_df.withColumn("product_id",md5(concat(pos_df.dept_id,pos_df.class_id,pos_df.vendor_id,pos_df.style_id,pos_df.color,pos_df.size_id)))

	pos_fact = pos_product_df.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id", "reg_unit_price","mkd_unit_price","sales_units","sales_dolrs","inv_units","reason_cd","transdate")

	pos_sku = pos_product_df.select("product_id","dept_id","class_id","vendor_id","style_id","color","size_id");

	product_df= pos_sku.distinct()

	product_df_1 = product_df.withColumn("Dept_desc",lit('')).withColumn("Class_desc",lit('')).withColumn("Vendor_desc",lit('')).withColumn("Style_desc",lit('')).withColumn("Rating",lit(0)).withColumn("start_dt",current_date()).withColumn("End_dt",lit('2100-01-01'))

	product_dim_df = product_df_1.select("product_id","dept_id","dept_desc","class_id","class_desc","vendor_id","vendor_desc","style_id","style_desc","color","size_id","rating","start_dt","End_dt")

	product_dim_df.registerTempTable("product_temp")

	
# create fact tables

	sales_fact_df = pos_fact.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","sales_units","sales_dolrs","transdate")

	inv_fact_df = pos_fact.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","inv_units",F.when(pos_product_df.promoind == 0,pos_product_df.mkd_unit_price*pos_product_df.inv_units).otherwise(pos_product_df.reg_unit_price*pos_product_df.inv_units).alias('Inv_dolrs'),"transdate")

	promo_fact_df = pos_fact.filter(pos_product_df.promoind == 0)

	return_fact_df =  pos_fact.filter(pos_product_df.reason_cd != 0)

# build new dimension record data frames

     	newCustDF = hc.sql("select a.* from customer_temp a where a.cust_id not in (select cust_id from customer_dim)")
	newCustDF.withColumn("start_dt",current_date()).withColumn("End_dt",lit("2100-01-01")

     	newSalesRepDF = hc.sql("select a.* from salesrep_temp a where a.salesrep_id not in (select salesrep_id from salesrep_dim)")
	newSalesRepDF.withColumn("start_dt",current_date()).withColumn("End_dt",lit("2100-01-01")


     	newStoreDF = hc.sql("select a.* from store_temp a where a.store_id not in (select store_id from store_dim)")
	newStoreDF.withColumn("start_dt",current_date()).withColumn("End_dt",lit("2100-01-01")
	
    	newProductDF = hc.sql("select a.* from product_temp a where a.product_id not in (select product_id from product_dim)")
	newProductDF.withColumn("start_dt",current_date()).withColumn("End_dt",lit("2100-01-01")
	review_df1 = review_df.withColumn("dept",split(review_df.sku,',').getItem(0)).withColumn("class",split(review_df.sku,',').getItem(1)).withColumn("vendor",split(review_df.sku,',').getItem(2)).withColumn("style",split(review_df.sku,',').getItem(3))

	review_avg = review_df1.groupBy('dept','class','vendor','style').avg('stars').alias("rating")

	product_final_df = newProductDF.join(review_avg,(newProductDF.dept == review_avg.dept) & (newProductDF.class == review_avg.class) & (newProductDF.vendor == review_avg.vendor) & (newProductDF.style == review_avg.style)).select("product_id","dept_id","dept_desc","class_id","class_desc","vendor_id","vendor_desc","style_id","style_desc","color","size_id","rating","start_dt","end_dt")

# create target hive tables

	sales_fact_df.write.format("orc").mode("append").partitionBy("transdate").saveAsTable("custMkt_tgt.sales_fact")
	inv_fact_df.write.format("orc").mode("append").partitionBy("transdate").saveAsTable("custMkt_tgt.inv_fact")
	promo_fact_df.write.format("orc").mode("append").partitionBy("transdate").saveAsTable("custMkt_tgt.promotion_fact")
	return_fact_df.write.format("orc").mode("append").partitionBy("transdate").saveAsTable("custMkt_tgt.return_fact")

	newProductDF.mode("append").format("orc").saveAsTable("custMkt_tgt.customer_dim")
	return_reason_df.write.mode("overwrite").saveAsTable("custMkt_tgt.return_reason_dim")
	newCustDF.mode("append").format("orc").saveAsTable("custMkt_tgt.customer_dim")
	newSalesRepDF.mode("append").format("orc").saveAsTable("custMkt_tgt.salesrep_dim")
	newStoreDF.mode("append").format("orc").saveAsTable("custMkt_tgt.store_dim")	

def main():
        from pyspark import SparkContext
        sc = SparkContext("local","BuildMart Incr")
	buildMart(sc)

main()

