POST
http://localhost:9091/couponapi/coupons
Request Body:
{
"code":"SUPERSALE",
"discount":10,
"expDate":"01/01/2023"
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