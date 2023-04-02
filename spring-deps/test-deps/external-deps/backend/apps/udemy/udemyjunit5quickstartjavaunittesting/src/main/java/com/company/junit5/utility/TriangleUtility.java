package com.company.junit5.utility;

public class TriangleUtility {

    public static double getArea(int base, int height) {
        return 0.5 * base * height;
    }

    public static int getPerimeter(int sideA, int sideB, int sideC) {
        return sideA + sideB + sideC;
    }

    public static boolean isEquilateral(int sideA, int sideB, int sideC) {
        // throw new java.lang.UnsupportedOperationException("Not Yet Implemented");
        return sideA == sideB && sideB == sideC && sideC == sideA;
    }

    public static boolean isIsoceles(int sideA, int sideB, int sideC) {
        return sideA == sideB || sideB == sideC || sideC == sideA;
    }
}
