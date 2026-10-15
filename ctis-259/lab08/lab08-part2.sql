select firstName,lastName,city
from storecustomer
where city='Istanbul';

select firstName,lastName,city
from storecustomer
where city!='Ankara';

select *
from storecustomer
where lastname like 'A%';

select *
from storecustomer
where firstname like '%e%';

select *
from storecustomer
where city in ('Ankara','Bursa');


select *
from storecustomer
where city not in('Ankara','Bursa');

select *
from storecustomer
where customerNo>1002 and city='Antalya';


select *
from storecustomer
where customerNo>1002 and customerNo<1004;

select *
from storecustomer
order by firstname;


select *
from phonemodel
order by price desc;


select *
from phonemodel
where price> &enterprice;

select *
from phonemodel
where price> 30000 and price> 10000;

select *
from phonemodel
where modelname like '%Galaxy%';

select * from brand;

select *
from brand
where country in ('USA','South Korea');

select cust.firstname,cust.lastname,phone.customerNo,phone.phoneNo
from storecustomer cust,customerphone phone
where cust.customerNo=phone.customerNo;


select cust.firstname,cust.lastname,purch.purchaseDate,purch.amount
from storecustomer cust,purchase purch
where cust.customerNo=purch.customerNo;

select cust.firstname,cust.lastname,phone.modelName
from storecustomer cust, phonemodel phone,purchase purch
where cust.customerNo=purch.customerNo and purch.phoneId=phone.phoneId;

select cust.firstname,cust.lastname,phone.modelName
from storecustomer cust, phonemodel phone,purchase purch
where cust.customerNo=purch.customerNo and purch.phoneId=phone.phoneId
and purch.amount>50000;
