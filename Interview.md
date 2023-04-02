# Java is Verbose or Java Syntax is Verbose
Java is verbose compared to other languages, meaning that you have to write more (or a lot more) code to perform the same task as in another language.
Python : print("Hello World")

# Caching

Why char[] is preferred over String for storing passwords?
String is immutable
It's easy to print a String by mistake but not an Array
With arr[] we can erase all trace of the password in memory promptly and with certainty after it is used.
But the thing is that String objects can be intern()ed in theory and kept alive inside the constant pool. 
I suppose using char[] forbids this possibility.

Why avoid switch statement in java?
Switch Statement (avoid switch because if you forget to add break/continue/default it will cause bugs)

Algorithm sequence of steps to solve a computational problem

this points to current instance of the class

Streams are lazily loaded by JVM unless terminal operation
Streams cannot reused
Streams 

people.stream()
.filter(p->Gender.MALE.equals(p.getGender())
.collect(Collectors.toList())

people.stream()
.sorted(Comparator.comparing(Person::getAge))
.collect(Collectors.toList())

people.stream()
.sorted(Comparator.comparing(Person::getAge).reversed())
.collect(Collectors.toList())

people.stream()
.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
.collect(Collectors.toList())

people.stream()
.allMatch(p->p.getAge()>5)

people.stream()
.anyMatch(p->p.getAge()>5)

people.stream()
.noneMatch(p->"PUSHKAR".equals(p.getName())

people.stream()
.max(Comparator.comparing(Person::getAge))
.ifPresent(System.out::println)

people.stream()
.min(Comparator.comparing(Person::getAge))
.ifPresent(System.out::println)

// group
people.stream()
.collect(Collectors.groupingBy(Person::getGender))
.forEach((gender,people2)->people1.forEach(System.out::println))

people.forEach(System.out::println)
