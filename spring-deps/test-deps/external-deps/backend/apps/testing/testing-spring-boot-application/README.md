# API

# powermock-jacoco-coverage

This is a example project which shows how to get code coverage using powermock.

Jacoco and powermock don't work well , so in order to get coverage we can use offline version of jacoco.

clone project

<b>run command</b>

mvn clean install sonar:sonar

#### POST

```
http://localhost:8081/springboot/employees/employee
{
	"firstName":"narendra",
    "lastName":"modi",
	"email":"narendra.modi@yahoo.com",
	"salary":"10",
	"address":{
		"pincode":"110092",
		"city":"New Delhi",
		"state":"Delhi",
		"country":"India"
	},
	"gender":"MALE"
}
```

#### POST

```
http://localhost:8081/springboot/employees
[
    {
        "firstName":"ankit",
        "lastName":"jain",
        "email":"ankit.jain@yahoo.com",
        "salary":1000.00,
        "department": "HR",
        "dob": "1991-06-08T10:34",
        "address":{
            "pincode":"110092",
            "city":"New Delhi",
            "state":"Delhi",
            "country":"India"
        },
        "gender":"MALE",
        "active":true
    },
    {
        "firstName":"rajat",
        "lastName":"verma",
        "email":"rajat.verma@yahoo.com",
        "salary":5000.00,
        "department": "Sales",
        "dob": "1998-01-10T10:34",
        "address":{
            "pincode":"110090",
            "city":"New Delhi",
            "state":"Delhi",
            "country":"India"
        },
        "gender":"MALE",
        "active":true
    },
    {
        "firstName":"pooja",
        "lastName":"chauhan",
        "email":"pooja.chauhan@gmail.com",
        "salary":8000.00,
        "department": "HR",
        "dob": "1980-01-02T10:34",
        "address":{
            "pincode":"452016",
            "city":"Indore",
            "state":"Madhya Pradesh",
            "country":"India"
        },
        "gender":"FEMALE",
        "active":true
    },
    {
        "firstName":"aishwarya",
        "lastName":"sharma",
        "email":"aishwarya.sharma@rediff.com",
        "salary":6000.00,
        "department": "IT",
        "dob": "2001-09-11T10:34",
        "address":{
            "pincode":"119992",
            "city":"Kolkata",
            "state":"West Bengal",
            "country":"India"
        },
        "gender":"FEMALE",
        "active":true
    },
    {
        "firstName":"arun",
        "lastName":"joshi",
        "email":"arun.joshi@yahoo.com",
        "salary":9000.00,
        "department": "HR",
        "dob": "1994-08-08T10:34",
        "address":{
            "pincode":"110011",
            "city":"New Delhi",
            "state":"Delhi",
            "country":"India"
        },
        "gender":"MALE",
        "active":true
    }
]
```

#### GET

```
http://localhost:8081/springboot/employees/1
http://localhost:8081/springboot/employees/2
```

```
http://localhost:8081/springboot/employees
```

```
http://localhost:8081/springboot/employees/searchEmployee?email=ankit.jain@yahoo.com
http://localhost:8081/springboot/employees/searchEmployee?email=pooja.chauhan@yahoo.com
```

#### PUT

```

```

#### DELETE

```
http://localhost:8081/springboot/employees
```

```
http://localhost:8081/springboot/employees/deleteEmployee/1
http://localhost:8081/springboot/employees/deleteEmployee/3
```

```
http://localhost:8081/springboot/employees/deleteEmployeeByName/arun
```


