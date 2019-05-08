
export SOURCE_DIR=/home/cloudera/Class/Project/CustMkt/data

mysql -u root -p <<eof
use mdm_db1;

truncate table dept;
truncate table class;
truncate table vendor;
truncate table style;
truncate table customer;
truncate table sales_rep;
truncate table store;
truncate table return_reason;
truncate table promotion;
truncate table price_list;

LOAD DATA LOCAL INFILE '$SOURCE_DIR/class.dat' INTO TABLE class fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/vendor.dat' INTO TABLE vendor fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/style.dat' INTO TABLE style fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/dept.dat' INTO TABLE dept fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/customer.dat' INTO TABLE customer fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/salesrep.dat' INTO TABLE sales_rep fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/store.dat' INTO TABLE store fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/reason_cd.dat' INTO TABLE return_reason fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/promolist.dat' INTO TABLE promotion fields terminated by '|';
LOAD DATA LOCAL INFILE '$SOURCE_DIR/pricelist.dat' INTO TABLE price_list fields terminated by '|';

eof
