package com.java8.eg0007;

@FunctionalInterface
public interface MyInterface2 extends MyInterface1 {
	// compiler is not throwing any error even if no new abstract method is added in MyInterface2
}
