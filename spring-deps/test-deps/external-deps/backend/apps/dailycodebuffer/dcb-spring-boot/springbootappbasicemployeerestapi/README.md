GET select all employees
GET select an employee
POST create an employee
PUT  update an employee
DELETE delete an employee

http://localhost:8080/h2

1. POST
http://localhost:8080/employees/
{
	"fname":"Virat",
	"lname":"Kohli",
	"salary":1000.0,
	"grade":"A"
}
http://localhost:8080/employees/
{
	"fname":"Mahendra",
	"lname":"Dhoni",
	"salary":500.0,
	"grade":"B"
}
http://localhost:8080/employees/
{
	"fname":"Shikhar",
	"lname":"Dhawan",
	"salary":200.0,
	"grade":"C"
}

2. GET (All Employees)
http://localhost:8080/employees/

3. GET (An Employee)
http://localhost:8080/employees/1/
http://localhost:8080/employees/2/
http://localhost:8080/employees/3/
http://localhost:8080/employees/4/
http://localhost:8080/employees/5/

4. PUT (Update Employee)
http://localhost:8080/employees/
OLD:
{
        "id": 5,
        "fname":"Virat",
		"lname":"Kohli",
		"salary":1000.0,
		"grade":"A"
}
Body NEW:
{
        "id": 5,
        "fname":"Virat",
		"lname":"Kohli",
		"salary":1500.0,
		"grade":"A"
}

5. DELETE (Delete an Employee)
http://localhost:8080/employees/5/