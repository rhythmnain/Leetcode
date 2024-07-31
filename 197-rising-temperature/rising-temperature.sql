# Write your MySQL query statement below
#same table weather named as w1 and w2 where we are checking the date difference like the consecutive dates like 1, 2 using dateddiff() where we check w2 and w2 the record date and then  check for the next condition which says temp of day2 should be > temp of day 1
select w1.id
from Weather w1, Weather w2
where datediff(w1.recordDate, w2.recordDate)=1 and w1.temperature>w2.temperature;