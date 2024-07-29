# Write your MySQL query statement below
select w.id 
from Weather as w ,Weather as b
where datediff(w.recordDate , b.recordDate) = 1 AND b.temperature < w.temperature;


