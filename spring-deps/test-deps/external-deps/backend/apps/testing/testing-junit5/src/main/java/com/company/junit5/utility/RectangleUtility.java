package com.company.junit5.utility;

public class RectangleUtility {

    public static int getArea(int height, int width) {
        return height * width;
    }

    public static int getPerimeter(int height, int width) {
        return 2 * (height + width);
    }
}
