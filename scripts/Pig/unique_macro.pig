
define unique_macro(X,Y) RETURNS distinct_rows {
    grpd_dup = group $X by $X;
    cnt_dup = foreach grpd_dup generate $X,COUNT($X) as rec_count;
    dup_count = filter cnt_dup by rec_count>1; 
    $distinct_rows=distinct $X;
    grpd = group $distinct_rows all;
    cnt = foreach grpd generate CONCAT('Number of unique records in $Y file : ', (chararray)COUNT($distinct_rows));
    store cnt into '/user/training/CustMkt/logs/uniqueout_$Y';
    store dup_cnt into '/user/training/CustMkt/logs/dup_rec_$Y';
};

