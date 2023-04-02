package com.company;

//Java implementation of a producer and consumer
//that use semaphores to control synchronization.

import java.util.concurrent.Semaphore;

public class MyQueue {
    // an item
    private int item;

    // semaphoreConsumer initialized with 0 permits
    // to ensure put() method executes first
    private Semaphore semaphoreConsumer = new Semaphore(0);
    private Semaphore semaphoreProducer = new Semaphore(1);

    // to get an item from buffer
    public void get() {
        try {
            // Before consumer can consume an item,
            // it must acquire a permit from semaphoreConsumer
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        // consumer consuming an item
        System.out.println("Consumer consumed item : " + item);

        // After consumer consumes the item,
        // it releases semaphoreProducer to notify producer
        semaphoreProducer.release();
    }

    // To put an item in buffer
    public void put(int item) {
        try {
            // Before producer can produce an item,
            // it must acquire a permit from semaphoreProducer
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        // producer producing an item
        this.item = item;
        System.out.println("Producer produced item : " + item);

        // After producer produces the item,
        // it releases semaphoreConsumer to notify consumer
        semaphoreConsumer.release();
    }
}
