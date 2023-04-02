use mydb;

create table payment(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
amount decimal(8,3)
);

create table card(
id int ,
cardnumber varchar(20),
 FOREIGN KEY (id)
REFERENCES payment(id)
);

create table bankcheck(
id int ,
checknumber varchar(20),
FOREIGN KEY (id)
REFERENCES payment(id)
);

select * from payment;
select * from card;
select * from bankcheck;

/*
drop table payment;
drop table card;
drop table bankcheck;
*/
