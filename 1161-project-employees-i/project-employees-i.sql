# Write your MySQL query statement below
SELECT p.project_id, round(avg(e.experience_years), 2) AS average_years
FROM Project p
LEFT JOIN Employee e
ON p.employee_id = e.employee_id
group by p.project_id;