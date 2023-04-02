package com.company.client;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWorkStealingPoolTest {

	public static void main(String[] args) throws InterruptedException {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newWorkStealingPool(availableProcessors);

		List<Callable<String>> tasks = Arrays.asList(() -> "My Task1", () -> "My Task2", () -> "My Task3",
				() -> "My Task4");

		executorService.invokeAll(tasks).stream().map(future -> {
			try {
				return future.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
	}

}
