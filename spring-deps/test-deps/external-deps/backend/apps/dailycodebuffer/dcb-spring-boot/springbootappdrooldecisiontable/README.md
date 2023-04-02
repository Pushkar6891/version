# spring-drools-decision-table
Drools - Rule Engine Decision Table

https://www.youtube.com/watch?v=OMOvUjxOQkc
https://github.com/Java-Techie-jt/drools-decision-table

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
    "discount": 15,
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
    "discount": 20,
    "price": 200000
}