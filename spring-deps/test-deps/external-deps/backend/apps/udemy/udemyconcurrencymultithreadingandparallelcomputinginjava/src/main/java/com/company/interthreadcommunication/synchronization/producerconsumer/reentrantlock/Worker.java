package com.company.interthreadcommunication.synchronization.producerconsumer.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void produce() throws InterruptedException {
        lock.lock();
        System.out.println("produce()...");
        condition.await();
        System.out.println("again in produce()...");
    }

    public void consume() throws InterruptedException {
        Thread.sleep(500);
        lock.lock();
        System.out.println("consume()...");
        Thread.sleep(500);
        condition.signal();
        lock.unlock();
    }
}
