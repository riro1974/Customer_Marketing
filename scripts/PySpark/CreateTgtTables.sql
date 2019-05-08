use custmkt_tgt;

drop table customer_dim;
drop table inv_fact;
drop table product_dim;
drop table promotion_fact;
drop table return_fact;
drop table return_reason_dim;
drop table sales_fact;
drop table salesep_dim;
drop table store_dim;


create table product_dim 
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
rating int,
start_dt date,
end_dt date
)
stored as orc;


create  table customer_dim
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
 browser_user_agent  varchar(20) ,
start_dt date,
end_dt date
)
stored as orc;


create  table salesrep_dim
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
age                     int,
start_dt date,
end_dt date
)
stored as orc;

create  table store_dim
(
store_id                int,
str_name                varchar(50),
address                 varchar(200),
city                    varchar(50),
state                   varchar(20),
str_type                varchar(30),
start_dt date,
end_dt date
)
stored as orc;

create  table if not exists promotion_dim(
                                promo_id int,
                                promo_desc varchar(50),
                                dept_id int,
                                start_dt date,
                                end_dt date,
                                promo_pct float
)
stored as orc;

create table if not exists return_reason_dim(
                                reason_cd int,
                                reason_cd_desc varchar(70)
)
stored as orc;

create  table sales_fact
(
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
sales_dolrs             float
)
partitioned by (transdate varchar(20))
stored as orc;

create  table inv_fact
(
cust_id                 int,
order_id                int,
promoind                int,
promo_id                int,
salesrep_id             int,
store_id                int,
product_id              varchar(50),
reg_unit_price          float,
mkd_unit_price          float,
inv_units               int,
inv_dolrs               float
)
partitioned by (transdate varchar(20))
stored as orc;

create  table return_fact
(
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
partitioned by (transdate varchar(20))
stored as orc;

create  table order_fact
(
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
partitioned by (transdate varchar(20))
stored as orc;

create  table promotion_fact
(
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
partitioned by (transdate varchar(20))
stored as orc;

