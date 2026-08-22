# Write your MySQL query statement below
SELECT DISTINCT l1.num as ConsecutiveNums
FROM logs l1
JOIN logs l2
on l1.id + 1 = l2.id
JOIN logs l3
on l2.id + 1 = l3.id
where l1.num = l2.num
AND l2.num = l3.num;