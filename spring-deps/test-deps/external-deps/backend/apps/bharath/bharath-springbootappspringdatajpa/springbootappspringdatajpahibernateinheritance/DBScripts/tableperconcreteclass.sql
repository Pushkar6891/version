use mydb;

create table card(
id int PRIMARY KEY,
amount decimal(8,3),
cardnumber varchar(20)
);

create table bankcheck(
id int PRIMARY KEY,
amount decimal(8,3),
checknumber varchar(20)
);

select * from card;
select * from bankcheck;

/*
drop table card;
drop table bankcheck;
*/
