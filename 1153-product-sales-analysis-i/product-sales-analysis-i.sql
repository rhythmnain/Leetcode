# Write your MySQL query statement below
Select b.product_name, a.year, a.price
from Product as b
inner join Sales as a
on b.product_id = a.product_id;