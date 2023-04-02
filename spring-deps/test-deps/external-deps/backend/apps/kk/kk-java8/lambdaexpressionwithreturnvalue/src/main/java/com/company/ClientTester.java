package com.company;

public class ClientTester {

	public static void main(String[] args) {

		MyInterface myInterface = (n1, n2) -> n1 > n2;

		System.out.println(myInterface.test(40, 35));
		System.out.println(myInterface.test(40, 45));
	}
}
