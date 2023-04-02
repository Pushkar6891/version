package com.company;

public class ClientTester3 {

	private String value = "Enclosing Scope Value";

	public static void main(String[] args) {

		new ClientTester3().scopeExperiment();
	}

	private void scopeExperiment() {
		
		// Anonymous Inner Class : we can override local variable from enclosing scope by instantiating new variables with same name
		// this refers to class instance
		Foo foo1 = new Foo() {
			String value = "Inner Class Value";

			@Override
			public String method(String name) {
				return this.value;
			}
		};

		System.out.println(foo1.method("Pushkar"));
		
		// Lambda Expression : we cannot override local variables from enclosing scope inside lambda body
		// this refers to enclosing instance
		Foo foo2 = (name) -> {
			String value = "Lambda Value";
			return this.value;
		};
		
		System.out.println(foo2.method("Pushkar"));
	}

}
