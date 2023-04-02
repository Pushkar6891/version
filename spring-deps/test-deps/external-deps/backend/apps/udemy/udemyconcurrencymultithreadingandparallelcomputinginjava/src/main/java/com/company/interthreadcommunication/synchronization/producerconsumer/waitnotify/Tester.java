package com.company.interthreadcommunication.synchronization.producerconsumer.waitnotify;

public class Tester {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread producerThread = new Thread(() -> {
            try {
                processor.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}
