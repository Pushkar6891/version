POST
http://localhost:9092/productapi/products
Request Body:
{
"name":"IPhone",
"description":"Awesome",
"price":1000,
"couponCode":"SUPERSALE"
}

GET
http://localhost:9091/couponapi/coupons/SUPERSALE
Response Body:
{
"id": 1,
"code": "SUPERSALE",
"discount": 10.000,
"expDate": "01/01/2023"
}