package com.company;

public class ProducerConsumerUsingSemaphoreTester {

    public static void main(String[] args) {
        // creating buffer queue
        MyQueue myQueue = new MyQueue();

        Producer producer = new Producer(myQueue);
        Consumer consumer = new Consumer(myQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }

}
