package com.company.oops.objectandclass.motorbike;

/**
 * State and Behaviour associated with Class
 * Constructors associated with Class
 */
public class MotorBike {
    // state
    private int speed;

    // constructor
    public MotorBike() {
        this(5);
    }

    public MotorBike(int speed) {
        this.speed = speed;
    }

    // behaviour
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    public void start() {
        System.out.println("Bike Started");
    }
}
