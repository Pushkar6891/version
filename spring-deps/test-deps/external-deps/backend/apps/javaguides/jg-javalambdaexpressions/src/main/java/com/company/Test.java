package com.company;

public class Test {
    public static void main(String[] args) {
        Shape circle = () -> System.out.println("Circle::draw()");
        circle.draw();
        Shape square = () -> System.out.println("Square::draw()");
        square.draw();
        Shape rectangle = () -> System.out.println("Rectangle::draw()");
        rectangle.draw();

        System.out.println("-----------------------------------");
        print(circle);
        print(square);
        print(rectangle);

        System.out.println("-----------------------------------");
        print(() -> System.out.println("Circle::draw()"));
        print(() -> System.out.println("Square::draw()"));
        print(() -> System.out.println("Rectangle::draw()"));

        System.out.println("-----------------------------------");
        Addable addable = (a, b) -> a + b;
        System.out.println(addable.add(10, 20));

        System.out.println("-----------------------------------");

        Thread thread = new Thread(new MyTask());
        thread.start();

        System.out.println("-----------------------------------");

        Thread threadLambda = new Thread(() -> System.out.println("MyTask::run() called"));
        threadLambda.start();

    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
// https://www.youtube.com/watch?v=fCR1LcECWBk