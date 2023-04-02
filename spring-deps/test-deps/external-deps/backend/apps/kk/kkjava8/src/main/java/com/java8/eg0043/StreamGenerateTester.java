package com.java8.eg0043;

import java.util.stream.Stream;

public class StreamGenerateTester {

	public static void main(String[] args) {

		Stream<String> limit = Stream.generate(() -> "Hello").limit(2);
		limit.forEach(System.out::println);
	}

}
