SELECT a.name, b.unique_id
FROM Employees a
LEFT JOIN EmployeeUNI b
ON a.id = b.id;