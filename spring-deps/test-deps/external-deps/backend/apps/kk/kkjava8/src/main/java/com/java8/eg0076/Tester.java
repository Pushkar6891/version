package com.java8.eg0076;

public class Tester {

	private String value = "Enclosing scope value";

	public static void main(String[] args) {
		Tester obj = new Tester();
		obj.m1();
	}

	public void m1() {
		// Using Anonymous Class
		// In terms of scope you can change value inside Anonymous Class
		Foo foo1 = new Foo() {

			private String value = "Inner Class value";

			@Override
			public String method() {
				return this.value;
			}

		};

		System.out.println(foo1.method());

		
		// Using Lambda Expression
		// In terms of scope you cannot change value inside Lambda
		Foo foo2 = () -> {
			String value = "Lambda value";
			return this.value;
		};
		System.out.println(foo2.method());
	}

}

interface Foo {
	String method();
}