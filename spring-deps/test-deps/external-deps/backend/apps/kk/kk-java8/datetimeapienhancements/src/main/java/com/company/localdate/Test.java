package com.company.localdate;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
		System.out.println(localDateTime);
		 String format = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		 System.out.println(format);
		 
		 String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 System.out.println(format2);
			String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
			System.out.println(format3);

	}

}
