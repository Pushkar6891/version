package com.company.interthreadcommunication.synchronization.synchronizedkeyword;

public class SynchronizationSolution {
    public static int counter = 0;

    public static synchronized void increment(){
        counter++;
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter : " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
