package com.company.springbootappinterview.corejava.java8features.lamdas.parameters;

public class Test {

	public static void main(String[] args) {
		
		Sum s = (x,y)->System.out.println("Sum is:"+(x+y));
		s.add(10, 20);

	}

}
