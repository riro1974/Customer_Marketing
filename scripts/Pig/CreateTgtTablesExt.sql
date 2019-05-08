use custmkt_tgt;

create external table product 
(
product_id varchar(50),
dept_id int,
dept_desc varchar(50),
class_id int,
class_desc varchar(50),
vendor_id int,
vendor_desc varchar(50),
style_id int,
style_desc varchar(50),
color varchar(20),
size_id int,
rating int)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/product';


create  external table cust_dim
(
 cust_id             int   ,           
 title               varchar(10)  ,           
 first_name          varchar(30)  ,           
 last_name           varchar(30)  ,           
 address             varchar(100) ,           
 city                varchar(20)  ,           
 state               varchar(20)  ,           
 zip                 varchar(20)  ,           
 country             varchar(20) ,           
 gender              varchar(10) ,           
 email               varchar(30) ,           
 username            varchar(20) ,           
 password            varchar(10) ,           
 phn                 varchar(20) ,           
 dob                 varchar(30) ,           
 age                 int ,           
 cc_type             varchar(20) ,           
 cc_nbr              int         ,           
 cvv2                int         ,           
 cc_expires          varchar(10) ,           
 guid                varchar(70) ,           
 latitude            varchar(20) ,           
 longitude           varchar(20) ,           
 browser_user_agent  varchar(20) 
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/customer';


create  external table salesrep_dim
(
salesrep_id             int,
title                   varchar(10),
first_name              varchar(30),
last_name               varchar(30),
city                    varchar(20),
state                   varchar(20),
email                   varchar(60),
phn                     varchar(30),
dob                     varchar(30),
age                     int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/salesrep';

create  external table store_dim
(
store_id                int,
str_name                varchar(50),
address                 varchar(200),
city                    varchar(50),
state                   varchar(20),
str_type                varchar(30)
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/store';

create  external table if not exists promotion_dim(
                                promo_id int,
                                promo_desc varchar(50),
                                dept_id int,
                                start_dt date,
                                end_dt date,
                                promo_pct float
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/promotion';

create external table if not exists return_reason_dim(
                                reason_cd int,
                                reason_cd_desc varchar(70)
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/reason_cd';

create  external table sales_fact
(
transdate		date,
cust_id                 int,
order_id                int,
promoind                int,
promo_id                int,
salesrep_id             int,
store_id                int,
product_id              varchar(50),
reg_unit_price          float,
mkd_unit_price          float,
sales_units             int,
sales_dolrs             float,
inv_units               int,
reason_cd               int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/sales_fact';

create  external table inv_fact
(
transdate              date,
cust_id                 int,
order_id                int,
promoind                int,
promo_id                int,
salesrep_id             int,
store_id                int,
product_id              varchar(50),
reg_unit_price          float,
mkd_unit_price          float,
sales_units             int,
sales_dolrs             float,
inv_units               int,
reason_cd               int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/inv_fact';

create  external table return_fact
(
transdate		date,
cust_id                 int,
order_id                int,
promoind                int,
promo_id                int,
salesrep_id             int,
store_id                int,
product_id              varchar(50),
reg_unit_price          float,
mkd_unit_price          float,
sales_units             int,
sales_dolrs             float,
inv_units               int,
reason_cd               int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/return_fact';

create  external table order_fact
(
transdate		date,
cust_id                 int,
order_id                int,
salesrep_id             int,
store_id                int,
reg_unit_price          float,
mkd_unit_price          float,
sales_units             int,
sales_dolrs             float,
inv_units               int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/order_fact';

create  external table promo_fact
(
transdate		date,
cust_id                 int,
order_id                int,
promoind                int,
promo_id                int,
salesrep_id             int,
store_id                int,
product_id              varchar(50),
reg_unit_price          float,
mkd_unit_price          float,
sales_units             int,
sales_dolrs             float,
inv_units               int,
reason_cd               int
)
row format delimited fields terminated by '\t'
location '/user/training/CustMkt/target/promo_fact';

