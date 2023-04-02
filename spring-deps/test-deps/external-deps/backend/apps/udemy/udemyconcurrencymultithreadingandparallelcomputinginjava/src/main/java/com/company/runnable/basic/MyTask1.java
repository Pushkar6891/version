package com.company.runnable.basic;

public class MyTask1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("MyTask1: " + i);
        }
    }
}
