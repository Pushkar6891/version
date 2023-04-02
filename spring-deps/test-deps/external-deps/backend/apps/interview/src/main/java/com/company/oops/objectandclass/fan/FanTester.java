package com.company.oops.objectandclass.fan;

import lombok.ToString;

public class FanTester {
    public static void main(String[] args) {
        Fan bajajFan = new Fan("Bajaj", 0.31428, "BLACK");
        bajajFan.switchOn();
        System.out.println(bajajFan);
        bajajFan.setSpeed((byte) 3);
        System.out.println(bajajFan);
        bajajFan.switchOff();
        System.out.println(bajajFan);
    }
}

@ToString
class Fan {

    // state
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;// 0 to 5

    // constructor
    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    // behaviour
    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }


}
