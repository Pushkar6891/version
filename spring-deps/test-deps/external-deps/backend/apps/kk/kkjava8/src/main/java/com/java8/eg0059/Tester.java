package com.java8.eg0059;

import java.util.function.BiPredicate;

public class Tester {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (i, o) -> i > 20 && o.startsWith("S");

		System.out.println(biPredicate.test(30, "Sachin"));
		System.out.println(biPredicate.test(40, "Virat"));
		System.out.println(biPredicate.test(10, "Rahul"));
		System.out.println(biPredicate.test(20, "Sehwag"));
		System.out.println(biPredicate.test(25, "Sourav"));

	}

}