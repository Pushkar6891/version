package com.java8.eg0038;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamTester {

	public static void main(String[] args) {
		Supplier<UUID> randomUUIDs = UUID::randomUUID;
		Stream<UUID> generate = Stream.generate(randomUUIDs);

		List<UUID> collect = generate.skip(10).limit(10).collect(Collectors.toList());

		System.out.println("1. Skip 10 elements and Generate 10 more elements and collect in list");
		collect.forEach(System.out::println);

		System.out.println("-----------------------------");

		System.out.println("while loop - the stream way using limit");
		Stream<Integer> iterate = Stream.iterate(0, i -> i + 1);
		iterate.limit(10).forEach(System.out::println);

	}

}
