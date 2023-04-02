package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTester3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Carter", "James", "Davis", "Zorra", "Barry", "Zola");

		Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
		Collections.sort(names, lengthComparator);
		names.forEach(System.out::println);

		System.out.println("-------------------------------------------");

		List<Long> salary = Arrays.asList(9L, 8L, 2L, 6L, 3L);

		Comparator<Long> salaryComparator = Comparator.comparingLong(Long::longValue);
		Collections.sort(salary, salaryComparator);
		salary.forEach(System.out::println);

		System.out.println("-------------------------------------------");

		List<Double> points = Arrays.asList(9.8, 2.6, 3.9, 6.4, 6.5);

		Comparator<Double> pointsComparator = Comparator.comparingDouble(Double::doubleValue);
		Collections.sort(points, pointsComparator);
		points.forEach(System.out::println);

		System.out.println("-------------------------------------------");

	}

}