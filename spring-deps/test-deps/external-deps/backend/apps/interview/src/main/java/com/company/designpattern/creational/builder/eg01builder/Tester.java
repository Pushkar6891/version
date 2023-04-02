package com.company.designpattern.creational.builder.eg01builder;

public class Tester {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop.LaptopBuilder("8 GB", "500 GB").build();
        Laptop laptop2 = new Laptop.LaptopBuilder("16 GB", "1 TB").setBluetoothEnabled(true).build();
        Laptop laptop3 = new Laptop.LaptopBuilder("32 GB", "2 TB").setBluetoothEnabled(true).setGraphicsEnabled(true).build();
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);
    }
}
