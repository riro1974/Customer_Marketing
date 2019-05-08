def buildMart(sc):
        from pyspark.sql import HiveContext
	from pyspark.sql import functions as F

        hc= HiveContext(sc)
        DataFrame[result: string]

	
	product_dim_df=  hc.sql("select * from custMkt_tgt.product_dim")
        customer_dim_df=  hc.sql("select * from custMkt_tgt.customer_dim")
        salesrep_dim_df = hc.sql("select * from custMkt_tgt.salesep_dim")
        store_dim_df=  hc.sql("select * from custMkt_tgt.store_dim")
        return_dim_df = hc.sql("select * from custMkt_tgt.return_reason_dim")
        sales_fact_df =  hc.sql("select * from custMkt_tgt.sales_fact")
        inv_fact_df =  hc.sql("select * from custMkt_tgt.inv_fact")
        promotion_fact_df=  hc.sql("select * from tMkt_tgt.promotion_fact")
        return_fact_df=  hc.sql("select * from custMkt_tgt.return_fact")


	product_dim_df.registerTempTable("product_dim")
	customer_dim_df.registerTempTable("customer_dim")
	salesrep_dim_df.registerTempTable("salesrep_dim")
	store_dim_df.registerTempTable("store_dim")
	return_dim_df.registerTempTable("return_dim")
	sales_fact_df.registerTempTable("sales_fact")
	inv_fact_df.registerTempTable("inv_fact")
	promotion_fact_df.registerTempTable("promotion_fact")
	return_fact_df.registerTempTable("return_fact")


# create summary tables ( total sales by month by dept / total sales by store-vendor/ total return by store / total return by vendor-store/ total sales by promotion)   

	from pyspark.sql.functions import concat,md5,decode,lit

	
# create summary tables

	tot_sales_month_dept_df = hc.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","sales_units","sales_dolrs","transdate").groupBy(

	inv_fact_df = pos_fact.select("transdate","cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","inv_units",F.when(pos_product_df.promoind == 0,pos_product_df.mkd_unit_price*pos_product_df.inv_units).otherwise(pos_product_df.reg_unit_price*pos_product_df.inv_units).alias('Inv_dol'))

# create target hive tables

	product_dim_df.write.mode("overwrite").saveAsTable("custMkt_tgt.product_dim")
	sales_fact_df.write.mode("overwrite").saveAsTable("custMkt_tgt.sales_fact")
	inv_fact_df.write.mode("overwrite").saveAsTable("custMkt_tgt.inv_fact")
	promo_fact_df.write.mode("overwrite").saveAsTable("custMkt_tgt.promotion_fact")
	return_fact_df.write.mode("overwrite").saveAsTable("custMkt_tgt.return_fact")
	store_df.write.mode("overwrite").saveAsTable("custMkt_tgt.store_dim")
	customer_df.write.mode("overwrite").saveAsTable("custMkt_tgt.customer_dim")
	salesrep_df.write.mode("overwrite").saveAsTable("custMkt_tgt.salesep_dim")
	return_reason_df.write.mode("overwrite").saveAsTable("custMkt_tgt.return_reason_dim")

def main():
        from pyspark import SparkContext
        sc = SparkContext("local","BuildMart")
	buildMart(sc)

main()

