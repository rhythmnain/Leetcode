# Write your MySQL query statement below
select a.employee_id, a.department_id
from Employee as a
where primary_flag = 'Y' or a.employee_id 
in(
    select employee_id 
    from Employee
    group by employee_id
    having count(*) = 1
);