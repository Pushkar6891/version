package com.company;

import java.util.function.Function;

public class StandardFunctionalInterfaceTest {

	public static void main(String[] args) {

//		Foo foo =s->s+" from Lambda";
//		UseFoo useFoo = new UseFoo();
//		String result = useFoo.add("John", foo);
//

		Function<String, String> function = s -> s + " from Lambda";
		UseFoo useFoo = new UseFoo();
		String result = useFoo.add("John", function);
		System.out.println(result);
	}

}
