package com.java8.eg0003;

import java.util.LinkedList;
import java.util.List;

public class MyInterfaceTester {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClass();

		List<Integer> intList = new LinkedList<>();
		intList.add(9);
		intList.add(8);
		intList.add(2);
		intList.add(6);
		intList.add(3);
		System.out.println(myInterface.getMax(intList));

	}

}
