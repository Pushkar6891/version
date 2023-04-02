package com.java8.eg0002;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

	public default List<Employee> sortEmployees(List<Employee> list) {
		Collections.sort(list);
		return list;
	}

	public static void greet(String name) {
		System.out.println("Welcome : " + name);
	}

	public abstract int getMax(List<Integer> nums);
}
