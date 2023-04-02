package com.company.eg025.primitivetype;

public class PrimitiveType {
    public static void main(String[] args) {

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min Value of Integer : " + myMinIntValue);
        System.out.println("Max Value of Integer : " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1)); // Underflow
    }
}
