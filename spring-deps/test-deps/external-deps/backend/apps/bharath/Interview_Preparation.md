# Course : Core Java Made Easy
Static and Non-Static Members : Blocks, Fields, Methods
Data Types, Literals, Type Conversion
Wrapper Classes
Operators and Assignments
Flow Control and Looping
Access Modifiers
Packages
OOPS : Abstraction, Encapsulation, Inheritance, Polymorphism
Exception Handling
Multi Threading
Garbage Collection
Inner Classes
String Handling
Input/Output Streams
Collections with Generics
Enums
Java 8
JVM Architecture
Interview Questions

Fundamental Courses :
Core Java Made Easy
JDBC, Servlets and JSP
Spring :
Spring Framework in easy Steps
Spring Boot Fundamentals
Spring Data JPA using Hibernate
Specialization :
Java Web Services Part 1 and Part 2
Java Messaging Services 
Spring Data REST
Spring Cloud Fundamentals
Spring Security
Testing :
JUnit and Mockito
Maven
Java Design Patterns
Cloud :
Git
Maven
Gradle
AWS (EC2, Elastic Bean Stalk)
Docker (Docker Compose)
Kubernetes

Log4j Vulnerability
Dependency Injection
Spring MVC
Object Class Methods
Immutable Class : StringHandling -> immutable -> MyImmutable
Deep Clone vs Shallow Clone
String Class
String (immutable) vs StringBuffer (Synchronized) vs StringBuilder (Mutable and Non Synchronized)
How HashMap works in Java
Serialization and Deserialization
How to break Singleton
Checked vs Unchecked Exception
Recursion
Fail Fast vs Fail Safe
Producer Consumer
JMS vs Kafka vs Rabbitmq
Anonymous inner class vs Lambda
NoClassDefFound vs ClassNotFoundException
Transient

Java 8 Features :
default method in interface
static method in interface
functional interface
lambda expression
method reference
java.util.function (Predicate, Consumer, Supplier, Function)
stream : intermediate + terminal operation

Java 9 Features :
Private method in interface
static Private method in interface
Try with Resources
Immutable Collection : List.of(),Set.of(),Map.of() java.lang.UnsupportedOperationException
@SafeVarargs can be used on private methods 
Stream API improvements : takeWhile(), dropWhile(), ofNullable()
Modules
HTTP2
Custom Linking Libraries
JShell

Java 10 Features :
variables can be defined using : var (supports Type Inference)
- var cannot be null
- var cannot be assigned for Lambda
- var cannot be used at class level
Collectors API Update :
toUnmodifiableList
toUnmodifiableSet
toUnmodifiableMap

Java 11 Features :
String API Updates :
- strip() stripLeading() stripTrailing() repeat("-")
File API Updates :
- Files.writeString()
isEmpty in Optional

Java 12 Features :
String API Updates:
-indent() transform()
NumberFormat.getCompactNumberInstance()
Unicode (chess characters)
Teeing Method
Switch Expression (preview)
GC improvements

Java 13 Features :
Text Blocks
Switch Expressions (no break, yield to return value)
Helpful Nullpointers
Records (Simplified Java Beans better than class)

Java 14 Features :

Java 15 Features :
Sealed Classes (preview)
Sealed Interface

Java 16 Features :
instanceof Pattern Matching (str instanceof String)
Stream
- toList() toSet()
Records
- can be used in inner class

Java 17 Features :
Sealed Class
RandomGeneratorFactory
Pattern Matching Switch
Deserializing Filters

###############################################################
JDK = JRE + JVM
Compiler .java -> .class or bytecode -> (JIT compiler) machine code

Java is platform independent (bytecode)

OOP (Object Oriented Programming)
- ATM (Customer and Bank interact)
- names, properties/attributes and functionality/behaviour

Online Shopping
- Address, Customer, Order, Payment, Product
Hospital Management
- Patient, Doctor, Billing, Appointment

OOPS :
- Abstraction (Eg : Interfaces and Abstract Class, Car, TV, Laptop, Mobile, Exposing public interfaces)
- Encapsulation (Protecting Properties and Functionality of an Object from other Object. Eg : Class)
- Inheritance (Code re-usability, IS-A Relationship, Defining new object with help of an existing object, Accessing and Updating an existing Object Functionality)
- Polymorphism (Multiple Behaviour at different times : Method Overloading and Method Overriding)

Building blocks of Java Program
Variables, Blocks, Methods, Class
Variables point to memory location where data is stored.
**Non-Static / Object Variables : Account Number, Balance, accountBalance(), withdrawal()
Static / Common across Objects Variables : Bank Name, interest()**

###############################################################
Static Context : Class Level Context
- No Object needs to be created
- Static Methods should be invoked using ClassName.
- Static Variables are common across Class.

Local Variables (defined in method) are stored in Stack.
Global Variables stored in Heap.
###############################################################
Non-Static Context (Stored in Heap or Method Area)
Variables, Methods, Blocks, Constructor.
Initialize Non-Static Variables using Constructor.
###############################################################
Static will be executed only when Class is loaded.
Non-Static blocks and Constructor is executed whenever Object is created.
###############################################################
this refers to objects reference or current object's members address in memory
this cannot be used in static context.
###############################################################
Data Type
Primitive Data Type
byte 1
short 2
int 4
long 8
float 4
double 8
char 2
boolean true/false
Reference Data Type
class
Array
String
Implicit Type Casting (lower to higher)
Explicit Type Casting (higher to lower)
Reference Type Casting
Identifier : name of class, method and variables
###############################################################
Wrapper Classes : Primitive to Object Type
Primitive : byte, short, int, long, float, double, char, boolean
Wrapper : Byte, Short, Integer, Long, Float, Double, Character, Boolean

Primitive to Object : Boxing    Integer integer = Integer.valueOf(10)
Object to Primitive : Unboxing  int i = integer.intValue()
Primitive to String             String str = Integer.toString(10)
String to Primitive             int i = Integer.parseInt(str)
Object to String                String str = Integer.valueOf(10).toString()
String to Object                Integer integer = Integer.valueOf(str)
###############################################################
Operators :
Arithmetic(+ - * / %)
Assignment (=)
Bitwise (& | ^)
Comparison/Relational <= >= < >
Short Circuit (&& better than & will improve performance it will not evaluate second operator)
Ternary Operator exp1 ? exp2 : exp3
**Operator Overloading : only + operator is overloaded in java**
###############################################################
Flow Control Statements
Selection : if-else, switch
Iterative : while, do-while, for, for-each
Transfer : break, continue (skip iteration), return, try-catch-finally, assert
**use break in switch statements**
**switch fall through : two case have common logic**
###############################################################
Access Modifiers
**Default is package level access modifier**
access modifiers : public, private, protected, package
###############################################################
Packages
java.lang (implicitly )
java.util
java.io
com.company.controller
com.company.service
com.company.entities
com.company.dto
###############################################################
Inheritance
Single Inheritance (Parent extends Object)
Multi Level Inheritance (Audi extends Car) (Car extends Vehicle)
(Parent is instantiated first by JVM then Child is instantiated)
Hierarchical Inheritance

super keyword
Employee : Developer, Tester, Manager
###############################################################
Abstract : Theoretical not Practical / not implemented
Abstract Class (Partial Abstraction)
Interface (Complete Abstraction)
**Marker Interface (no method definition) : Cloneable, Serializable, RandomAccess (used by ArrayList) **
**interface methods by default : public abstract**
**interface variables by default : public static final so variables must be initialized**
interface vs abstract class
**final vs abstract**
one abstract method then class becomes abstract
we cannot use both final and abstract to a class, method
final class cannot have abstract method
abstract class can have final method
###############################################################
Polymorphism
Compile Time / Static Binding / Method Overloading
Runtime Time / Dynamic Binding / Method Overriding (same signature parent-child macbookPro,macbookAir start() shutdown() )
(we can switch implementation at runtime)
interface : specification
class : implementation
- interface support multiple inheritance
- interface support complete abstraction(List -> ArrayList LinkedList)

Upcasting -> Child to Parent -> Parent parent = new Child()
Downcasting -> Parent to Child -> byte b = (byte) i

Auto Promotion int -> float, int -> long
**Most specific Child class version is invoked in inheritance**
**We can have main method in abstract class - true**
###############################################################
Encapsulation
Binding attribute and behaviour in a class and exposing getter and setter
Security
Easy Enhancement;

private data members and public methods
###############################################################
Exception Handling
###############################################################
Multi Threading
###############################################################
Garbage Collection
Unreachable objects are cleaned up on Heap Memory
A a = new A();
a = null; 
**finalize() method should be overridden and implicitly invoked by gc only when it runs out of memory not always**
**use try with resources**
**System.gc() -> request for garbage collection thread but not always**
###############################################################
String
java.lang.String
String is immutable : String content cannot be changed because :
1. performance reusability (string pooling)
2. thread safety (two threads can use same string value they cannot change each other values)
Ways to create String :
- String Literal
- String Constructor
- initialize char[]
- initialize byte[]
**Strings and Wrapper Objects are treated differently by JVM**
###############################################################
Arrays are static (cannot change their size)
Collections are dynamic (can change their size)
**Use Enhanced For Loop in case of Array to avoid index**
###############################################################
Object Class Methods:
equals hashcode toString finalize wait wait wait notify notifyAll
hashcode : HashMap and HashSet uses hashcode to store object in a bucket
HashMap retrieves object values based on their hashcode.
We should override hashcode method else jvm by default uses objects address as the hashcode.
equal objects must have equal hashcode
**String StringBuffer Wrapper classes override equals method they do not use == for equality check**
###############################################################
Collections with Generics
List : ArrayList LinkedList
Set : HashSet TreeSet NavigableSet
Comparable
Comparator
Map : HashMap LinkedHashMap TreeMap IdentityHashMap WeakHashMap
Queue : PriorityQueue
Arrays
Type Erasure
###############################################################
Concurrent Collections (introduced in 1.5)
- CopyOnWriteArrayList
- CopyOnWriteArraySet
- ConcurrentHashMap
- BlockingQueue (put and take)
ConcurrentHashMap vs SynchronizedHashMap
They do not throw ConcurrentModificationException
(while iterating you cannot add/delete items from collection : list
modifications are done on clone object)
###############################################################
Enums (1.5)
Group of named constants introduced in Java 1.5
Enum is internally represented as a class
All enum extends from java.util.Enum
enum values are public static and final
values and ordinal() -> shows position
enum can have getter method, constructor
Enum cannot extend another class
###############################################################

###############################################################
JVM Architecture
Virtual Machine - VMWare, JVM, CLR(Common Language Runtime used in .Net)
JVM Components
- Class Loader : Application CL (classpath) -> Extension CL (ext/*.jar) -> Bootstrap CL (jre/lib/rt.jar)
- Memory Areas : 
1. Method Area
2. Heap Area
3. Stack Area 
4. PC Register 
5. Native Method Stacks
- Execution Engine :
- Java Native Interface JNI : 
- Native Method Libraries
###############################################################
i18N or Internationalization
Supporting multiple languages and formats that are local to area.
###############################################################
Java Annotations (Java 1.5)
@Entity @Table @Id @ToString @Data @AllArgsConstructor
@NoArgsConstructor @Override @Deprecated @SuppressWarnings
JUnit : @Before @After @BeforeEach @AfterEach @Test
###############################################################
Reflection API
- Using Reflection we can Inspect and Modify behaviour of a class dynamically at RunTime
- Access private methods
- Spring, Hibernate, JUnit uses reflection
###############################################################
Regular Expression
- Validate Email, Mobile Number using Combinator Design Pattern
###############################################################
Interview Questions
JDK(javac java)-> JRE(rt.jar)
bytecode -> JVM (JIT Compiler) -> Machine Code -> OS

Constructor
method to initialize properties of object
same name as class name
invoked when object is created
super() to invoke Parent class constructor

Method Overloading / Compile Time Polymorphism
Method Overriding / Run Time Polymorphism
A a = new B()
a = new C()
a.run();

final vs finally vs finalize
final : class cannot be inherited, variable cannot be changed, method cannot be overridden
finally : invoked always in case of try-catch
finalize : invoked by garbage collector

Generics
Type of data going into Collection
Type Erasure : Erasing type checking on Runtime 

== vs equals
== shallow comparison, 
obj1.equals(obj2) : String, Wrapper deep comparison

Java Class Loader
main() System Application, Extension, Bootstrap Class Loader

serialVersionUID
java.io.InvalidClassException
Every class implementing Serializable must have serialVersionUID
JVM implicitly assigns a default serialVersionUID
private static final long serialVersionUID = 1L (cannot be inherited)
###############################################################
Socket Programming (java.net package)
Client - Server
###############################################################
JUnit 4 and JUnit 5
Report Generation Charts
###############################################################
Maven (settings.xml toolchains.xml)
Convention over Configuration
Just have to maintain a folder structure
Plugin based architecture
surefire, failsafe, pom.xml
groupId artifactId version dependencies packaging(jar/war)
maven phases
m2e (maven to eclipse plugin)
###############################################################
Git
###############################################################
Jar
(create verbose filename)
java -cvf <jar-name>.jar .
java -tvf <jar-name>.jar
java -xvf <jar-name>.jar

Executable Jar
###############################################################
Debugging Fundamentals
- Breakpoints
- Step into, Step Over, Resume, Return, Call Stack, Variables, Watchpoint
###############################################################

# Course : Spring Boot Fundamentals
Problems with Spring
- XML based or Annotation based 
- Deployment
- Version Compatibility
# Spring Boot Features
Auto Configuration (Spring MVC : DispatcherServlet, ORM : No DataSource, Transaction Manager)
Spring Boot Starter Dependencies (Version Compatibility, Parent, Data JPA)
Embedded Tomcat / Jetty / Undertow (No external deployment)
Health Checks (Actuator info health metrics mappings)

@SpringBootApplication
- This class can have certain @Bean Definition
@EnableAutoConfiguration
- Scan Dependencies and Configure libraries based on classpath
@ComponentScan
- @Controller, @Service, @Component, @Repository and create beans

@SpringBootTest
- Load ApplicationContext




# Ways to initialize mocks in JUnit
https://mincong.io/2020/04/19/mockito-junit5/




