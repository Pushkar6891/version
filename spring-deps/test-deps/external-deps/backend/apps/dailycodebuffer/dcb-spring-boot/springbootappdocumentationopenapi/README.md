#### Link

https://www.youtube.com/watch?v=iaVBleTf88U&list=PLhfxuQVMs-nx3YQa3XJ9-4g_EoK0J8WhU&index=22

URL:
http://localhost:8081/swagger-ui/index.html

POST:
http://localhost:8081/book/
Request Body:
{
	"title":"Night in Call Center",
	"author":"Chetan Bhagat",
	"price":"500"
}
Response Body:
{
    "id": 1,
    "title": "Night in Call Center",
    "author": "Chetan Bhagat",
    "price": "500"
}

Request Body:
{
	"title":"Harry Potter",
	"author":"JK Rowling",
	"price":"1000"
}
Response Body:
{
    "id": 2,
    "title": "Harry Potter",
    "author": "JK Rowling",
    "price": "1000"
}

GET
http://localhost:8081/book/
Response Body
[
    {
        "id": 1,
        "title": "Night in Call Center",
        "author": "Chetan Bhagat",
        "price": "500"
    },
    {
        "id": 2,
        "title": "Harry Potter",
        "author": "JK Rowling",
        "price": "1000"
    }
]

GET
http://localhost:8081/book/2
Response Body:
{
    "id": 2,
    "title": "Harry Potter",
    "author": "JK Rowling",
    "price": "1000"
}

PUT
http://localhost:8081/book/
Request Body:
{
    "id":2,
	"title":"Harry Potter",
	"author":"JK Rowling",
	"price":"1500"
}
Response Body:
{
    "id": 2,
    "title": "Harry Potter",
    "author": "JK Rowling",
    "price": "1500"
}

DELETE
http://localhost:8081/book/2
Response:
200 OK


