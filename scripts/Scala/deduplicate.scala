spark-shell << eof
sc.setLogLevel("ERROR")

val  pos = sc.textFile("hdfs:///user/training/CustMkt/staging/pos/pos.dat");
val  cust = sc.textFile("hdfs:///user/training/CustMkt/staging/customer/*");
val  salesrep = sc.textFile("hdfs:///user/training/CustMkt/staging/sales_rep/*");
val  reason_cd = sc.textFile("hdfs:///user/training/CustMkt/staging/return_reason/*");
val promolist = sc.textFile("hdfs:///user/training/CustMkt/staging/promotion/*");
val storelist = sc.textFile("hdfs:///user/training/CustMkt/staging/store/*");
val dept = sc.textFile("hdfs:///user/training/CustMkt/staging/dept/*");
val class_data = sc.textFile("hdfs:///user/training/CustMkt/staging/class/*");
val vendor = sc.textFile("hdfs:///user/training/CustMkt/staging/vendor/*");
val style = sc.textFile("hdfs:///user/training/CustMkt/staging/style/*");

//  remove header


 val header = pos.first()
 val pos_data = pos.filter(x => x!=header)

 val header = salesrep.first()
 val salesrep_data = salesrep.filter(x => x!=header)

// deduplication 

 val unique_salesrep = salesrep_data.distinct(); 
 val unique_cust = cust.distinct(); 
 val unique_reasonCd = reason_cd.distinct(); 
 val unique_promolist = promolist.distinct(); 
// val unique_pricelist = pricelist.distinct(); 
 val unique_dept = dept.distinct();
 val unique_class = class_data.distinct();
 val unique_vendor = vendor.distinct();
 val unique_style = style.distinct();
 val unique_store = storelist.distinct();

 unique_salesrep.saveAsTextFile("/user/training/CustMkt/cleanse/unique/salesrep");
 unique_cust.saveAsTextFile("/user/training/CustMkt/cleanse/unique/cust");
 unique_reasonCd.saveAsTextFile("/user/training/CustMkt/cleanse/unique/reason_cd");
 unique_promolist.saveAsTextFile("/user/training/CustMkt/cleanse/unique/promotion");
 unique_dept.saveAsTextFile("/user/training/CustMkt/cleanse/unique/dept");
 unique_class.saveAsTextFile("/user/training/CustMkt/cleanse/unique/class");
 unique_vendor.saveAsTextFile("/user/training/CustMkt/cleanse/unique/vendor");
 unique_style.saveAsTextFile("/user/training/CustMkt/cleanse/unique/style");
 unique_store.saveAsTextFile("/user/training/CustMkt/cleanse/unique/store");

exit;
eof
