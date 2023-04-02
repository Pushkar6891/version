package com.company.defaultAndStaticMethods;

interface Vehicle {
    String increaseSpeed();

    String decreaseSpeed();

    String getBrand();

    default String turnAcOn() {
        return "turning vehicle ac on";
    }

    default String turnAcOff() {
        return "turning vehicle ac off";
    }

    static String getCompany(){
        return "BMW";
    }
}