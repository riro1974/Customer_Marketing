

import '/home/cloudera/Class/Project/CustMkt/scripts/unique_macro1.pig'; 

pos = load '/user/training/CustMkt/staging/pos/pos.dat' using PigStorage(',') as (transdate:chararray,cust_id:int,order_id:int,promoind:int,promo_id:int,salesrep_id:int,store_id:int,dept_id:int,class_id:int,vendor_id:int,style_id:int,color:chararray,size_id:int,reg_unit_price:float,mkd_unit_price:float,sales_units:int,sales_dolrs:float,inv_units:int,reason_cd:int);

cust = load '/user/training/CustMkt/staging/customer' using PigStorage(',') as (cust_num:int,Title:chararray,First_nm:chararray, Last_nm:chararray, address:chararray,city:chararray,state:chararray,zipcode:chararray,country:chararray,gender:chararray,email_addr:chararray,usernm:chararray,passwd:chararray,phone:chararray,dob:chararray,age:int,cctype:chararray,ccnum:chararray,expiry_dt:chararray,guid:chararray,lat:chararray,long:chararray,bagent:chararray);

salesrep = load '/user/training/CustMkt/staging/sales_rep' using PigStorage(',') as (salesrep_num:int,title:chararray,first_nm:chararray,last_nm:chararray,city:chararray,state:chararray,email_addr:chararray,phone:chararray,dob:chararray,age:int);

reason_cd = load '/user/training/CustMkt/staging/return_reason' using PigStorage(',') as (reason_cd:int,reason_desc:chararray);

promolist = load '/user/training/CustMkt/staging/promotion' using PigStorage(',') as (promo_id:int,promo_nm:chararray,dept_id:int,start_dt:chararray,end_dt:chararray,mkd_pct:float);

pricelist = load '/user/training/CustMkt/staging/pricelist' using PigStorage(',') as (dept_id:int,class_id:int,vendor_id:int,style_id:int,reg_price:float);

storelist = load '/user/training/CustMkt/staging/store' using PigStorage(',') as (store_id:int,store_nm:int,address:chararray,city:chararray,state:chararray,store_type);

dept = load '/user/training/CustMkt/staging/dept' using PigStorage(',') as (dept_id:int,dept_desc:chararray);
class = load '/user/training/CustMkt/staging/class' using PigStorage(',') as (dept_id:int,class_id:int,class_desc:chararray);
vendor = load '/user/training/CustMkt/staging/vendor' using PigStorage(',') as (dept_id:int,vendor_id:int,vendor_desc:chararray);
style = load '/user/training/CustMkt/staging/style' using PigStorage(',') as (dept_id:int,vendor_id:int,style_id:int,vendor_desc:chararray);

--deduplication 

unique_salesrep = unique_macro1(salesrep,'SalesRep'); 
unique_cust = unique_macro1(cust,'Customer'); 
unique_reasonCd = unique_macro1(reason_cd,'Reason_cd'); 
unique_promolist = unique_macro1(promolist,'Promotions'); 
unique_pricelist = unique_macro1(pricelist,'Pricelist');
unique_dept = unique_macro1(dept,'dept');
unique_class = unique_macro1(class,'class');
unique_vendor = unique_macro1(vendor,'vendor');
unique_style = unique_macro1(style,'style');
unique_store = unique_macro1(storelist,'store');

store unique_salesrep into '/user/training/CustMkt/cleanse/unique/salesrep' using PigStorage(',');
store unique_cust into '/user/training/CustMkt/cleanse/unique/cust' using PigStorage(',');
store unique_reasonCd into '/user/training/CustMkt/cleanse/unique/reason_cd' using PigStorage(',');
store unique_promolist into '/user/training/CustMkt/cleanse/unique/promolist' using PigStorage(',');
store unique_pricelist into '/user/training/CustMkt/cleanse/unique/pricelist' using PigStorage(',');
store unique_dept into '/user/training/CustMkt/cleanse/unique/dept' using PigStorage(',');
store unique_class into '/user/training/CustMkt/cleanse/unique/class' using PigStorage(',');
store unique_vendor into '/user/training/CustMkt/cleanse/unique/vendor' using PigStorage(',');
store unique_style into '/user/training/CustMkt/cleanse/unique/style' using PigStorage(',');
store unique_store into '/user/training/CustMkt/cleanse/unique/store' using PigStorage(',');

