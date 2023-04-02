package com.company.designpattern.creational.factory.eg01factory;

public class ComputerFactory {

    private ComputerFactory() {
    }

    public static Computer getComputer(ComputerType computerType,
                                       String ram,
                                       String hdd,
                                       boolean isGraphicsEnabled,
                                       boolean isBluetoothEnabled) {
        switch (computerType) {
            case PC:
                return new PC(ram, hdd, isGraphicsEnabled, isBluetoothEnabled);
            case LAPTOP:
                return new Laptop(ram, hdd, isGraphicsEnabled, isBluetoothEnabled);
            default:
                throw new RuntimeException("Invalid Computer Type");
        }
    }

}
