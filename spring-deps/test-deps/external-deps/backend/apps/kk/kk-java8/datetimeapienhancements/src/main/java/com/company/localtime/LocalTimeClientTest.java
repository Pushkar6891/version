package com.company.localtime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClientTest {

	public static void main(String[] args) {

		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);
		
		LocalTime currentTime2 = LocalTime.parse("09:30");
		System.out.println(currentTime2);
		
		LocalTime of = LocalTime.of(9, 45);
		System.out.println(of);
		LocalTime plus = of.plus(1, ChronoUnit.HOURS);
		System.out.println(plus);
		
		boolean before = LocalTime.parse("09:30").isBefore(LocalTime.parse("09:35"));
		System.out.println(before);
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		
	}
}
