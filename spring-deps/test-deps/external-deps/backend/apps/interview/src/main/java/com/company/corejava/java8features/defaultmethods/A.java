package com.company.springbootappinterview.corejava.java8features.defaultmethods;

public interface A {

	default void m1(){
		System.out.println("m1 inside A");
	}
}
