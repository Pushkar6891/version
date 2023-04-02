#### Link

https://www.youtube.com/watch?v=lA18U8dGKF8

POST:
http://localhost:8083/authenticate
Request Body:
{
	"username":"admin",
	"password":"password"
}
Response Body:
{
    "jwtToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTYzMDUyMjgyNCwiaWF0IjoxNjMwNTA0ODI0fQ.ZoWOu6E-FIgORmp1V44dTFBXkDNfpqLAbXxPbsuaEQEq5hGVGfgcNuaGhteHGXdllcMNpd7qDEoAVCtgJpBatA"
}

GET:
http://localhost:8083/
Response Body:
Welcome to Daily Code Buffer!!