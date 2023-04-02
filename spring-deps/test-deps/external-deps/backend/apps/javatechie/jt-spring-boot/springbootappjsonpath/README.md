# spring-jsonpath-example
How to parse json using jsonPath


https://www.youtube.com/watch?v=F1jnqLdaYME

https://jsonpath.com

JSONPath
$.Countries[:].Country
[
"India",
"Nepal"
]

$.Countries[:1].Country
[
"India"
]

$.Countries[:2].Country
[
"India",
"Nepal"
]

API:
http://localhost:9090/getCountryNames
http://localhost:9090/getCountries