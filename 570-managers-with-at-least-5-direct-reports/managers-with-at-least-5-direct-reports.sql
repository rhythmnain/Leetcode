# Write your MySQL query statement below
SELECT a.name
FROM Employee as a
JOIN Employee as b ON a.id = b.managerId
GROUP BY a.id, a.name
HAVING COUNT(b.id)>= 5;