package com.company.oops.objectandclass.rectangle;

import lombok.Getter;
import lombok.Setter;

public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 23);
        System.out.println(rectangle);
        rectangle.setWidth(25);
        System.out.println(rectangle);
    }
}

@Getter
@Setter
class Rectangle {

    // state
    private int length;
    private int width;

    // constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // behaviour
    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Length : %d, Width : %d, Area : %d, Perimeter : %d", length, width, calculateArea(), calculatePerimeter());
    }
}