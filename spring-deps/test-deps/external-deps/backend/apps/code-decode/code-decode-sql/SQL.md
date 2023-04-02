# SQL

Link : https://www.youtube.com/watch?v=FJdryrcDD2s&list=PLyHJZXNdCXse86eLuwy5uZohd_bddE9Ni

## Find third-highest salary in sql

select max(salary) from employees where salary 
<
select max(salary) from employees where salary
<
(select max(salary) from employees)

select salary from employees ORDER BY Salary DESC LIMIT 2,1

## What are Indexes and How to create an index in SQL?

