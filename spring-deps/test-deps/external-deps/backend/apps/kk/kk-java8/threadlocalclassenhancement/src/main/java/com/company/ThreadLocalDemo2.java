package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDemo2 implements Runnable {

	private static final ThreadLocal<SimpleDateFormat> dateFormat = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Initializing SimpleDateFormat for-" + Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}
	};

	@Override
	public void run() {
		System.out.println("Thread run execution started for -" + Thread.currentThread().getName());
		System.out.println("Date formatter pattern is - " + dateFormat.get().toPattern());
		System.out.println("Formatted date is -" + dateFormat.get().format(new Date()));
	}
}