package com.company.runnable.join;

public class MyTask2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyTask2: " + i);
        }
    }
}
