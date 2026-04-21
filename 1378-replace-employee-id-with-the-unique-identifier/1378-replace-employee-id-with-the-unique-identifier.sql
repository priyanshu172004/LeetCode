# Write your MySQL query statement below
SELECT euni.unique_id, e.name 
FROM EmployeeUNI euni
RIGHT JOIN Employees e
ON e.id = euni.id;