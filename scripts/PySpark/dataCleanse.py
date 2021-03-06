def Cleanse(sc):
	from pyspark.sql import HiveContext

	hc= HiveContext(sc)
	DataFrame[result: string]

	pos_df=  hc.sql("select * from custMkt_stg.pos")
	customer_df =  hc.sql("select * from custMkt_stg.customer")
	salesrep_df =  hc.sql("select * from custMkt_stg.salesrep")
	dept_df=  hc.sql("select * from custMkt_stg.dept")
	class_df=  hc.sql("select * from custMkt_stg.class")
	vendor_df=  hc.sql("select * from custMkt_stg.vendor")
	style_df=  hc.sql("select * from custMkt_stg.style")
	store_df=  hc.sql("select * from custMkt_stg.store")
        return_reason_df = hc.sql("select * from custMkt_stg.return_reason")
        promotion_df = hc.sql("select * from custMkt_stg.promotion")

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

# master data validation

	deptNotNullDF = hc.sql("select * from dept where dept_id is not null");
	classNotNullDF = hc.sql("select * from class where dept_id is not null and class_id is not null");
	vendorNotNullDF = hc.sql("select * from vendor where dept_id is not null and vendor_id is not null");
	styleNotNullDF = hc.sql("select * from style where dept_id is not null and vendor_id is not null and style_id is not null");
	custNotNullDF = hc.sql("select * from customer where cust_no is not null");
	salesrepNotNullDF = hc.sql("select * from salesrep where salesrep_no is not null");
	storeNotNullDF = hc.sql("select * from store where store_id is not null");


# pos data validation 

	posGoodDF = hc.sql("select a.* from pos a inner join customer b on a.cust_id=b.cust_no and b.cust_no is not null");
	posGoodDF.registerTempTable("posGood");
	posGoodDF_1 = hc.sql("select a.* from posGood a inner join salesrep b on a.salesrep_id=b.salesrep_no and b.salesrep_no is not null");

	posCustBadDF = hc.sql("select a.* from pos a right outer join customer b on a.cust_id=b.cust_no and b.cust_no is null");
	posSalesRepBadDF = hc.sql("select a.* from pos a right outer join salesrep b on a.salesrep_id=b.salesrep_no and b.salesrep_no is  null");

	posGoodDF_1.write.mode("overwrite").save("/user/training/CustMkt/ext/pos");
	deptNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/dept");
	classNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/class");
	vendorNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/vendor");
	styleNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/style");
	custNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/cust");
	salesrepNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/salesrep");
	storeNotNullDF.write.mode("overwrite").save("/user/training/CustMkt/ext/store");
	return_reason_df.write.mode("overwrite").save("/user/training/CustMkt/ext/return_reason");
	promotion_df.write.mode("overwrite").save("/user/training/CustMkt/ext/promotion");	

def main():
        from pyspark import SparkContext
        sc = SparkContext("local", "cleanse")
	Cleanse(sc)	

main()

