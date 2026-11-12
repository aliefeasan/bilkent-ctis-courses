select * from dependent;
select * from employee;

select ssn
from employee minus  select essn from dependent;

SELECT SSN
FROM EMPLOYEE
INTERSECT
SELECT ESSN
FROM DEPENDENT;

select ssn
from employee minus  select essn from dependent;

SELECT SSN
FROM EMPLOYEE
UNION ALL
SELECT MGRSSN
FROM DEPARTMENT;s

select * from department;

select ssn
from employee 
minus
select mgrssn
from department;

select ssn
from employee
intersect 
select mgrssn
from department;

select * from project;
select * from department;
select dnumber
from department
intersect
select dnum
from project;


select dnumber from department
minus
select dnum from project;


select * from project;
select ssn,fname,lname,pname,plocation
from employee left outer join project on(dno=dnum);


select ssn,fname,lname,dno,pnumber,pname,plocation,dnum
from employee left outer join project on(dno=dnum) join ;

/* ******************************** LAB 13**************** */
/*
Q22. List ALL students with the titles of the books they borrowed (students who have not borrowed any books
must also appear).
*/  
select * from students;
select stname,stsurname,title
from students,borrowing,books
where stid=stuid and bisbn=isbn;

/*Q24. For every borrowing, list the student ID and book ISBN, and show whether the book has been ‘Returned’ or
‘Not returned’. Label the result column as borrowing_state.*/
select * from borrowing;

select stname,stuid,bisbn,nvl2(returndate,'returned','not_returned')as borrowing_state
from borrowing left outer join students on(stid=stuid);


/*
Q25. Display the student ID, ISBN, and return date in DD/MM/YYYY format. If the book has not been returned,
display 'Not returned' instead.*/

select stuid,bisbn,nvl(to_char(returndate,'DD/MM/YY'),'Not returned')as return_date
from students,borrowing where stid=stuid;


/*Q26. List the borrowings made in November 2024.*/
select *
from borrowing
where to_char(borrowdate,'MM/YYYY')='11/2024';
//Q27. List the borrowings made after 1 October 2024, ordered by borrow date.
select * 
from borrowing
where borrowdate>to_date('1/10/2024','DD/MM/YYYY');

//Q28. List late returns with student name, title and number of late days, most late first.
select *
from borrowing 
where returndate>duedate
order by returndate-duedate desc;


//Q29. List the borrowings that were returned on time (return date on or before the due date), and show how many
//days early each book was returned.
select duedate-returndate as earlyDay
from borrowing
where duedate>=returndate;

//Q30. List the students who live in ISTANBUL OR who currently hold an unreturned book.
select distinct stid,stname,staddress
from students,borrowing
where staddress='ISTANBUL' or returndate is null;
SELECT stid, stname, stsurname;


//Q31. List the IDs of students who borrowed BOTH 'Object Oriented Programming' (4-580-20-5)
//and 'Algorithm' (6-201-50-9).
desc borrowing;
select stuid,bisbn
from borrowing
where bisbn='4-580-20-5'
intersect
select stuid,bisbn
from borrowing
where bisbn='6-201-50-9';

SELECT stuid FROM borrowing WHERE bisbn = '4-580-20-5'
INTERSECT
SELECT stuid FROM borrowing WHERE bisbn = '6-201-50-9';


//Q32. List the IDs of authors who have written at least one book but do not have any available books.
select * from authors;
select * from bookaut;
select * from books;


SELECT auid FROM bookaut
MINUS
SELECT ba.auid
FROM bookaut ba, books b
WHERE ba.isbn = b.isbn
AND b.status = 'A';

//Q33. List the IDs of students who borrowed a book in October 2024 AND returned a book late.
select stuid
from students join borrowing on (stid=stuid)
where to_char(borrowdate,'MM/YYYY')='10/2024' and returndate>duedate;

select * from borrowing;

SELECT stuid
FROM borrowing
WHERE TO_CHAR(borrowdate, 'MM/YYYY') = '10/2024'
INTERSECT
SELECT stuid
FROM borrowing
WHERE returndate > duedate;

//Q34. Display the titles of books borrowed by students who live in ANKARA.
select distinct title
from books join borrowing on(isbn=bisbn)
join students on(stuid=stid)
where staddress='ANKARA';

SELECT title
FROM books
WHERE isbn IN (SELECT bisbn
FROM borrowing
WHERE stuid IN (SELECT stid
FROM students
WHERE staddress = 'ANKARA'));

//Q35. Display the titles of books borrowed by the student named ALI OKUR.
select title
from books
where isbn in (select bisbn
                from borrowing
                where stuid=(select stid
                            from students
                            where stname='ALI' and stsurname='OKUR'));


//Q36. Display the names and surnames of authors who have written available books.
select aname,asurname
from authors,bookaut,books
where aid=auid and books.isbn=bookaut.isbn and status='A';

select aname,asurname
from authors
where aid in (select auid
            from bookaut
            where isbn in (select isbn
                        from books
                        where status in 'A'));
Q37. Display the titles of books borrowed after the borrowing date of the book with ISBN '0-501-70-6'.
Q38. Display the names and surnames of students who borrowed at least one book written by a GERMAN author.
Q39. Display the students who borrowed books before the date student 222 borrowed 'ASP'.
Q40. Display the students (name and surname) who have never borrowed any book.
Q41. Display the students (name and surname) who returned at least one book late.
Q42. List the borrowings (student ID, ISBN, and borrow date) made after ALL borrowings of student 111.
Q43. Display the titles of the books that have at least two authors.
Q44. Display the authors who are from the same country as RICK DECKER (exclude Rick himself). */




-- This part isn’t required for the exam, 
-- since we drop the constraints and tables each time we recreate the database



