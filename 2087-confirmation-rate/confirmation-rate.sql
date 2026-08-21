# Write your MySQL query statement below
SELECT s.user_id,
round(avg(if(c.action = 'confirmed',1,0)), 2)AS confirmation_rate
From Signups s
Left Join Confirmations c
ON s.user_id = c.user_id
group by s.user_id;