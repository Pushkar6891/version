package com.company;

import java.util.LinkedList;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {
		String joinedStr = String.join("-", "Hello", "From", "Pushkar", null);
		System.out.println(joinedStr);

		System.out.println("---------------------------------------");

		List<String> names = new LinkedList<>();
		names.add("Ajay");
		names.add("Vijay");
		names.add("Sanjeev");
		names.add("Pooja");
		names.add("Kamla");
		String joinedString = String.join(",", names);
		System.out.println(joinedString);
	}

}
