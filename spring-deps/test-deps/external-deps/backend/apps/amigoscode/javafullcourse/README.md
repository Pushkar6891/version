Amigoscode

Link :
https://www.youtube.com/watch?v=Qgl81fPcLc8&t=58s

JDK : Java Development Kit
JDK 1995
JDK 8 March 2014 LTS
JDK 11 Sep 2018
JDK 17 Sep 2021
JDK = JRE
JDK installation
Intellij Configuration
javac (.java) -> .class
java (.class) -> machine code

Variable Data Type 
Primitive (byte 1 short 2 int 4 long 8 float 4 double 8 boolean 1 char 2)
Reference (Object String WrapperClasses)

Primitive vs Reference Data Type
Naming Variables
String class

Operations:
Arithmetic, Math Class, Comparison (<,>,==,!=, <=, >=), Logical, Ternary (if(age>18)?adult:not adult))
Math.abs, Math.max, Math.min, Math.pow

numbers.fori
numbers.forr

Arrays.stream(numbers).forEach(System.out::println)
Enhanced For Loop
Scanner class

Microservices Design Patterns
J2EE Design Pattern
Core Java Design Pattern : Creational Structural Behavioural
--------------------------------------------------
SOLID Principles and Clean Code, Code Smell, Bug Fix, Code Refactoring,
Large Scale, Distributed Application
S Single Responsibility Principle
O Open Closed : Classes Open for extension and Closed for Modification
L Derived Class should be substitutable for Base Class
I Interface Segregation
D Dependency Inversion

S : One Class One Purpose No Excessive Functionality (No printer methods CSV, JSON, XML object)
O : Pass reference of interface to avoid rewriting the class itself
Shape
calculateArea()
Circle, Square
L
I : 
Shape -> area
3D Shape -> area, volume
Define separate interfaces, segregate rather than defining one large interface
You should not force classes to implement something what they cannot do
D : Code for interfaces. Focus on abstraction rather than concrete implementation
Inject the inteface dependency rather than concrete implementation
--------------------------------------------------
# Streams
--------------------------------------------------
# Kafka

--------------------------------------------------
# Threads
--------------------------------------------------
# Microservices
--------------------------------------------------
# Design Patterns
--------------------------------------------------
# System Design
--------------------------------------------------
# Data Structures and Algorithms
--------------------------------------------------

Domain
Technologies : Spring Boot
Non-Functional : Scalable, Reliable, Adaptable, Security
DevOps : Configure Azure Pipelines
Agile

Java Interview Help
--------------------------------------------------
JDK = JRE (JVM)
javac (.java) -> .class
jvm/JIT (.class) -> machine code -> os
JIT inlining

constructors?
Constructor is a method which is used to initialize properties of an object
Constructor has same name as class name
Constructor invoked once when object is instantiated
Constructor : super keyword 

Abstract Class vs Interface
If one abstract method then class needs to be marked as abstract class
Abstract method implementation must be provided by implementation class
accelerate() go() start() stop()

Why multiple inheritance not supported in java?
I1 (start) 
I2 (start)

Object class methods
wait notify cannot be overridden
hashCode equals clone toString finalize can be overridden

Default hashCode returns memory location for that object
Default toString : ClassName + @ + Hexa Decimal representation of object's address

Why String immutablity?
Once object is instantiated its state cannot be changed
String Pool values will be shared

equals vs ==
equals object content comparison, shallow comparison by default, deep comparison
== reference comparison, shallow comparison

String Wrapper Enums => Deep Comparison
equals overridden in String class

final finally finalize
final : variable constants
object reference cannot be changed
method cannot be overridden
class cannot be extended

finally
even when there is exception
try with resources

finalize
JVM invokes finalize for GC can remove objects from heap

generics
< 1.5
post 1.5
type erasure
compiler erases type of collection, post compilation checks are done successfully
For backward compatibility < 1.5
Compile Time Generics not Runtime Generics

--------------------------------------------------
Collection

List <- ArrayList
     <- LinkedList
     <- Vector

Set <- HashSet <- LinkedHashSet
    <- SortedSet <- TreeSet

Queue <- PriorityQueue
      <- BlockingQueue

Map <- Hashtable
    <- HashMap <- LinkedHashMap
    <- SortedMap <- TreeMap

ArrayList: uses array O(n) (Read Intensive)
LinkedList : uses doubly linkedlist (prev and next pointer) (Write Intensive)

Add     ArrayList O(n)  LinkedList O(1)
Access  ArrayList O(1)  LinkedList O(n)

--------------------------------------------------
Vector, Hashtable all methods are synchronized(Thread Safe) hence slow performance. one thread at a time
ArrayList not thread safe

HashMap
LinkedHashMap (maintains order)

HashMap capacity = 16
Load Factor = O(1) get put 0.75


