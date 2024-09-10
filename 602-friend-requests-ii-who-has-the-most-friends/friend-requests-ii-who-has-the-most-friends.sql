# Write your MySQL query statement below
Select S as id, count(*) as num
from(
    select requester_id as S, accepter_id as A
    from RequestAccepted
    union 
    Select accepter_id as S, requester_id as A
    from RequestAccepted
)b
group by S order by num desc limit 1;