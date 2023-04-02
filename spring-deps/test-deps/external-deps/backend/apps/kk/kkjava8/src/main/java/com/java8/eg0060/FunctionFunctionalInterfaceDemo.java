package com.java8.eg0060;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("Sachin", 40));
		list.add(new Student("Virat", 35));
		list.add(new Student("Rahul", 30));

		for (Student student : list) {
			System.out.println(student.customShow(s -> s.getName() + "\t" + s.getAge()));
		}

		Function<Student, String> styleOne = s -> {
			String result = "Name :" + s.getName() + " and Age:" + s.getAge();
			return result;
		};

		System.out.println("-------------------------------------------------");
		for (Student student : list) {
			System.out.println(student.customShow(styleOne));
		}

		Function<Student, String> styleTwo = s -> "Name :" + s.getName() + " and Age:" + s.getAge();

		System.out.println("-------------------------------------------------");
		for (Student student : list) {
			System.out.println(student.customShow(styleTwo));
		}
	}

}