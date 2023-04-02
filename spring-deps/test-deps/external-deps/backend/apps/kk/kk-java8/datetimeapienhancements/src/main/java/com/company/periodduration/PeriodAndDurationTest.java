package com.company.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest {

	public static void main(String[] args) {
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days);
		
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between);
		
		System.out.println("----------------------------------------");
		
		LocalTime initialTime = LocalTime.of(6, 30,0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(seconds);
		
		long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(between2);
	}
}
