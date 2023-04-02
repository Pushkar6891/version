package com.company.defaultAndStaticMethods;

public class DefaultMethodInInterfaceExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle.increaseSpeed());
        System.out.println(vehicle.decreaseSpeed());
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.turnAcOn());
        System.out.println(vehicle.turnAcOff());
        System.out.println(Vehicle.getCompany());
    }
}