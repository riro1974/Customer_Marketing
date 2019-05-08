
/* load the product_reviews file */

reviews = load '/user/training/project/CustMkt/staging/reviews/*' USING JsonLoader('sku:chararray, comments:chararray, star:int');

product = load '/user/training/project/CustMkt/target/product/*' USING PigStotage(',') as (product_id:chararray,);

filtered_stars = filter reviews by star is not NULL:

grpd = group fltered_reviews by sku;

/* derive the average star value for the dept/class/vendor/style */

stars = foreach grpd generate group as sku, AVG(filtered_stars.star) as rating;

/* split the comma separated sku values to separate fields */

split_sku = foreach stars generate FLATTEN(STRSPLIT(sku,',')) as (dept:int,class:int,vendor:int,style:int),rating;

/* join the product file and add the star rating */

review_prod = join product on (dept,class,vendor,style) left , split_sku on (dept,class,vendor,style); 

enrich_product =  foreach review_prod generate product.*,split_sku.rating;

store enrich_product into /user/training/project/CustMkt/target/product/enrich using PigStorage(',');

