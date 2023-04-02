package com.javatechie.async;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CompleteableFutureSupplyAsync {

    public List<Employee> getEmployees() throws ExecutionException, InterruptedException {
        Executor executor = Executors.newCachedThreadPool();
        CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Executed by : " + Thread.currentThread().getName());
                    try {
                        return EmployeeDatabase.fetchEmployees();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return null;
                }, executor);
        return listCompletableFuture.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        CompleteableFutureSupplyAsync obj = new CompleteableFutureSupplyAsync();
        List<Employee> employees = obj.getEmployees();
        employees.forEach(System.out::println);
    }
}
