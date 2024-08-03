# Write your MySQL query statement below
select a.user_id, count(a.follower_id) as followers_count
from Followers as a
group by user_id
order by user_id asc;
