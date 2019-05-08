

create database if not exists CustMkt_stg;
use CustMkt_stg;

drop table if  exists dept;
drop table if  exists class;
drop table if  exists vendor;
drop table if  exists style;
drop table if  exists customer;
drop table if  exists salesrep;
drop table if  exists pos;
drop table if  exists store;
drop table if  exists promotion;
drop table if  exists price_list;
drop table if  exists return_reason;


create external table if not exists dept(
                                dept_id int,
                                dept_desc varchar(70)
                                )
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/dept';

create external table if not exists class(
                                dept_id int,
                                class_id int,
                                class_desc varchar(70)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/class';

create external table if not exists vendor(
                                dept_id int,
                                vendor_id int,
                                vendor_desc varchar(70)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/vendor';

create external table if not exists style(
                                dept_id int,
                                vendor_id int,
                                style_id int,
                                style_desc varchar(70)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/style';

create external table if not exists store(
                                store_id int,
                                str_name varchar(50),
                                address varchar(200),
                                city varchar(50),
                                state varchar(20),
                                str_type varchar(30)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/store';

create external table if not exists customer(
                                cust_no int,
                                title varchar(10),
                                first_name varchar(30),
                                last_name varchar(30),
                                address varchar(100),
                                city varchar(20),
                                state varchar(20),
                                zip varchar(20),
                                country varchar(20),
                                gender varchar(10),
                                email varchar(30),
                                username varchar(20),
                                password varchar(10),
                                phn varchar(20),
                                dob VARCHAR(30),
                                age int,
                                cc_type varchar(20),
                                cc_nbr int,
                                cvv2 int,
                                cc_expires varchar(10),
                                guid varchar(70),
                                latitude varchar(20),
                                longitude varchar(20),
                                browser_user_agent varchar(20)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/cust';


create external table if not exists salesrep(
                                salesrep_no int,
                                title varchar(10),
                                first_name varchar(30),
                                last_name varchar(30),
                                city varchar(20),
                                state varchar(20),
                                email VARCHAR(60),
                                phn VARCHAR(30),
                                dob VARCHAR(30),
                                age int
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/salesrep';

create external table if not exists promotion(
                                promo_id int,
                                promo_desc varchar(50),
                                dept_id int,
                                start_dt date,
                                end_dt date,
                                promo_pct float
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/promotion';

create external table if not exists price_list(
                                dept_id int,
                                class_id int,
                                vendor_id int,
                                style_id int,
                                reg_unit_price float
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/price_list';

create external table if not exists return_reason(
                                return_reason_cd int,
                                return_reason_cd_desc varchar(70)
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/cleanse/unique/reason_cd';

create external table if not exists pos(
transdate varchar(20),
cust_id int,
order_id int,
promoind int,
promo_id int,
salesrep_id int,
store_id int,
dept_id int,
class_id int,
vendor_id int,
style_id int,
color varchar(50),
size_id int,
reg_unit_price float,
mkd_unit_price float,
sales_units int,
sales_dolrs float,
inv_units int,
reason_cd int
)
row format delimited fields terminated by ','
location '/user/training/CustMkt/staging/pos';




