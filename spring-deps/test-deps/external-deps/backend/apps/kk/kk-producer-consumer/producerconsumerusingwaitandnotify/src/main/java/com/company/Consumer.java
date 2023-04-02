package com.company;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Integer> sharedQueue;
    // private final int MAX_SIZE = 5;

    public Consumer(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                //  while (sharedQueue.size() == 5) {
                while (sharedQueue.isEmpty()) {
                    try {
                        System.out.println("Consumer is waiting for Producer to produce objects");
                        sharedQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int data = sharedQueue.poll();
                System.out.println("Thread : " + Thread.currentThread().getName() + " Consumer : " + data);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                sharedQueue.notify();
            }
        }
    }
}
