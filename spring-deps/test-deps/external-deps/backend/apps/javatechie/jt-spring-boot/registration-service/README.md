# Parent

This project contains angular, java code.

## API Reference

#### POST

```
http://localhost:9090/register

Request Body:
{
	"name":"Pushkar Chauhan",
	"email":"pushkarchauhan91@gmail.com",
	"experience":7,
	"domain":"Java"
}

Response Body:
Hi Pushkar Chauhan your Registration process successfully completed
```

#### POST

```
http://localhost:9090/register

Request Body:
{
	"name":"Ankit Vaishnav",
	"email":"ankit@gmail.com",
	"experience":8,
	"domain":"JavaScript"
}

Response Body:
Hi Ankit Vaishnav your Registration process successfully completed
```

#### POST

```
http://localhost:9090/register

Request Body:
{
	"name":"Bharath Sharma",
	"email":"bharath@gmail.com",
	"experience":10,
	"domain":"Python"
}

Response Body:
Hi Bharath Sharma your Registration process successfully completed
```

#### GET

```
GET http://localhost:9090/getAllUsers
GET http://localhost:9090/findUser/pushkarchauhan91@gmail.com
GET http://localhost:9090/findUser/ankit@gmail.com
GET http://localhost:9090/findUser/bharath@gmail.com
```

#### DELETE
```
DELETE http://localhost:9090/cancel/1
DELETE http://localhost:9090/cancel/2
DELETE http://localhost:9090/cancel/3
```