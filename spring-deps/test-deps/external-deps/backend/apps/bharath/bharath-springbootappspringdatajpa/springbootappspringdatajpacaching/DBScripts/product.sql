use mydb;

create table product(
id int PRIMARY KEY,
name varchar(20),
description varchar(100),
price decimal(8,3) 
);

insert into product values(1,'IWatch','From Apple Inc',400);
insert into product values(2,'TV','From Samsung Inc',1000);
insert into product values(3,'Washer','From LG Inc',2000);
insert into product values(4,'Dryer','From LG Inc',1500);

select * from product;