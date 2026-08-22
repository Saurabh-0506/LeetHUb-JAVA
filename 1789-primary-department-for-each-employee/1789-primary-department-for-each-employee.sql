# Write your MySQL query statement below
SELECT employee_id,department_id
FROM Employee 
WHERE primary_flag = 'Y'
OR employee_id IN (
    SELECT employee_id
from Employee
group by employee_id
having count(*) = 1);
