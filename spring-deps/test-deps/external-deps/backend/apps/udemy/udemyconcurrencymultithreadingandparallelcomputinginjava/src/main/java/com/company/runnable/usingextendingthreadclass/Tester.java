package com.company.runnable.usingextendingthreadclass;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new MyTask1();
        Thread t2 = new MyTask2();
        t1.start();
        t2.start();
    }
}
// Parallelism : each thread runs on different CPU cores
// Multithreading : 2 threads run on single cpu core with help of time slicing