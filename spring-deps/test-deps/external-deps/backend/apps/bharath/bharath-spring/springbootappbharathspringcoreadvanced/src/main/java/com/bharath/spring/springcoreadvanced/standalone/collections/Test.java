package com.bharath.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductsList pl = (ProductsList) context.getBean("productsList");
		System.out.println(pl);

	}

}
