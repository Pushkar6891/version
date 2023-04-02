package com.company.dateformatter;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterTest {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println(localDateTime);
		
		String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);
		
		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format2);
		
		String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
		System.out.println(format3);
		
		
	}

}
