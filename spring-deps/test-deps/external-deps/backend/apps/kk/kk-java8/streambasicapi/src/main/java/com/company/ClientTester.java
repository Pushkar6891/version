package com.company;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClientTester {

	public static void main(String[] args) {

		Stream<String> build = Stream.<String>builder().add("kk").add("PK").add("MK").build();
		build.forEach(System.out::println);

		System.out.println("---------------------------------------------------");

		Stream<String> limit = Stream.generate(() -> "Hello").limit(2);
		limit.forEach(System.out::println);

		System.out.println("---------------------------------------------------");

		Stream<Integer> limit2 = Stream.iterate(10, i -> i + 2).limit(10);
		limit2.forEach(System.out::println);

		System.out.println("---------------------------------------------------");

		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);

		System.out.println("---------------------------------------------------");

		IntStream range2 = IntStream.rangeClosed(1, 6);
		range2.forEach(System.out::println);

		System.out.println("---------------------------------------------------");

		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);

		IntStream chars = "abcd".chars();
		System.out.println("---------------------------------------------------");
		chars.forEach(System.out::println);

	}

}
