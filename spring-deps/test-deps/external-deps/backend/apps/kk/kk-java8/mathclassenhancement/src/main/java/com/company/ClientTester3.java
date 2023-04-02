package com.company;

public class ClientTester3 {

	public static void main(String[] args) {

		double nextDown = Math.nextDown(Double.NaN);
		System.out.println(nextDown);

		double nextDown2 = Math.nextDown(Double.NEGATIVE_INFINITY);
		System.out.println(nextDown2);

		double nextDown3 = Math.nextDown(0);
		System.out.println(nextDown3);

		double nextDown4 = Math.nextDown(2);
		System.out.println(nextDown4);

		double nextDown5 = Math.nextDown(-2);
		System.out.println(nextDown5);

	}

}