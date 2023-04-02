package com.company;

import java.util.function.BiPredicate;

public class ClientTester {

	public static void main(String[] args) {

		BiPredicate<Integer, String> biPredicate = (i, o) -> i > 20 && o.startsWith("M");

		System.out.println(biPredicate.test(30, "Sean"));
		System.out.println(biPredicate.test(40, "Martin"));
		System.out.println(biPredicate.test(10, "Frank"));
		System.out.println(biPredicate.test(19, "Maya"));
		System.out.println(biPredicate.test(21, "Mohsin"));

		System.out.println("---------------------------------------------------");
		BiPredicate<Integer, Integer> biPredicate1 = (x, y) -> x > y;
		BiPredicate<Integer, Integer> biPredicate2 = (x, y) -> x - 2 > y;

		System.out.println(biPredicate1.and(biPredicate2).test(20, 15));
		System.out.println(biPredicate1.and(biPredicate2).test(10, 8));
		
		System.out.println("---------------------------------------------------");
		System.out.println(biPredicate1.or(biPredicate2).test(10, 15));
		System.out.println(biPredicate1.or(biPredicate2).test(15, 8));
		
		System.out.println("---------------------------------------------------");
		System.out.println(biPredicate1.negate().test(10, 15));
		System.out.println(biPredicate1.negate().test(15, 8));

	}

}
