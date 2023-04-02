package com.company.javafullcourse;

public class Eg23ClassesAndObject {
    public static void main(String[] args) {
        Lens lensOne = new Lens("sony", "85mm", true);
        Lens lensTwo = new Lens("canon", "90mm", false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrimeLens);

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrimeLens);
    }

    // we are creating static class to invoke inside main
    static class Lens {
        String brand;
        String model;
        String color;
        double price;
        double weight;
        String focalLength;
        boolean isPrimeLens;

        public Lens(String brand, String focalLength, boolean isPrimeLens) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrimeLens = isPrimeLens;
        }
    }
}


