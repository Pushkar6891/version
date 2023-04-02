use mydb;

create table student(
id int PRIMARY KEY AUTO_INCREMENT,
lname varchar(20),
fname varchar(20),
score int
);

insert into student(lname,fname,score) values('Virender','Sehwag','90');
insert into student(lname,fname,score) values('Sachin','Tendulkar','99');
insert into student(lname,fname,score) values('Sourav','Ganguly','88');
insert into student(lname,fname,score) values('Kapil','Dev','80');
insert into student(lname,fname,score) values('MS','Dhoni','91');

insert into student(lname,fname,score) values('Yuvraj','Singh','86');
insert into student(lname,fname,score) values('Virat','Kohli','88');
insert into student(lname,fname,score) values('Rohit','Sharma','92');
insert into student(lname,fname,score) values('Prithvi','Shaw','50');
insert into student(lname,fname,score) values('Suresh','Raina','77');

insert into student(lname,fname,score) values('Mithali','Raj','70');
insert into student(lname,fname,score) values('Smrithi','Mandhana','88');
insert into student(lname,fname,score) values('Shikhar','Dhawan','97');
insert into student(lname,fname,score) values('Sunil','Gavaskar','82');
insert into student(lname,fname,score) values('Rahul','Dravid','94');

insert into student(lname,fname,score) values('Mohinder','Amarnath','88');
insert into student(lname,fname,score) values('Navjot','Siddhu','90');
insert into student(lname,fname,score) values('Mohammad','Azharuddin','91');
insert into student(lname,fname,score) values('Mohammad','Kaif','93');
insert into student(lname,fname,score) values('Vinod','Kambli','97');

select * from student;

/*
drop table mydb.student;
*/