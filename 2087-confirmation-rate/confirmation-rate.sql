# Write your MySQL query statement below
SELECT a.user_id,
round(avg(if(b.action= "confirmed", 1, 0)), 2) as confirmation_rate
FROM Signups as a 
LEFT JOIN Confirmations as b
ON a.user_id = b.user_id 
GROUP BY user_id;