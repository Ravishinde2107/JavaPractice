
-- find top N salary by desc
-- then get min from that salary
-- then select record whose salary same to that min salary
SELECT * FROM Employee WHERE sal =
                             (
                                 SELECT MIN(sal) FROM Employee
                                 WHERE  sal IN (
                                     SELECT DISTINCT TOP N
                                         sal FROM Employee
                                     ORDER BY sal DESC
                                 )
                             );


-- get distinct count of salary that greater that e1 salary
-- select that record whose count is equal to N-1
SELECT ename,sal from Employee e1 where
            N-1 = (SELECT COUNT(DISTINCT sal)from Employee e2 where e2.sal > e1.sal) ;

-- order record by salary in Desc and get n-1 record by limit
Select Salary from table_name order by Salary DESC limit n-1,1;