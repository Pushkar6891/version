package com.javatechie.async;

import java.util.List;
import java.util.concurrent.*;
import java.util.Arrays;

public class WhyNotFuture {

    private static void delay(int min) {
        try {
            TimeUnit.MINUTES.sleep(min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = executorService.submit(() -> {
            System.out.println("Thread : " + Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5);
        });
        List<Integer> numbers = future.get();
        numbers.forEach(System.out::println);
    }

}
/*
* Disadvantages of Future
* 1. Future cannot be manually completed
* 2. Future cannot be chained
* 3. Future cannot be combined
* 4. Future does not support proper Exception Handling
* */