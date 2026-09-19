# Write your MySQL query statement below
SELECT user_id, count(distinct follower_id) AS followers_count
from Followers
group by user_id;