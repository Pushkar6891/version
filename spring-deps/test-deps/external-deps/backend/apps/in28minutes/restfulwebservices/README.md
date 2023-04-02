### Hello

#### GET

```
http://localhost:8081/hello
http://localhost:8081/hellobean
http://localhost:8081/hellobean/path-variable/Pushkar Chauhan
```

### Todo

#### GET

```
http://localhost:8081/users/pushkar/todos
http://localhost:8081/users/pushkar/todos/1
```

#### POST

```
http://localhost:8081/users/pushkar/todos
Request Body:
 {
        "username": "Vikas",
        "description": "Learn about Ride Bicycle",
        "done": true,
        "targetDate": "2021-09-18T18:30:00.000+00:00"
 }
 Response Body:
 201 Created
```

#### PUT

```
http://localhost:8081/users/pushkar/todos/7
Request Body:
 {
        "id": 7,
        "username": "Vikas",
        "description": "Learn about Ride Bicycle again",
        "done": true,
        "targetDate": "2021-09-18T18:30:00.000+00:00"
 }
 Response Body:
 200 OK
 {
    "id": 7,
    "username": "Vikas",
    "description": "Learn about Ride Bicycle again",
    "done": true,
    "targetDate": "2021-09-18T18:30:00.000+00:00"
}
```

#### DELETE

```
http://localhost:8081/users/{username}/todos/1
```

### JWT AUTHENTICATON

#### POST
```
http://localhost:8081/authenticate
 {
        "username": "pushkar",
        "password": "pushkar"
 }
 Response Body:
 {
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwdXNoa2FyIiwiZXhwIjoxNjMyMzE1MTU2LCJpYXQiOjE2MzE3MTAzNTZ9.-8zM1FlEiI_ujkdXOmQSRPTUdrwoP0UN9zHRooMCL0ijRioqWjWj10pl_Am6dCDC_CrZOnVu973iuqB0WJ8e5w"
}
```

#### GET

```
http://localhost:8081/users/pushkar/todos/2
Authorization
Type : Bearer
eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwdXNoa2FyIiwiZXhwIjoxNjMyMzE1MDQ1LCJpYXQiOjE2MzE3MTAyNDV9.7rrCm53NQ22B9i3ymkkw5cYaH4oyNS-nXvrLPOaAjK68eESnI93teB0oLAxQboN2mfzQ61gQ13k-8m3GeKPt_Q
```

#### H2 Console

```
http://localhost:8081/h2-console
```