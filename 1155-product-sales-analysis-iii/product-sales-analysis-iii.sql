# Write your MySQL query statement below
SELECT product_id, year AS first_year, quantity, price
FROM Sales
WHERE ((product_id, year) IN (Select product_id, min(year) FROM Sales group by product_id));