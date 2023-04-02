package com.company.defaultAndStaticMethods;

public class Car implements Vehicle{

    String carName = "BMW";

    @Override
    public String increaseSpeed() {
        return "increasing speed of car : " + carName;
    }

    @Override
    public String decreaseSpeed() {
        return "decreasing speed of car : " + carName;
    }

    @Override
    public String getBrand() {
        return carName;
    }
}
