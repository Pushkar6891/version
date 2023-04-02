package com.company.runnable.join;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new MyTask1();
        Thread t2 = new MyTask2();
        t1.start();
        t2.start();

        // join : waits for threads to finish/die
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finished with threads....");
    }
}
// Parallelism : each thread runs on different CPU cores
// Multithreading : 2 threads run on single cpu core with help of time slicing