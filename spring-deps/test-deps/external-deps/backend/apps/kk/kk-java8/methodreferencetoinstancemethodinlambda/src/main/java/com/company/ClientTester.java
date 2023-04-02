package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Richard");
		names.add("Samuel");
		names.add("Rose");
		names.add("John");
		
		names.forEach(x->System.out.println(x));
		System.out.println("----------------------------------");
		names.forEach(System.out::println);
	}

}
