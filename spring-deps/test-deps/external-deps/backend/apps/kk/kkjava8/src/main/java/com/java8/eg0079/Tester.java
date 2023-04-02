package com.java8.eg0079;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Tester {

	public static void main(String[] args) {

		Tester obj = new Tester();
		obj.m1();
		obj.m2();

	}

	public void m1() {
		List<Integer> nums = new LinkedList<>();
		nums.add(9);
		nums.add(8);
		nums.add(2);
		nums.add(6);
		nums.add(3);

		Optional<Integer> max = nums.stream().max(Comparator.comparing(Integer::new));
		if (max != null)
			System.out.println(max.get());
		else
			System.out.println("Invalid");
	}

	public void m2() {
		List<Integer> nums = new LinkedList<>();
		nums.add(9);
		nums.add(8);
		nums.add(2);
		nums.add(6);
		nums.add(3);

		Integer max = nums.stream().max(Comparator.comparing(Integer::new)).orElseThrow(NoSuchElementException::new);

		System.out.println(max);
	}

}
