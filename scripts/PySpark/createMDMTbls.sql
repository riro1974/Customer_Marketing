mysql -u root -p <<eof
create database if not exists  mdm_db1;
use mdm_db1;

create table if not exists dept(
                                dept_id varchar(20),
                                dept_desc varchar(70)
                                );
create table if not exists class(
                                dept_id varchar(20),
                                class_id varchar(20),
                                class_desc varchar(70)
                                );
create table if not exists vendor(
                                dept_id varchar(20),
                                vendor_id varchar(20),
                                vendor_desc varchar(70)
                                );
create table if not exists style(
                                dept_id varchar(20),
                                vendor_id varchar(20),
                                style_id varchar(20),
                                style_desc varchar(70)
                                );
create table if not exists store(
                                store_id varchar(20),
                                str_name varchar(50),
                                address varchar(200),
                                city varchar(50),
                                state varchar(20),
                                str_type varchar(30)
                                );
create table if not exists customer(
                                cust_no varchar(20),
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
                                age VARCHAR(5),
                                cc_type varchar(20),
                                cc_nbr int(20),
                                cvv2 int(3),
                                cc_expires varchar(10),
                                guid varchar(70),
                                latitude varchar(20),
                                longitude varchar(20),
                                browser_user_agent varchar(20)
                                );
create table if not exists sales_rep(
                                salesrep_no varchar(20),
                                title varchar(10),
                                first_name varchar(30),
                                last_name varchar(30),
                                city varchar(20),
                                state varchar(20),
                                email VARCHAR(60),
                                phn VARCHAR(30),
                                dob VARCHAR(30),
                                age VARCHAR(5)
                                );
create table if not exists promotion(
                                promo_id varchar(20),
                                promo_desc varchar(50),
                                dept varchar(30),
                                start_dt date,
                                end_dt date,
                                promo_pct float
                                );
create table if not exists price_list(
                                dept varchar(50),
                                class varchar(70),
                                vendor varchar(70),
                                style varchar(70),
                                reg_unit_price float
                                );
create table if not exists return_reason(
                                return_reason_cd varchar(20),
                                return_reason_cd_desc varchar(70)
                                );

eof
