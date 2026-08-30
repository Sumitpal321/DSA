# Write your MySQL query statement below
SELECT round(sum(player_login) / count(distinct player_id), 2) AS fraction
FROM
(SELECT player_id,
datediff(event_date, min(event_date) over(partition by player_id)) = 1 as player_login
FROM Activity)
AS new_table;

