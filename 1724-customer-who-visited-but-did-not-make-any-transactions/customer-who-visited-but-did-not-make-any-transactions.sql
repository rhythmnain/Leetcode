# Write your MySQL query statement below
select a.customer_id, count(a.visit_id) as count_no_trans
from Visits as a
left join Transactions as b
on a.visit_id = b.visit_id
where b.transaction_id is null
group by a.customer_id
order by a.customer_id;