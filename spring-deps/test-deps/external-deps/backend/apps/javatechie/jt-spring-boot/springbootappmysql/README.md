# Spring-boot-mysql
How to configure mysql with  spring boot

POST:
http://localhost:9191/ticket/bookTickets
[
    {
        "amount":200,
        "category":"movie"
    },
    {
        "amount":500,
        "category":"fair"
    },
    {
        "amount":1000,
        "category":"travel"
    }
]

GET:
http://localhost:9191/ticket/getTickets
