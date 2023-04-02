package com.java8.eg0026;

import com.java8.eg0025.Operation;

public class ThisReferenceInLambdaTester {
	public static void main(String[] args) {
		int b = 90;

		// Using Anonymous Class
//		ThisReferenceInLambdaTester.doOperate(b, new Operation() {
//
//			@Override
//			public void operate(int n) {
//				System.out.println(b + n);
//				System.out.println(this);// what will happen at this stage
//			}
//		});

		// Using Lambda
		ThisReferenceInLambdaTester.doOperate(b, n -> {
			System.out.println(b + n);
//			System.out.println(this);
		});
	}

	public static void doOperate(int p, Operation o) {
		o.operate(p);
	}
}
