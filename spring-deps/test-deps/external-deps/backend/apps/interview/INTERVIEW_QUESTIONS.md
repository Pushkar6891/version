# Caching

````
* Have you worked on Caching?
* Which Cache you have implemented in your project?
* Why used Caffeine Cache in your project and Why not any other cache?
* How you have implemented Caching in your project?
````

````
WAP to implement LRU Cache?
````

# Coding Questions

### CodingQues001
````
WAP to group the words according to letter
repetition.
eg: abc aabc abbc bac bbac baac cab caab cabb aabbc
o/p:    
abc,bac,cab
aabc,abbc,bbac,baac,caab,cabb
aabbc
````

### CodingQues002
````
WAP : We have a list of fruits, you need to print the fruit name along-with number of times it has occurred in list.
In above question what will happen if you replace List with an Array of String
How will you handle if the list has 10 million records
* to handle large dataset, split the dataset and use threads
* for multithreaded environment use ConcurrentHashMap
* atomic variable to avoid threading getting same value
* Complexity
````

### CodingQues003
````
WAP : Count the number of Occurrences of Each Word in a String array
(First array and then switched to List)
* In array iteration via for loop and List use iterator
* Use HashMap
* Complexity
````

### CodingQues004
````
WAP to print list of duplicates in an array
````

### CodingQues005
````
WAP to print yes or no, if all alphabets present in String
````

# Collection
````
new HashMap<>() vs new ConcurrentHashMap<>() vs Collections.synchronizedMap(new HashMap<String, Integer>())
````

````
HashMap complexity best case and worst case
````

````
What is ConcurrentHashMap in Java?
How ConcurrentHashMap internally works in Java? 
Why not use any other collection? 
What is complexity of ConcurrentHashMap?
What is segment in ConcurrentHashMap?
Reentrant lock?
How are locks acquired?
Where is lock acquired in ConcurrentHashMap?
````

````
How HashMap works in Java?
````

````
How HashSet works in Java?
````

# Concurrency, Multithreading and Parallel Computing
````
If multiple read operations exist and one write operation then which data structure to use?
````

````
Are member variables thread-safe in Java?
Ways to create Threads in Java?
Create Thread using Lambda Expression?
How to use variables inside run methods?
Use of synchronized keyword?
What are new API in java.util.concurrency package and its use?
synchronized block vs synchronized method?
object level lock vs class level lock?
````

# Core Java
````
How to clone an Employee class object?
What is deep copy?
What are marker interfaces?
Given a List of Integer, Sort it using streams.
map() vs forEach() in Streams
put vs putIfAbsent vs computeIfabsent in HashMap?
When do we use TreeSet and HashSet?
Can we override static methods in Java?
ConcurrentModificationException?
````

# Data Structures
````
Data structure (Tree, Stack, Queue)
````

# Exception Handling
````
throw vs throws
CheckedException vs UncheckedException
try-catch-block
try-catch-finally
try-with-resources
Custom Exception Handling?
````

# Immutability
````
How to create a custom immutable class in Java?
Why custom immutable class is marked as final?
````

# Kafka
````
What is partition and consumer offset in Kafka?
How to implement same?
````

# Miscellaneous
````
What is HATEOAS?
````

# OOPS
````
OOPS concepts (Polymorphism, Encapsulation, Wrapper classes)
Polymorphism (Overloading vs Overriding)
````

# Principles
````
What are SOLID Principles?
What is L in SOLID Principles?
````

# Spring Boot
````
Why we use Spring Boot?
What are its advantages and disadvantages?
````

# SQL
````
Two tables : DepartmentDetails and EmployeeDetails
* Write a SQL to display employee info with department name.
* Find Second-highest salary from Employee table
* Find Second-highest salary from Employee table in each department
* We have Department and in that we have HR.now get all the employee which are not HR.--->----->join on bases of departmentId and where department is NULL oR NOT NULL based on situation.
````

````
Two tables : Student(s_id, s_name), Exam(e_id,s_id,exam_subject,exam_marks)
* Write a SQL to find student information who haven't appeared for english exam.
````

````
* Write a SQL to find top 2 salaries in Employee table.
* Write a SQL to find top 2 salaries in each Department.
````

````
How indexes are implemented in table?
````

# String
````
Why String is immutable in Java?
````