package com.company;

import java.util.function.Function;

public class Student {

	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String customShow(Function<Student, String> function){
		return function.apply(this);
	}
}
