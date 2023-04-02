# spring-drools
How to integrate Spring With Drool engine

https://www.youtube.com/watch?v=UuZ7pZ_1JDE
https://github.com/Java-Techie-jt/spring-drools

POST:
http://localhost:8080/order
Request Body:
{
	"name":"Mobile",
	"cardType":"HDFC",
	"price":11000
}
Response Body:
{
    "name": "Mobile",
    "cardType": "HDFC",
    "discount": 10,
    "price": 11000
}

POST:
http://localhost:8080/order
Request Body:
{
	"name":"Mobile",
	"cardType":"HDFC",
	"price":11000
}
Response Body:
{
    "name": "Mobile",
    "cardType": "HDFC",
    "discount": 10,
    "price": 11000
}

POST:
http://localhost:8080/order
Request Body:
{
	"name":"Mobile",
	"cardType":"ICICI",
	"price":16000
}
Response Body:
{
    "name": "Mobile",
    "cardType": "ICICI",
    "discount": 8,
    "price": 16000
}

POST:
http://localhost:8080/order
Request Body:
{
	"name":"Mobile",
	"cardType":"DBS",
	"price":200000
}
Response Body:
{
    "name": "Mobile",
    "cardType": "DBS",
    "discount": 15,
    "price": 200000
}
