package com.java8.eg0058;

import java.util.function.BiFunction;
//accepts two values and returns one value
public class Tester {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result is:" + (num1 + num2);

		System.out.println(biFunction.apply(100, 40));
	}

}