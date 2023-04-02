package com.company.interthreadcommunication.synchronization.producerconsumer.waitnotify;

import java.util.LinkedList;
import java.util.List;

public class Processor {

    private List<Integer> list = new LinkedList<>();
    private static final int LOWER_LIMIT = 0;
    private static final int UPPER_LIMIT = 5;
    private final Object lock = new Object();
    private int value = 0;

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == UPPER_LIMIT) {
                    System.out.println("Waiting for consumer to consume...");
                    lock.wait();
                } else {
                    System.out.println("Adding : " + value);
                    list.add(value);
                    value++;
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock) {
            while (true) {
                if (list.size() == LOWER_LIMIT) {
                    System.out.println("Waiting for producer to produce...");
                    value = 0;
                    lock.wait();
                } else {
                    System.out.println("Removing : " + list.remove(list.size() - 1));
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}
