/* Following data integrity validations will be performed in this script 
   1 : None of Primary keys are null in all files
   2 : Check all important columns are not null
	a. customer_name(customer table), Store name(store table), Reason_cd description (reason_cd table)
   3 : Data in the right range - promotion price < regular price
				  
   4 : Referential Integrity check 

	a. all promotion ids part of master promotion list
	b. all depts in pos file part of dept file
	c. all stores in pos file part of store file
	d. All return codes in pos file part of return code file 
*/

/* load all datasets */

set default_parallel 2

pos = load '/user/training/CustMkt/staging/pos/pos.dat' using PigStorage(',') as (transdate:chararray,cust_id:int,order_id:int,promoind:int,promo_id:int,salesrep_id:int,store_id:int,dept_id:int,class_id:int,vendor_id:int,style_id:int,color:chararray,size_id:int,reg_unit_price:float,mkd_unit_price:float,sales_units:int,sales_dolrs:float,inv_units:int,reason_cd:int);

cust = load '/user/training/CustMkt/cleanse/unique/cust' using PigStorage(',') as (cust_num:int,Title:chararray,First_nm:chararray, Last_nm:chararray, address:chararray,city:chararray,state:chararray,zipcode:chararray,country:chararray,gender:chararray,email_addr:chararray,usernm:chararray,passwd:chararray,phone:chararray,dob:chararray,age:int,cctype:chararray,ccnum:chararray,expiry_dt:chararray,guid:chararray,lat:chararray,long:chararray,bagent:chararray);

salesrep = load '/user/training/CustMkt/cleanse/unique/salesrep' using PigStorage(',') as (salesrep_num:int,title:chararray,first_nm:chararray,last_nm:chararray,city:chararray,state:chararray,email_addr:chararray,phone:chararray,dob:chararray,age:int);

reason_cd = load '/user/training/CustMkt/cleanse/unique/reason_cd' using PigStorage(',') as (reason_cd:int,reason_desc:chararray);

promolist = load '/user/training/CustMkt/cleanse/unique/promolist' using PigStorage(',') as (promo_id:int,promo_nm:chararray,dept_id:int,start_dt:chararray,end_dt:chararray,mkd_pct:float);

pricelist = load '/user/training/CustMkt/cleanse/unique/pricelist' using PigStorage(',') as (dept_id:int,class_id:int,vendor_id:int,style_id:int,reg_price:float);

storelist = load '/user/training/CustMkt/cleanse/unique/store' using PigStorage(',') as (store_id:int,store_nm:int,address:chararray,city:chararray,state:chararray,store_type);

dept = load '/user/training/CustMkt/cleanse/unique/dept' using PigStorage(',') as (dept_id:int,dept_desc:chararray);

class = load '/user/training/CustMkt/cleanse/unique/class' using PigStorage(',') as (dept_id:int,class_id:int,class_desc:chararray);

vendor = load '/user/training/CustMkt/cleanse/unique/vendor' using PigStorage(',') as (dept_id:int,vendor_id:int,vendor_desc:chararray);

style = load '/user/training/CustMkt/cleanse/unique/style' using PigStorage(',') as (dept_id:int,vendor_id:int,style_id:int,style_desc:chararray);

/* NOT NULL validation */

salesrep_null_recs = filter salesrep by (salesrep_num is NULL or first_nm is NULL);
cust_null_recs = filter cust by ( cust_num is NULL or First_nm is NULL);

good_dept_recs = filter dept by ( dept_id is NOT NULL );
good_class_recs = filter class by ( dept_id is NOT NULL and class_id is NOT NULL );
good_vendor_recs = filter vendor by ( dept_id is NOT NULL and vendor_id is NOT NULL );
good_style_recs = filter style by ( dept_id is NOT NULL and vendor_id is NOT NULL and style_id is NOT NULL );
good_store_recs = filter storelist by ( store_id is Not NULL);
good_cust_recs = filter cust by ( cust_num is Not NULL and First_nm is not NULL);
good_salesrep_recs = filter salesrep by ( salesrep_num is Not NULL and first_nm is not NULL);

bad_dept_recs = filter dept by ( dept_id is NULL );
bad_class_recs = filter class by ( dept_id is NULL or class_id is NOT NULL );
bad_vendor_recs = filter vendor by ( dept_id is NULL or vendor_id is NOT NULL );
bad_store_recs = filter storelist by ( store_id is NULL );

/* Range validation */
bad_range_promo_rec = filter promolist by mkd_pct >100;
good_range_promo_rec = filter promolist by mkd_pct <100;
bad_pos_promo_price = filter pos by mkd_unit_price >= reg_unit_price and promoind==0;
good_pos_promo_price = filter good_range_promo_rec by not (mkd_unit_price >= reg_unit_price and promoind ==0);


/* data integrity checks */

loyal_cust_pos = join pos by cust_id, cust by cust_num;
bad_pos_cust = join cust by cust_num right, pos by cust_id ;
bad_pos_cust_filter = filter bad_pos_cust by $0 is null and pos::cust_id !=0;
good_pos_cust_filter = filter bad_pos_cust by not ($0 is null and pos::cust_id !=0);
pos_cust_exception = foreach bad_pos_cust_filter generate $23..$41;  /* pick all columns */
pos_cust_good = foreach good_pos_cust_filter generate $23..$41;  /* pick all columns */

bad_pos_salesrep = join salesrep by salesrep_num right, pos_cust_good by salesrep_id ;
bad_pos_salesrep_filter = filter bad_pos_salesrep by $0 is null and pos_cust_good.salesrep_id !=0;
good_pos_salesrep_filter = filter bad_pos_salesrep by not ($0 is null and pos_cust_good.salesrep_id !=0);
pos_salesrep_exception = foreach bad_pos_salesrep_filter generate $10..$28;  /* pick all columns */
pos_salesrep_good = foreach good_pos_salesrep_filter generate $10..$28;  /* pick all columns */

/* store good and bad files in respective hdfs locations */



store salesrep_null_recs into '/user/training/CustMkt/exception/salesrep_null_exception';
store bad_range_promo_rec into '/user/training/CustMkt/exception/promolist_exception';
store cust_null_recs into '/user/training/CustMkt/exception/cust_null_exception';
store pos_salesrep_exception into '/user/training/CustMkt/exception/pos_salesrep_exception';

store good_range_promo_rec into '/user/training/CustMkt/ext/promo' ;
store pos_salesrep_good into '/user/training/CustMkt/ext/pos' ;
store good_dept_recs into '/user/training/CustMkt/ext/dept';
store good_class_recs into '/user/training/CustMkt/ext/class' ;
store good_vendor_recs into '/user/training/CustMkt/ext/vendor' ;
store good_style_recs into '/user/training/CustMkt/ext/style';
store good_store_recs into '/user/training/CustMkt/ext/store' ;
store good_salesrep_recs into '/user/training/CustMkt/ext/salesrep' ;
store good_cust_recs into '/user/training/CustMkt/ext/cust' ;
store reason_cd into '/user/training/CustMkt/ext/reason_cd' ;

