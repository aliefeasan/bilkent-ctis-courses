select * from employees;

select * 
from employees
order by hire_date asc;

select * 
from employees
order by hire_date desc;

select employee_id,first_name,last_name, salary*12 as ANNSAL
from employees
order by ANNSAL desc;

select employee_id,first_name,&selectedcolumn
from employees
order by 3;

select employee_id,first_name,employee_id
from employees
where employee_id=&wishedId;

select first_name,last_name,salary*12 as annsal
from employees
where job_id='&jId';

define number=200;
select employee_id, last_name, salary, department_id
from employees
where employee_id=&number;
undefine number;

