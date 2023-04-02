package com.java8.eg0047;

import java.util.stream.IntStream;

public class PrimitiveDoubleStreamTester {

	public static void main(String[] args) {

		IntStream chars = "abcd".chars();
		chars.forEach(System.out::println);
		
	}

}
