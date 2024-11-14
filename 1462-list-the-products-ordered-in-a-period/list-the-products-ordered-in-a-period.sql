# Write your MySQL query statement below
select a.product_name,sum(b.unit) as unit from 
Products a join Orders b on a.product_id = b.product_id where 
Month(order_date)=02 && Year(order_date)=2020 
group by b.product_id 
having sum(b.unit)>=100  ;