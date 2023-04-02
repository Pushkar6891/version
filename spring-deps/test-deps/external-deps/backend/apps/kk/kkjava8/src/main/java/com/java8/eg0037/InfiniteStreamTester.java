package com.java8.eg0037;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamTester {
	public static void main(String[] args) {

		Stream<Integer> stream = Stream.iterate(0, i -> i + 2);
		List<Integer> collect = stream.limit(10).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}
