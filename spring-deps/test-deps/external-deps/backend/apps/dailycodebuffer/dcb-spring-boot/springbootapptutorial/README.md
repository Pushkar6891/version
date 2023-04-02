# Springboot-Tutorial
Springboot-Tutorial

Link:
https://www.youtube.com/watch?v=c3gKseNAs9w
Github
https://github.com/shabbirdwd53/Springboot-Tutorial
# API
POST
http://localhost:8082/
O/P:
Welcome to Daily Code Buffer!!

POST
http://localhost:8082/departments
Request Body:
{
    "departmentName": "Blackrock",
    "departmentAddress": "USA",
    "departmentCode": "BLK"
}
Response Body:
{
    "departmentId": 1,
    "departmentName": "Blackrock",
    "departmentAddress": "USA",
    "departmentCode": "BLK"
}

GET
http://localhost:8082/departments
Response Body:
[
    {
        "departmentId": 1,
        "departmentName": "Blackrock",
        "departmentAddress": "USA",
        "departmentCode": "BLK"
    }
]

GET
http://localhost:8082/departments/1
Response Body:
[
    {
        "departmentId": 1,
        "departmentName": "Blackrock",
        "departmentAddress": "USA",
        "departmentCode": "BLK"
    }
]

PUT
http://localhost:8082/departments/1
Request Body:
{
        "departmentName": "BlackStone",
        "departmentAddress": "USA",
        "departmentCode": "BLK"
}
Response Body:
{
    "departmentId": 1,
    "departmentName": "BlackStone",
    "departmentAddress": "USA",
    "departmentCode": "BLK"
}

DELETE
http://localhost:8082/departments/1
Response Body:
Department deleted Successfully!!

GET
http://localhost:8082/departments/name/BlackStone
Response Body:
{
    "departmentId": 1,
    "departmentName": "BlackStone",
    "departmentAddress": "USA",
    "departmentCode": "BLK"
}


