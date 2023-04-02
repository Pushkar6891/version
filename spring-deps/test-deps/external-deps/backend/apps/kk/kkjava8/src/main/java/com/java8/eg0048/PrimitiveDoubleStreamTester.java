package com.java8.eg0048;

import java.util.Random;
import java.util.stream.DoubleStream;

public class PrimitiveDoubleStreamTester {

	public static void main(String[] args) {

		Random random = new Random();
		DoubleStream doubles = random.doubles(5);
		doubles.forEach(System.out::println);
	}

}
