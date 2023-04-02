package com.java8.eg0006;

@FunctionalInterface
public interface MyInterface {

	public abstract void m1();
	
	// cannot add m2() but can add other object class methods like equals() and hashCode() etc
	// public abstract void m2();
	
	// can add Object Class Methods
	public abstract int hashCode();
	public boolean equals(Object obj);
}
