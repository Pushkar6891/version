package com.company.runnable.basic;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask1());
        Thread t2 = new Thread(new MyTask2());
        t1.start();
        t2.start();
    }
}
// Parallelism : each thread runs on different CPU cores
// Multithreading : 2 threads run on single cpu core with help of time slicing