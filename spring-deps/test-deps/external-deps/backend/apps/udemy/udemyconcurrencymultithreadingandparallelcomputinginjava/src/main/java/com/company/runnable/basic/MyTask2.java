package com.company.runnable.basic;

public class MyTask2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("MyTask2: " + i);
        }
    }
}
