package com.company;

public class ClientTester2 {

	public static void main(String[] args) {

		int floorDiv = Math.floorDiv(45, 4);
		System.out.println(floorDiv);

		int x = -45;
		int y = 4;
		int r = x / y;
		System.out.println(r);
		System.out.println(x ^ y);
		System.out.println(r * y != x);
		int floorDiv2 = Math.floorDiv(-45, 4);
		System.out.println(floorDiv2);
	}
}