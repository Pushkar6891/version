package com.company.interthreadcommunication.synchronization.waitnotify;

public class Process {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("produce() is running...");
            wait();
            System.out.println("again in produce()...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("consume() is executed...");
            notify();
            Thread.sleep(5000);
            System.out.println("consume() is finished...");
        }
    }
}