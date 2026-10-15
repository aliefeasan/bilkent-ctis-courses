select * from employee;
select * from department;

select bdate,address
from employee
where fname='ALICE' and lname='SMITH';

select bdate,address
from employee
where fname='ALICE' and lname='SMITH';

select * from department;

select fname,lname,address
from employee,department
where employee.dno=department.dnumber and department.dname='RESEARCH';

select * 
from project
where PLOCATION='STAFFORD';

select emp.fname,emp.lname,sup.fname as superName,sup.lname superLastname
from employee emp, employee sup
where emp.superssn=sup.ssn;

select distinct salary
from employee;

select *
from employee
where address='HOUSTON';

select *
from employee
where BDATE like '%5_';

select * from works_on;
select * from project;

select emp.fname,emp.lname,emp.salary*1.1 as resultsalary
from employee emp, works_on w, project p
where emp.ssn=w.essn and w.pno=p.pnumber;

select * 
from employee
where dno=1 and salary>15000 and salary<20000;

select emp.lname,emp.fname,d.dname,p.pname
from employee emp, works_on w, project p,department d
where emp.ssn=w.essn and w.pno=p.pnumber
order by d.dname;