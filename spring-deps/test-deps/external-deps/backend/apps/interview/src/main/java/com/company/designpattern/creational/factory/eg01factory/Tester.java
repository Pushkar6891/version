package com.company.designpattern.creational.factory.eg01factory;

public class Tester {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "8 GB", "500 GB", true, false);
        Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "4 GB", "256 GB", true, true);
        System.out.println(pc);
        System.out.println(laptop);
    }
}
