use mydb;

create table bankaccount (accno int,last_name varchar(25),first_name varchar(25),bal int);

insert into bankaccount values(1,'obama','barack',5000);
insert into bankaccount values(2,'donald','trump',4000);

select * from bankaccount;

/*
drop table bankaccount;
*/