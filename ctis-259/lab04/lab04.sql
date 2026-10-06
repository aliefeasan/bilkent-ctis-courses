CREATE TABLE DEPARTMENT(
     DNAME VARCHAR2(15),
     DNUMBER NUMBER(3),
     MGRSSN NUMBER(3),
     MGRSTARTDATE CHAR(8),
     CONSTRAINT pk_department PRIMARY KEY(DNUMBER)
);

CREATE TABLE EMPLOYEE(
     FNAME VARCHAR2(15),
     LNAME VARCHAR2(15),
     SSN NUMBER(3),
     BDATE CHAR(8),
     ADDRESS VARCHAR2(20),
     SALARY NUMBER(10),
     SEX CHAR(1),
     SUPERSSN NUMBER(3),
     DNO NUMBER(3),
     CONSTRAINT EMPLOYEE_PK PRIMARY KEY(SSN),
     CONSTRAINT EMPLOYEE_FK1 FOREIGN KEY(DNO)REFERENCES DEPARTMENT
(DNUMBER)DEFERRABLE INITIALLY DEFERRED
);

CREATE TABLE DEPT_LOCATION(
     DNUMBER NUMBER(3),
     DLOCATION VARCHAR2(15),
     CONSTRAINT pk_depth_location PRIMARY KEY(DNUMBER,DLOCATION)
);

CREATE TABLE DEPENDENT(
     ESSN NUMBER(3),
     DEPENDENT_NAME VARCHAR(2),
     SEX CHAR(1),
     BDATE CHAR(8),
     RELATIONSHIP VARCHAR2(15),
     CONSTRAINT pk_dependent PRIMARY KEY(ESSN,DEPENDENT_NAME)
);

CREATE TABLE WORKS_ON(
     ESSN NUMBER(3),
     "PNO" NUMBER(3),
     "HOURS" NUMBER(2),
     CONSTRAINT pk_works_on PRIMARY KEY(ESSN,"PNO")
);

SELECT * FROM TAB;

/* EMPLOYEE DATA */
insert into employee values
('JOHN','MICC',111,'12.10.72','HOUSTON',10000,'M',222,1);
insert into employee values
('MARRY','MINELL',222,'23.09.54','HOUSTON',12000,'F',111,2);
insert into employee values
('ALICE','SMITH',333,'14.03.67','NEWYORK',15000,'F',222,1);
insert into employee values
('JAMES','WONG',444,'12.02.55','NEWYORK',12000,'M',222,3);
insert into employee values
('FRANKLIN','WALLACE',555,'19.09.72','HOUSTON',12000,'M',111,3);

insert into employee values
('ANN','YOUNG',123,'20.03.89','COLORADO',13000,'F',111,1);
insert into employee values
('JANE','FRANK',124,'03.05.90','CALIFORNIA',14000,'F',222,2);
insert into employee values
('JACK','MITO',334,'24.11.94','STAFFORD',12000,'M',111,1);
insert into employee values
('ARDEN','ABRAM',113,'15.12.87','MARYLAND',10000,'M',111,4);
insert into employee values
('BILL','CURTIS',114,'31.07.82','COLORADO',18000,'M',111,4);
insert into employee values
('ARIA','BLAKE',115,'13.01.62','HOUSTON',20000,'F',222,1);

/* DATA ENTRY: DEPARTMENT                                       */
/*==============================================================*/
insert into department values('RESEARCH',1,111,'12.05.98');
insert into department values('ADMINISTRATION',2,222,'15.08.94');
insert into department values('TOURISM',3,333,'18.05.99');
insert into department values('PERSONNEL',4,123,'20.04.10');
insert into department values('PAYROLL',5,124,'18.10.15');

COMMIT;


ALTER TABLE EMPLOYEE
     ADD CONSTRAINT fk_employee_superssn FOREIGN KEY(SUPERSSN)
     REFERENCES EMPLOYEE(SSN);

ALTER TABLE DEPARTMENT
     ADD CONSTRAINT fk_department_mgrssn FOREIGN KEY(MGRSSN)
     REFERENCES EMPLOYEE(SSN);

SET CONSTRAINTS EMPLOYEE_FK1 IMMEDIATE;

ALTER TABLE DEPT_LOCATION
     ADD CONSTRAINT fk_dept_location FOREIGN KEY(DNUMBER)
     REFERENCES DEPARTMENT(DNUMBER);

ALTER TABLE DEPENDENT
     ADD CONSTRAINT fk_dependent1 FOREIGN KEY(ESSN)
     REFERENCES EMPLOYEE(SSN);


ALTER TABLE WORKS_ON
     ADD CONSTRAINT fk_works_on FOREIGN KEY(ESSN)
     REFERENCES EMPLOYEE(SSN);

CREATE TABLE PROJECT(
     PNAME VARCHAR2(15),
     PNUMBER NUMBER(3),
     PLOCATION VARCHAR2(15),
     DNUM NUMBER(3),
     CONSTRAINT pk_project PRIMARY KEY(PNUMBER)
);


ALTER TABLE WORKS_ON
     ADD CONSTRAINT fk_works_on1 FOREIGN KEY(PNO)
     REFERENCES PROJECT(PNUMBER);

ALTER TABLE PROJECT
     ADD CONSTRAINT fk_project FOREIGN KEY(DNUM)
     REFERENCES DEPARTMENT(DNUMBER);

/* DATA ENTRY: DEPT_LOCATION                                    */
/*==============================================================*/
insert into DEPT_LOCATION values (1,'HOUSTON');
insert into DEPT_LOCATION values (2,'STAFFORD');
insert into DEPT_LOCATION values (3,'HOUSTON');
insert into DEPT_LOCATION values (1,'NEWYORK');
insert into DEPT_LOCATION values (4,'NEWYORK');
insert into DEPT_LOCATION values (4,'STAFFORD');
insert into DEPT_LOCATION values (5,'COLORADO');
insert into DEPT_LOCATION values (5,'CALIFORNIA');

/*==============================================================*/
/* DATA ENTRY: PROJECT                                          */
/*==============================================================*/
insert into project values('PRODUCT_X',1,'HOUSTON',1);
insert into project values('PRODUCT_Y',2,'NEWYORK',1);
insert into project values('PRODUCT_Z',3,'STAFFORD',2);
insert into project values('PRODUCT_M',4,'STAFFORD',2);
insert into project values('PRODUCT_L',5,'HOUSTON',3);


/* DATA ENTRY: WORKS_ON                                         */
/*==============================================================*/
insert into works_on values(111,1,12);
insert into works_on values(111,2,6);
insert into works_on values(222,1,20);
insert into works_on values(113,2,8);
insert into works_on values(114,2,8);
insert into works_on values(123,2,8);
insert into works_on values(114,1,28);
insert into works_on values(114,3,40);
insert into works_on values(333,2,8);
insert into works_on values(124,4,25);
insert into works_on values(115,4,8);


ALTER TABLE DEPENDENT
     MODIFY DEPENDENT_NAME VARCHAR2(15);
/*==============================================================*/
/* DATA ENTRY: DEPENDENT                                        */
/*==============================================================*/
insert into dependent values(111,'JOY','M','12.10.73','SON');
insert into dependent values(111,'ALICE','F','18.09.75','DAUGHTER');
insert into dependent values(222,'MARY','F','15.04.76','SISTER');
insert into dependent values(333,'MICHAEL','M','23.04.67','SON');
insert into dependent values(123,'MARY','F','23.04.80','DAUGHTER');
insert into dependent values(123,'MICHAEL','M','12.05.79','SON');
insert into dependent values(114,'BARBARA','F','30.05.88','WIFE');


COMMIT;
