# Write your MySQL query statement below
SELECT  class
FROM Courses 
Group by class
HAVING COUNT(student) >=5;