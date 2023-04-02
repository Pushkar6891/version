package com.java8.eg0020;

public class TypeInferenceLambdaTester {
	public static void main(String[] args) {

		// without giving return type of lambda 
		// type of arguments will be inferred
		// no return key word required
		MyComparator myComparator = (n1,n2)->n1>n2;
		boolean compare = myComparator.compare(40, 30);
		System.out.println(compare);
	}
}
