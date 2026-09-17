# Write your MySQL query statement below
SELECT DISTINCT activity_date AS day,
count(distinct user_id) AS active_users
FROM Activity 
WHERE activity_date BETWEEN '2019-06-28' and '2019-07-27'
group by activity_date;