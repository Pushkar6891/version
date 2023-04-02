package com.java8.eg0077;

import java.util.function.BiPredicate;

public class BiPredicateDefaultMethodTester {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPredicate1 = (a, b) -> a > b;
		BiPredicate<Integer, Integer> biPredicate2 = (a, b) -> a - 2 > b;

		System.out.println(biPredicate1.and(biPredicate2).test(20, 15));
		System.out.println(biPredicate1.and(biPredicate2).test(10, 8));

		System.out.println();

		System.out.println(biPredicate1.or(biPredicate2).test(10, 15));
		System.out.println(biPredicate1.or(biPredicate2).test(15, 8));

		System.out.println();

		System.out.println(biPredicate1.negate().test(20, 18));
		System.out.println(biPredicate2.negate().test(20, 18));

	}

}
