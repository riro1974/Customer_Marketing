
spark-shell --driver-memory 2G --executor-memory 2G<< eof

	import org.apache.spark.sql.hive._

	val hc= new HiveContext(sc)

// read data from hive

	val pos_df=  hc.sql("select * from custMkt_stg.pos")
	val customer_df =  hc.sql("select * from custMkt_stg.customer")
	val salesrep_df =  hc.sql("select * from custMkt_stg.salesrep")
	val dept_df=  hc.sql("select * from custMkt_stg.dept")
	val class_df=  hc.sql("select * from custMkt_stg.class")
	val vendor_df=  hc.sql("select * from custMkt_stg.vendor")
	val style_df=  hc.sql("select * from custMkt_stg.style")
	val store_df=  hc.sql("select * from custMkt_stg.store")
        val return_reason_df = hc.sql("select * from custMkt_stg.return_reason")
        val promotion_df = hc.sql("select * from custMkt_stg.promotion")

	pos_df.registerTempTable("pos");
	dept_df.registerTempTable("dept");
	class_df.registerTempTable("class");
	vendor_df.registerTempTable("vendor");
	style_df.registerTempTable("style");
	store_df.registerTempTable("store");
	customer_df.registerTempTable("customer");
	salesrep_df.registerTempTable("salesrep");
	return_reason_df.registerTempTable("reason_cd");
	promotion_df.registerTempTable("promotion_list");

//master data validation

	val deptNotNullDF = hc.sql("select * from dept where dept_id is not null");
	val classNotNullDF = hc.sql("select * from class where dept_id is not null and class_id is not null");
	val vendorNotNullDF = hc.sql("select * from vendor where dept_id is not null and vendor_id is not null");
	val styleNotNullDF = hc.sql("select * from style where dept_id is not null and vendor_id is not null and style_id is not null");
	val custNotNullDF = hc.sql("select * from customer where cust_no is not null");
	val salesrepNotNullDF = hc.sql("select * from salesrep where salesrep_no is not null");
	val storeNotNullDF = hc.sql("select * from store where store_id is not null");


//pos data validation 

	val posGoodDF = hc.sql("select a.* from pos a inner join customer b on a.cust_id=b.cust_no and b.cust_no is not null");
	posGoodDF.registerTempTable("posGood");
	val posGoodDF_1 = hc.sql("select a.* from posGood a inner join salesrep b on a.salesrep_id=b.salesrep_no and b.salesrep_no is not null");

	val posCustBadDF = hc.sql("select a.* from pos a right outer join customer b on a.cust_id=b.cust_no and b.cust_no is null");
	val posSalesRepBadDF = hc.sql("select a.* from pos a right outer join salesrep b on a.salesrep_id=b.salesrep_no and b.salesrep_no is  null");

	 posGoodDF_1.map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/pos");
	 deptNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/dept");
	 classNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/class");
	 vendorNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/vendor");
	 styleNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/style");
	 custNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/cust");
	 salesrepNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/salesrep");
	 storeNotNullDF.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/store");
	 return_reason_df.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/return_reason");
	 promotion_df.coalesce(1).map(x => x.mkString("|")).saveAsTextFile("/user/training/CustMkt/ext/promotion");	
exit;
eof
