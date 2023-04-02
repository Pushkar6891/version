
Design Pattern

- Industry Standard Approach to solve recurring problem
- Re-usability, Robust, Maintainable, Easy to Understand, Debug, Faster Development Code
- Creational (Ways to create object in loose couple manner, avoid code duplication)
1. Singleton (one and only one instance per JVM, private constructor, create private static variable of same class, provide static global access point for access)
2. Factory ()
3. Abstract Factory
4. Builder
5. Prototype
- Structural (How Class + Object combine to form large structure)
1. Adapter
2. Bridge
3. Decorator
4. Facade
5. Composite
6. Proxy
7. Flyweight
- Behavioural (Better interaction between Objects or Classes in Loose Couple manner)
1. Chain of Responsibility
2. Template Method
3. Observer
4. Strategy
5. Mediator
6. Command
7. State
8. Visitor
9. Interpreter
10. Iterator
11. Memento
- J2EE / Miscellaneous

1. Singleton
- Eager Initialization (not thread safe, instance is created even before we use, we cannot handle exception)
- Lazy Initialization (not thread safe, instance is created only when we invoke getInstance)
- Static block Initialization (not thread safe, instance is created even before we use, we can handle exception)
- Thread Safe Singleton (synchronized block + double check lock)(we create class level lock by declaring getInstance() as "static synchronized", one thread per method allowed, this reduces performance cost and overhead, synchronized block + "double check locking" )
- Bill Pugh Singleton (HolderClass)(thread safe, lazy loaded)
- Reflection (enum)(enum does not allow lazy initialization, enum only allows eager initialization, enum is instantiated once globally)
- Serialization (readResolve())(Distributed Systems use Serialization, use readResolve())
- Cloning (clone() throw new CloneNotSupportedException())
- Eg in JDK (java.lang.Runtime -> Eager Loading, java.awt.Desktop -> static synchronized, java.lang.System)
- Logging
- Caching
- ThreadPool

2. Factory
- Code for interface than implementation
- Move instantiation to Factory Class
- Robust, Loose Couple, Easy to extend,
- Eg in JDK 
- java.util.Calendar getInstance()
- DriverManager getConnection()
- Class.forName()

3. Abstract Factory

4. Builder
- When object contains lots of attributes, hard to maintain sequence of argument
- Some parameters may be optional
- Heavy Object
- Eg in JDK
- StringBuffer append()
- StringBuilder append()
- StreamBuilder

5. Prototype
- When expensive object creation
- uses cloning
- Eg in JDK
- clone() java.lang.Cloneable
- Caching (Not Real Time Call to DB but call to Cache)

1. Adapter
- Two unrelated interface can work together
- Mobile Charger (3V Battery <-> MobileAdapter <-> 240Volt WallSocket)
- Eg in JDK
- Arrays.asList(var args..)
- InputStreamReader(InputStream)
- OutputStreamReader(OutputStream)
**JAXB converts Java Object to XML (marshall)**
**JAXB converts XML to Java Object (unmarshall)**

2. Composite
- When we have to represent part out of whole hierarchy

3. Proxy




























