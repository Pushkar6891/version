# API

#### GET
```
http://localhost:8081/flightservices/flights?from=AUS&to=NYC&departureDate=02-05-2022
http://localhost:8081/flightservices/flights/1
http://localhost:8081/flightservices/flights/2
http://localhost:8081/flightservices/flights/3
http://localhost:8081/flightservices/flights/4
```

#### POST
```
http://localhost:8081/flightservices/reservations
{
	"flightId":1,
	"passengerFirstName":"Pushkar",
	"passengerLastName":"Chauhan",
	"passengerMiddleName":"Singh",
	"passengerEmail":"pushkarchauhan91@gmail.com",
	"passengerPhone":"9826396465",
	"cardNumber":"123",
	"expirationDate":"02-05-2023",
	"securityCode":"123"
}
```

#### GET
```
http://localhost:8081/flightservices/reservations/1
```

#### PUT
```
http://localhost:8081/flightservices/reservations
{
	"id":1,
	"checkIn":true,
	"numberOfBags":2
}
```	
