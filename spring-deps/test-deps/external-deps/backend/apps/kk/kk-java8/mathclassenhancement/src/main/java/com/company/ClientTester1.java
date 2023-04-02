package com.company;

public class ClientTester1 {

	public static void main(String[] args) {

		int addExact = Math.addExact(Integer.MIN_VALUE, 10000);
		System.out.println(addExact);

		/*
		 * int addExact2 = Math.addExact(Integer.MAX_VALUE, 1);
		 * System.out.println(addExact2);
		 */
		int data = Integer.MAX_VALUE + 2;
		System.out.println(data);

		int subtractExact = Math.subtractExact(2000, 34);
		System.out.println(subtractExact);

		long multiplyExact = Math.multiplyExact(10L, 200L);
		System.out.println(multiplyExact);

		long incrementExact = Math.incrementExact(50000L);
		System.out.println(incrementExact);

		long negateExact = Math.negateExact(5000L);
		System.out.println(negateExact);
	}
}