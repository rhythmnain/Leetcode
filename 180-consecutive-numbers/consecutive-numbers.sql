# Write your MySQL query statement below
select distinct a.num as consecutiveNums
from Logs as a
join Logs as b on a.id = b.id-1
join Logs as c on a.id = c.id-2
where a.num = b.num and b.num = c.num;