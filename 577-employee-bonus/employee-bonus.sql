# Write your MySQL query statement below
#using left join and returning the values where either bonus is less than 1000 or bonus is null
select a.name, b.bonus
from Employee as a
left join Bonus as b
on a.empID = b.empID
where bonus<1000 or bonus is null;