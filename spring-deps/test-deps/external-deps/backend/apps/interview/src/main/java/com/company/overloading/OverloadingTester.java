package com.company.overloading;

public class OverloadingTester {

    public static void main(int[] args) {
        System.out.println("main method with int[] args");
    }

    public static void main(int args) {
        System.out.println("main method with int args");
    }

    public static void main(float[] args) {
        System.out.println("main method with float[] args");
    }

    /*
    public static void main(String[] args) {
        System.out.println("main method with String[] args");
    }
    */

    public static void main(String...args) {
        System.out.println("main method with String...args");
    }
}
