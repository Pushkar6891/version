package com.java8.eg0044;

import java.util.stream.Stream;

public class StreamIterateTester {

	public static void main(String[] args) {

		Stream<Integer> limit = Stream.iterate(10, i->i+2).limit(10);
		limit.forEach(System.out::println);
	}

}
