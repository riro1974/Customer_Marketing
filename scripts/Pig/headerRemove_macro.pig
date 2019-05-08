
define unique_macro(X,Y) RETURNS distinct_rows {
    $distinct_rows=distinct $X;
    grpd = group $distinct_rows all;
    cnt = foreach grpd generate CONCAT('Number of unique records in $Y file : ', (chararray)COUNT($distinct_rows));
    store cnt into '/user/training/CDH/logs/uniqueout_$Y';
};

