package com.company.eg01.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
    public static void main(String[] args) {

// Eg 1
//        Thread thread = new Thread(new MyTask());
//        thread.start();

// Eg 2
//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new MyTask.java());
//            thread.start();
//        }

// Eg 3
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            executorService.execute(new MyTask.java());
//        }

        // Eg 4
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new MyTask());
        }

        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }
}

// O/P
//
//        Thread Name : Thread-0
//        Thread Name : main