package com.bharath.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	Addition(int a,double b){
		System.out.println("Inside the Constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
}
