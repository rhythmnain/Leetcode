# Write your MySQL query statement below
select b.product_id, a.year as first_year, a.quantity as quantity, a.price
from Product as b
left join Sales as a
on a.product_id = b.product_id
where(a.product_id, a.year)in (select a.product_id, min(a.year)from Sales a group by a.product_id)
order by product_id asc;