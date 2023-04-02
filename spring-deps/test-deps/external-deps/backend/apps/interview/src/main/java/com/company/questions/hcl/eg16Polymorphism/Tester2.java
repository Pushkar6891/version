package com.company.questions.hcl.eg16Polymorphism;

public class Tester2 {

    public void print(Integer i){
        System.out.println("Integer");
    }

//    public void print(short i){
//        System.out.println("short");
//    }
//
//    public void print(Long i){
//        System.out.println("Long");
//    }

    public void print(int... i){
        System.out.println("int...");
    }


    public static void main(String[] args) {
        Tester2 obj = new Tester2();
        obj.print(10);
        
    }
}
// Predence
// Object < Long  < int... Integer < long < int

// Object vs Integer -> Integer
// Object vs long -> long

// JVM follows order of precedence
// int > long > Integer > int... > Long > Object

