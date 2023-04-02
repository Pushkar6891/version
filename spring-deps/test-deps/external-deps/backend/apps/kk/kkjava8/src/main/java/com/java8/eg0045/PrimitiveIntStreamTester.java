package com.java8.eg0045;

import java.util.stream.IntStream;

public class PrimitiveIntStreamTester {

	public static void main(String[] args) {

		IntStream range1 = IntStream.range(1, 6);
		range1.forEach(System.out::println);

		System.out.println();

		IntStream range2 = IntStream.rangeClosed(1, 6);
		range2.forEach(System.out::println);

	}

}
