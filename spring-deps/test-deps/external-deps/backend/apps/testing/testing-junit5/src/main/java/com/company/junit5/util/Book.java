package com.company.junit5.util;

public class Book {

	private final String title;

	private Book(String title) {
		this.title = title;
	}

	public static Book creatBookFromTitle(String title) {
		return new Book(title);
	}

	public String getTitle() {
		return this.title;
	}
}