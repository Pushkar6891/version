package com.company;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTester7 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "India");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "is");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "beautiful country");

		CompletableFuture<Void> completableFuture = CompletableFuture.allOf(future1, future2, future3);
		System.out.println(completableFuture.get());

		// System.out.println(future1.get());
		System.out.println(future1.isDone());
		System.out.println(future2.isDone());
		System.out.println(future3.isDone());

		String result = Stream.of(future1, future2, future3).map(CompletableFuture::join)
				.collect(Collectors.joining(" "));
		System.out.println(result);
	}
}