package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.company.model.Student;
import com.company.myinterface.MyInterface;
import com.company.myinterfaceImpl.MyClass;

public class ClientTester {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClass();
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Sean", 20));
		stuList.add(new Student("Andrew", 16));
		stuList.add(new Student("Frank", 26));

		List<Student> sortStudents = myInterface.sortStudents(stuList);
		for (Student student : sortStudents) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}

		System.out.println("-----------------------------------");

		MyInterface.greet("Sean");

		System.out.println("-----------------------------------");

		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(50);
		intList.add(9000);
		intList.add(90);
		Integer maxNum = myInterface.getMaxNum(intList);
		System.out.println("Max Num:" + maxNum);

		System.out.println("-----------------------------------");

		System.out.println("Students before sorting:");
		stuList.forEach(System.out::println);

		Comparator<Student> studentNameComp = (s1, s2) -> s1.getName().compareTo(s2.getName());

		Collections.sort(stuList, studentNameComp);
		
		System.out.println("---------------------------");
		
		System.out.println("Students after sorting:");
		stuList.forEach(System.out::println);

	}

}
