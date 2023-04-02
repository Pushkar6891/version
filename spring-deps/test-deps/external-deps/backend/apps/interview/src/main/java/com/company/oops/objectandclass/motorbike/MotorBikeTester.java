package com.company.oops.objectandclass.motorbike;

public class MotorBikeTester {
    public static void main(String[] args) {
        MotorBike yamaha = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        MotorBike harley = new MotorBike(150);

        System.out.println(yamaha.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(harley.getSpeed());

        yamaha.start();
        honda.start();
        harley.start();

        yamaha.increaseSpeed(25);
        honda.increaseSpeed(20);
        harley.decreaseSpeed(50);

        System.out.println(yamaha.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(harley.getSpeed());

    }
}
