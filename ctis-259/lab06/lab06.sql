create table customer(
    custno number(4) primary key,
    cname varchar2(20) NOT NULL,
    csurname varchar2(20) NOT NULL,
    address varchar2(30),
    city varchar2(15)
);

create table branch(
    bno number(4) primary key,
    bname varchar2(20) not null,
    city varchar2(20),
    assest number(11,3) constraint assest_check check (assest>0)
);

create table account(
    brno number(4),
    acno number(6),
    cno number(4) constraint fk_account 
    references  branch(bno) deferrable initially deferred,
    openingDate date default sysdate,
    balance number(11,3)
);

alter table account
    add constraint pk_account primary key(brno,acno);

create table creditaccount(
    brnchno number(4),
    loanno number(4),
    cuno number(4),
    amount number(11,3),
    startDate date default sysdate,
    endDate date,
    noofInst number(2),
    constraint endDate_check check (endDate>startDate),
    constraint pk_creditaccount primary key (brnchno,loanno),
    constraint fk_creditaccount_1 foreign key(brnchno)
    references branch(bno),
    constraint fk_creditaccount_2 foreign key(cuno)
    references branch(bno)
);



insert into account values(6412,123456,1111,'09-FEB-21',2560);
insert into account values(6577,125478,1111,'09-JAN-20',5750);
insert into account values(3425,112547,2222,'05-JUN-20',2345.5);
insert into account values(3442,136587,3333,'10-MAR-20',1250);

insert into branch  values (6412, 'BILKENT', 'ANKARA', 12345268.99);
insert into branch  values (6577, 'CANKAYA', 'ANKARA', 25482698.89);
insert into branch  values (3425, 'BEYOGLU', 'ISTANBUL', 45274587.75);
insert into branch  values (3442, 'BESIKTAS', 'ISTANBUL', 52365412.25);

insert into customer values (1111, 'ALI', 'YILMAZ', 'BILKENT', 'ANKARA');
insert into customer values (2222, 'AYSE', 'GULER', 'BEYOGLU', 'ISTANBUL');
insert into customer values (3333, 'CAN', 'ASLAN', 'CANKAYA', 'ANKARA');

commit;



