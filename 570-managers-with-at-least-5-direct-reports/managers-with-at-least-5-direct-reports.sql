# Write your MySQL query statement below
SELECT a.name
FROM Employee as a
JOIN(
    SELECT managerId, COUNT(*) AS directReports
    FROM Employee as b
    GROUP BY managerID
    HAVING COUNT(*)>=5
) b ON a.id = b.managerId;
