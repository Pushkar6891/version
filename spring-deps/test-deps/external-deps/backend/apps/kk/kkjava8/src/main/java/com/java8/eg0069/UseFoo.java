package com.java8.eg0069;

import java.util.function.Function;

public class UseFoo {

	// Old way
	// public String add(String name, Foo foo) {
	// return foo.method(name);
	// }

	// New Way
	public String add(String name, Function<String, String> f) {
		return f.apply(name);
	}
}
