package com.java8.eg0025;

// you cannot change value of variable b and assume it is final in java 8
// closures in lambda expression
public class Tester {

	public static void main(String[] args) {

		int a = 30;
		int b = 40;

		// anonymous class

//		doOperate(a, new Operation() {
//
//			@Override
//			public void operate(int n) {
//				System.out.println(n + b);
//			}
//		});

		// lambda
		doOperate(a, n -> System.out.println(n + b));
	}

	public static void doOperate(int p, Operation o) {
		o.operate(p);
	}

}
