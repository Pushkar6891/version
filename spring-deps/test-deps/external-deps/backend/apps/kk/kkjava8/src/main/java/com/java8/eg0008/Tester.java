package com.java8.eg0008;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Tester {

	public static void main(String[] args) {

		List<String> nameList = new LinkedList<>();
		nameList.add("Sachin");
		nameList.add("Virat");
		nameList.add("Anjum");

		// Consumer Interface using Anonymous Class
		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});

		// Consumer Interface using Lambda
		nameList.forEach((name) -> System.out.println(name));

		// Consumer Interface using Method Referencing
		nameList.forEach(System.out::println);
	}
}
