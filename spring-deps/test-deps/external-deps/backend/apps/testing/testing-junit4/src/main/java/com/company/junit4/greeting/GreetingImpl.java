package com.company.junit4.greeting;

import org.apache.commons.lang3.StringUtils;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {

		if (StringUtils.isBlank(name)) {
			throw new IllegalArgumentException();
		}



		return "Hello " + name;
	}

}
