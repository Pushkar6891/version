package com.company;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SuppressWarnings("unused")
public class CompletableFutureTester9 {

	public static void main(String[] args) {

		String name = "Pushkar";
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			if (name == null) {
				throw new RuntimeException("Computation Error!!!");
			}
			return "Hello," + name;
		});

		try {
			System.out.println(completableFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println(e.getMessage());
		}
	}
}