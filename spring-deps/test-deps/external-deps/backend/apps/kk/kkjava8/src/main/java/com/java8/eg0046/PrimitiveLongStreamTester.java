package com.java8.eg0046;

import java.util.stream.LongStream;

public class PrimitiveLongStreamTester {

	public static void main(String[] args) {

		LongStream range3 = LongStream.range(1, 6);
		range3.forEach(System.out::println);

		System.out.println();

		LongStream range4 = LongStream.rangeClosed(1, 6);
		range4.forEach(System.out::println);

	}

}
