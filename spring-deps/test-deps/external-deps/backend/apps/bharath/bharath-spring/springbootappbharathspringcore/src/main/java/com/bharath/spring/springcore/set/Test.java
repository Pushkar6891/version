package com.bharath.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/bharath/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels().getClass().getName());

	}

}
