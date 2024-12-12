# Write your MySQL query statement below
select a.teacher_id, count(distinct subject_id) as cnt
from Teacher as a
group by teacher_id;