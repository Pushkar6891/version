create database employeemanagementsystem;

POST
http://localhost:8081/api/employees

{
    "firstName":"Pushkar",
    "lastName":"Chauhan",
    "email":"pushkarchauhan91@gmail.com"
}

GET
http://localhost:8081/api/employees

GET
http://localhost:8081/api/employees/2

PUT
http://localhost:8081/api/employees/2
{
"firstName": "Pushkar2",
"lastName": "Chauhan2",
"email": "pushkarchauhan91@gmail.com"
}
O/P:
{
"id": 2,
"firstName": "Pushkar2",
"lastName": "Chauhan2",
"email": "pushkarchauhan91@gmail.com"
}

DELETE
http://localhost:8081/api/employees/2
Employee deleted successfully!
