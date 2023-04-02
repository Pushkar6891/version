package com.company.runnable.usinglambda;

public class Tester {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("MyTask1: " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("MyTask2: " + i);
            }
        });
        t1.start();
        t2.start();
    }
}
