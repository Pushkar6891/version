package com.java8.eg0069;

import java.util.function.Function;

public class Tester {

	public static void main(String[] args) {

		// Old Way
		// Foo foo = s -> "from Lambda";
		// UseFoo useFoo = new UseFoo();
		// String result = useFoo.add("John", foo);
		// System.out.println(result);
		
		// New Way Using already existing Functional Interface "Function"
		Function<String, String> f = s->"from Lambda";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("John", f);
		System.out.println(result);		

	}

}
