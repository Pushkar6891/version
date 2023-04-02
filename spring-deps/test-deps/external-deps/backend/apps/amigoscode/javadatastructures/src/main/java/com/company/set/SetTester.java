package com.company.set;

import java.util.HashSet;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("green"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.remove(new Ball("green"));

        System.out.println(balls.size());

        System.out.println("ForEach Java 8");
        balls.forEach(System.out::println);

        System.out.println("Enhanced For");
        for (Ball ball : balls) {
            System.out.println(ball);
        }
    }

}
