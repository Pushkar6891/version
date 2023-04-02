package com.company.designpatterns.creational.singleton.lazy.solution;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        MyThread myThread = new MyThread();
        try {
            executorService = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 10; i++)
                executorService.execute(myThread);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(executorService)) {
                executorService.shutdown();
            }
        }

    }
}
