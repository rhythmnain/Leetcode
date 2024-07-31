# Write your MySQL query statement below
# we are using round to get closest 3 decimal values and we are using avg to get the avg of the time taken 
#The query calculates the average processing time for each machine by joining the Activity table with itself to match start and end activities. 
#It uses AVG(b.timestamp - a.timestamp) to compute the average duration of processing per machine and ROUND(..., 3) to round the result to 3 decimal places. 
#The results are grouped by machine_id, which ensures that each machine's average processing time is calculated individually. 

select a.machine_id, round(
    avg(b.timestamp-a.timestamp), 3
) as processing_time
from Activity as a
inner join Activity as b
using(machine_id, process_id)
where a.activity_type = 'start'
and b.activity_type = 'end'
group by 1;