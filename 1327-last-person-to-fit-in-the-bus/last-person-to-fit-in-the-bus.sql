# Write your MySQL query statement below
# Write your MySQL query statement below
select a.person_name
from Queue as a
join Queue as b 
on a.turn >= b.turn
group by a.turn
having sum(b.weight)<= 1000
order by sum(b.weight) desc
limit 1;