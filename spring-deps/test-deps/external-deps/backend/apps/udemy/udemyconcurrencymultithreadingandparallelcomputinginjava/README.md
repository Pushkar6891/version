Why Multithreading?

Better resource utilization and performance improvement.
Using too many threads slows down performance because switching between threads is expensive long operation.
Java is sequential programming language

Copying Directories from one to another in OS
Download images from internet
Watching YouTube videos
alt + control + delete = separate process is created

Process :
instance of program execution
Create process using processBuilder
Thread :
Thread is a lightweight process
Each thread in a process will share memory and resources.
Hence, we need to deal with concurrency.

Time Slicing
For a single core, if we are Sharing Processing Time among processes and threads is called time slicing.

Multi threading and Parallel Computing
Advantages of Multithreading:
Thread 1 : download images from internet
Thread 2 : IO Operation : read / write
Thread 3 : Heavy Mathematical Calculation
Disadvantages of Multithreading:
Thread manipulate data in same memory location, so we need to handle synchronization
Switching between thread is expensive if we have multiple threads

Thread Life Cycle
New
Runnable
Wait
Dead

Daemon Thread (Eg Garbage Collection these are helper threads, daemon thread run in background low priority
which smartwatch to pair)
Worker Thread (Main Thread, Child Threads)
Daemon threads may be interrupted by the JVM when all other worker threads finish execution

Inter-thread communication
Stack (local variables, method arguments, method calls, fast, small)
Heap (objects, slow, large)

Every Thread has its own Stack Memory but shared Heap Memory
Sharing resources without intervention using mutual exclusion (using synchronization)

Thread not doing same operation on same variable at same time
to avoid this we need synchronization

object level lock
we get monitor lock /intrinsic lock associated with object itself
public synchronized void increment(){
    counter++;
}
public void increment(){
    synchronized(this){
        counter++;
    }
}// if we have static variables we cannot use object level lock

class level lock
public synchronized void increment(){
    counter++;
}
public void increment(){
    synchronized(SomeClass.class){
        counter++;
    }
}
// dealing with intrinsic lock

use synchronized block over synchronized keyword
release and acquire intrinsic lock using wait and notify
Two threads acquiring same intrinsic lock
wait() Object, wait() can be interrupted, both wait() and notify() happen in synchronized block, wait() releases lock
sleep() Thread, sleep() cannot be interrupted, sleep() does not hold lock


Vector, Stack, HashTable -> synchronized
ConcurrentHashMap

ConcurrentHashMap vs synchronized HashMap
ConcurrentHashMap :
Better Performance, Faster Read Write
locking at bucket level
Does not throw ConcurrentModificationException
More scalable because supports concurrent read and write
High Concurrency, High Throughput, Low Response Time, Low Latency
HashMap:
Multiple Threads cannot access map concurrently
Throws ConcurrentModificationException
object level lock for each method

Concurrent Collections :

CountDownLatch
------------------------------------------------------------
synchronize tasks by forcing them to wait till operation is performed by other task.
Keeps reducing count
Cannot reset CDL
Divide a problem into N tasks and create CDL with value = N
Whe task finished countDown() is called
Download 

When all family members come then only we will start eating

Cyclic Barrier
------------------------------------------------------------
Assembly Point : We will get together then only drill will start

Lock
------------------------------------------------------------
Reentrant Lock Advantages:
We can get list of threads waiting for given lock
We can check if lock is held or not
We can prevent thread starvation by using lock fair
We do not need try-catch-finally block

synchronized : at a time only one thread permitted to perform an operation
this -> used in object level locking
notify() -> does not notify other thread immediately

