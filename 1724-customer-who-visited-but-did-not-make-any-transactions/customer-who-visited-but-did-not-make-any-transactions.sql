# Write your MySQL query statement below
SELECT v.customer_id, count(v.visit_id) AS count_no_trans
from Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id is null
GROUP BY v.customer_id;