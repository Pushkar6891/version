package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerUsingWaitNotifyTester {
    public static void main(String[] args) {

        Queue<Integer> sharedQueue = new LinkedList<>();

        Producer producer = new Producer(sharedQueue);
        Consumer consumer = new Consumer(sharedQueue);

        Thread producerThread = new Thread(producer, "Producer Thread");
        Thread consumerThread = new Thread(consumer, "Consumer Thread");

        producerThread.start();
        consumerThread.start();
    }
}