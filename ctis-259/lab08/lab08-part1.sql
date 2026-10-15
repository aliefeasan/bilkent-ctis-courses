select * from employees;
select * from departments;
select * from locations;

select emp.last_name,emp.first_name,emp.salary,dept.department_name
from departments dept,employees emp
where emp.department_id=dept.department_id;

select emp.last_name,emp.first_name,emp.salary
from employees emp, departments dep
where emp.department_id=dep.department_id;

select dep.department_id,dep.department_name,dep.location_id
from departments dep, locations loc
where dep.location_id=loc.location_id and loc.city='Seattle'
order by department_name asc;