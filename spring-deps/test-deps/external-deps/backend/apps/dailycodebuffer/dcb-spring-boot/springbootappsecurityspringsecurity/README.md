#### Link

https://www.youtube.com/watch?v=tDZPdovCH4I

https://bcrypt-generator.com/

Welcome@123
Rounds : 12

insert into dev.user(id,username,password,role) 
values(1,'admin','$2a$12$q/rAMOpA1zzUHjVyp9bb2eEWRWgCiMguvg.RtJGzrVkBAR8NlOAQ2','ADMIN');
insert into dev.user(id,username,password,role) values(2,'user','$2a$12$RRbhhOt.7N77deHhTlhPH.1tD4s4EajZlBw5ytXtUZTPkmnZWzaD.','USER');

username : user
password : Welcome@123

GET
Auth : Basic Auth
http://localhost:8080/admin
username : admin
password : Welcome@123
Response Body:
This is Admin Page

GET
Auth : Basic Auth
http://localhost:8080/home
username : user
password : Welcome@123
Response Body:
This is Home Page