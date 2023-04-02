package com.java8.eg0078;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Tester1 {

	public static void main(String[] args) {

		List<String> morningList = new LinkedList<>();
		morningList.add("Brush your teeth");
		morningList.add("Do some excercise");

		List<String> eveningList = new LinkedList<>();
		eveningList.add("Go to play Cricket");
		eveningList.add("Have some snacks");

		List<String> nighList = new LinkedList<>();
		nighList.add("Talk to girlfriend");
		nighList.add("Drink milk");

		List<List<String>> dailyTaskList = new LinkedList<>();
		dailyTaskList.add(morningList);
		dailyTaskList.add(eveningList);
		dailyTaskList.add(nighList);
		
		System.out.println("1. Using FlatMap");
		Stream<String> flatMap = dailyTaskList.stream().flatMap(task -> task.stream());
		flatMap.forEach(System.out::println);
	}

}
