package com.company.corejava.nonstaticmembers;

public class ObjectReferenceDemo {

	int x;
	
	ObjectReferenceDemo(){
		
	}
	
	public static void main(String[] args) {
		ObjectReferenceDemo ord = new ObjectReferenceDemo();
		System.out.println(ord.x);
	}
}
