package com.java8.eg0052;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReductionTester {

	public static void main(String[] args) {

		// 1+2+3
		OptionalInt reduced = IntStream.range(1, 4).reduce((a, b) -> a + b);
		System.out.println(reduced.getAsInt());

		// 10+1+2+3
		int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
		System.out.println(reducedTwoParams);

		Integer reduce = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
			System.out.println("Combiner was called...");
			return a + b;
		});

		// 11, 12, 13 = 36
		System.out.println(reduce);
	}

}
