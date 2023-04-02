package com.bharath.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
		

	}

}
