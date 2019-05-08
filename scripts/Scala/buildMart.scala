spark-shell <<eof
	import org.apache.spark.sql._
	import org.apache.spark.sql.functions._
	import org.apache.spark.sql.hive._

        sc.setLogLevel("ERROR")

        val  hc= new HiveContext(sc)
 
	val pos_df=  hc.sql("select * from CustMkt_Ext.pos")
        val customer_df =  hc.sql("select * from CustMkt_Ext.customer")
        val salesrep_df =  hc.sql("select * from CustMkt_Ext.salesrep")
        val dept_df=  hc.sql("select * from CustMkt_Ext.dept")
        val class_df=  hc.sql("select * from CustMkt_Ext.class")
        val vendor_df=  hc.sql("select * from CustMkt_Ext.vendor")
        val style_df=  hc.sql("select * from CustMkt_Ext.style")
        val store_df=  hc.sql("select * from CustMkt_Ext.store")
        val return_reason_df = hc.sql("select * from CustMkt_Ext.return_reason")
        val promotion_df = hc.sql("select * from CustMkt_Ext.promotion")

        pos_df.registerTempTable("pos")
        dept_df.registerTempTable("dept")
        class_df.registerTempTable("class")
        vendor_df.registerTempTable("vendor")
        style_df.registerTempTable("style")
        store_df.registerTempTable("store")
        customer_df.registerTempTable("customer")
        salesrep_df.registerTempTable("salesrep")
        return_reason_df.registerTempTable("reason_cd")
        promotion_df.registerTempTable("promotion")


// create product_id from MD5 function


	val pos_product_df = pos_df.withColumn("product_id",md5(concat($"dept_id",$"class_id",$"vendor_id",$"style_id",$"color",$"size_id")))

	val pos_fact = pos_product_df.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id", "reg_unit_price","mkd_unit_price","sales_units","sales_dolrs","inv_units","reason_cd","transdate")

	val pos_sku = pos_product_df.select("product_id","dept_id","class_id","vendor_id","style_id","color","size_id");

	val product_df= pos_sku.distinct()

	val product_df_1 = product_df.withColumn("Dept_desc",lit("")).withColumn("Class_desc",lit("")).withColumn("Vendor_desc",lit("")).withColumn("Style_desc",lit("")).withColumn("Rating",lit(0)).withColumn("start_dt",current_date()).withColumn("End_dt",lit("2100-01-01"))

	val product_dim_df = product_df_1.select("product_id","dept_id","dept_desc","class_id","class_desc","vendor_id","vendor_desc","style_id","style_desc","color","size_id","rating","start_dt","End_dt")

	
// create fact tables

	val sales_fact_df = pos_fact.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","sales_units","sales_dolrs","transdate")

//	val inv_fact_df = pos_fact.select("cust_id","order_id","promoind","promo_id","salesrep_id","store_id","product_id","reg_unit_price","mkd_unit_price","inv_units",when(col("pos_product_df.promoind") === 0,col("pos_product_df.mkd_unit_price") + col("pos_product_df.inv_units")).otherwise(col("pos_product_df.reg_unit_price") * col("pos_product_df.inv_units")).alias("Inv_dolrs"),"transdate")

	val inv_fact_df = pos_fact.select(col("cust_id"),col("order_id"),col("promoind"),col("promo_id"),col("salesrep_id"),col("store_id"),col("product_id"),col("reg_unit_price"),col("mkd_unit_price"),col("inv_units"),when(col("promoind") === 0,col("mkd_unit_price") ).otherwise(col("reg_unit_price") * col("inv_units")).alias("Inv_dolrs"),col("transdate"))

	val promo_fact_df = pos_fact.filter(col("promoind") === 0)

	val return_fact_df =  pos_fact.filter(col("reason_cd") !== 0)

// create target hive tables

	 product_dim_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.product_dim")
	 sales_fact_df.write.format("orc").mode("overwrite").partitionBy("transdate").saveAsTable("custMkt_tgt.sales_fact")
	 inv_fact_df.write.format("orc").mode("overwrite").partitionBy("transdate").saveAsTable("custMkt_tgt.inv_fact")
	 promo_fact_df.write.format("orc").mode("overwrite").partitionBy("transdate").saveAsTable("custMkt_tgt.promotion_fact")
	 return_fact_df.write.format("orc").mode("overwrite").partitionBy("transdate").saveAsTable("custMkt_tgt.return_fact")
	 store_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.store_dim")
	 customer_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.customer_dim")
	 salesrep_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.salesep_dim")
	 return_reason_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.return_reason_dim")
	 promotion_df.write.format("orc").mode("overwrite").saveAsTable("custMkt_tgt.promotion_dim")

exit;
eof
