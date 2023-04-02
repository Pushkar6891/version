package com.restfulwebservices.model;

public class HelloBean {

	public HelloBean() {
	}

	private String message;

	public HelloBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
