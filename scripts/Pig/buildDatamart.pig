

register /usr/lib/pig/lib/datafu-1.2.0.jar;

define MD5 datafu.pig.hash.MD5();

dept = load '/user/training/CustMkt/ext/dept' using PigStorage('\t') as (dept_id:int,dept_desc:chararray);

class = load '/user/training/CustMkt/ext/class' using PigStorage('\t') as (dept_id:int,class_id:int,class_desc:chararray);

vendor = load '/user/training/CustMkt/ext/vendor' using PigStorage('\t') as (dept_id:int,vendor_id:int,vendor_desc:chararray);

style = load '/user/training/CustMkt/ext/style' using PigStorage('\t') as (dept_id:int,vendor_id:int,style_id:int,style_desc:chararray);

pos = load '/user/training/CustMkt/ext/pos' using PigStorage('\t') as (transdate:chararray,cust_id:int,order_id:int,promoind:int,promo_id:int,salesrep_id:int,store_id:int,dept_id:int,class_id:int,vendor_id:int,style_id:int,color:chararray,size_id:int,reg_unit_price:float,mkd_unit_price:float,sales_units:int,sales_dolrs:float,inv_units:int,reason_cd:int);

/* generate Product_id in POS record */
pos_product = foreach pos generate transdate,cust_id,order_id,promoind,promo_id,salesrep_id,store_id,MD5((chararray)(CONCAT((chararray)dept_id,(chararray)class_id,(chararray)vendor_id,(chararray)style_id,(chararray)color,(chararray)size_id))) as product_id, dept_id,class_id,vendor_id,style_id,color,size_id,reg_unit_price,mkd_unit_price,sales_units,sales_dolrs,inv_units,reason_cd;

pos_fact = foreach pos_product generate transdate,cust_id,order_id,promoind,promo_id,salesrep_id,store_id,product_id, reg_unit_price,mkd_unit_price,sales_units,sales_dolrs,inv_units,reason_cd;


/* generate sku from POS record */
pos_sku = foreach pos_product generate product_id,dept_id,class_id,vendor_id,style_id,color,size_id;

/* generate distinct sku from POS record */
distinct_sku = distinct pos_sku;


/* join pos and all sku tables (dept/class/vendor/style */
product_1 = join distinct_sku by dept_id LEFT OUTER ,dept by dept_id;
product_2 = join product_1 by (distinct_sku::dept_id,distinct_sku::class_id) LEFT OUTER,class by(dept_id,class_id);
product_3 = join product_2 by (product_1::distinct_sku::dept_id,product_1::distinct_sku::vendor_id) LEFT OUTER,vendor by (dept_id,vendor_id);
product_4 = join product_3 by (product_2::product_1::distinct_sku::dept_id,product_2::product_1::distinct_sku::vendor_id,product_2::product_1::distinct_sku::style_id) LEFT OUTER,style by (dept_id,vendor_id,style_id);

/* project the sku ids/descriptions only. Replace null descriptions with "Desc Not found" */
product = foreach product_4 generate distinct_sku::product_id,product_3::product_2::product_1::distinct_sku::dept_id,(product_3::product_2::product_1::dept::dept_desc is NULL?'Desc not found':product_3::product_2::product_1::dept::dept_desc),product_3::product_2::product_1::distinct_sku::class_id,(product_3::product_2::class::class_desc is NULL?'Desc not found':product_3::product_2::class::class_desc), product_3::product_2::product_1::distinct_sku::vendor_id,(product_3::vendor::vendor_desc is NULL?'Desc not found':product_3::vendor::vendor_desc),product_3::product_2::product_1::distinct_sku::style_id,(style::style_desc is NULL?'Desc not found':style::style_desc),product_3::product_2::product_1::distinct_sku::color,product_3::product_2::product_1::distinct_sku::size_id;

/* generate Fact tables from POS file */

sales_fact = foreach pos_product generate transdate,cust_id,order_id,promoind,promo_id,salesrep_id,store_id,product_id,reg_unit_price,mkd_unit_price,sales_units,sales_dolrs;

inv_fact = foreach pos_product generate transdate,cust_id,order_id,promoind,promo_id,salesrep_id,store_id,product_id,reg_unit_price,mkd_unit_price,inv_units,inv_units*(promoind == 0?mkd_unit_price:reg_unit_price);

promo_fact = filter pos_fact by promoind==0;

return_fact = filter pos_fact by reason_cd != 0;

order_fact = foreach pos_fact generate transdate,cust_id,order_id,promoind,promo_id,salesrep_id,store_id,product_id,reg_unit_price,mkd_unit_price,sales_units,sales_dolrs;

/* store product data into target directory */
store product into '/user/training/CustMkt/target/product';

/* store all facts into target directory */
store sales_fact into '/user/training/CustMkt/target/sales_fact';
store inv_fact into '/user/training/CustMkt/target/inv_fact';
store promo_fact into '/user/training/CustMkt/target/promo_fact';
store return_fact into '/user/training/CustMkt/target/return_fact';
store order_fact into '/user/training/CustMkt/target/order_fact';

