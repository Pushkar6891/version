package com.java8.eg0014;

public class ReturnValueFromLambda {

	public static void main(String[] args) {

		// 1. Using Lambda for Custom Interface
//		MyInterface1 myInterface1 = (n1, n2) -> {
//			return n1 > n2;
//		};

		// 2. removed return
		MyInterface1 myInterface1 = (n1, n2) -> n1 > n2;

		System.out.println(myInterface1.test(100, 200));
	}
}
