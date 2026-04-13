# Write your MySQL query statement below
SELECT(
    SELECT DISTINCT salary
    FROM(
        SELECT
            salary,
            DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
        FROM Employee
    ) AS RankedSalaries
    WHERE rnk = 2
) AS SecondHighestSalary;