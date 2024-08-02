# Write your MySQL query statement below
SELECT a.project_id, ROUND(AVG(b.experience_years), 2) AS average_years
FROM Project as a
LEFT JOIN Employee as b
ON a.employee_id = b.employee_id
GROUP BY a.project_id