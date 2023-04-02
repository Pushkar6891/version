package com.java8.eg0042;

import java.util.stream.Stream;

public class StreamBuilderTester {

	public static void main(String[] args) {

		Stream<String> streamBuilder = Stream.<String>builder().add("Sachin").add("Virat").add("Rahul").build();
		streamBuilder.forEach(System.out::println);
	}

}
