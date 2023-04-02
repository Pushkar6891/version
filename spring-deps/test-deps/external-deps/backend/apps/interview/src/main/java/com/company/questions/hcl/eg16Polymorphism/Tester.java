package com.company.questions.hcl.eg16Polymorphism;

public class Tester {

//    public void print(Integer i){
//        System.out.println("Integer");
//    }

    public void print(long i){
        System.out.println("Long");
    }

    public void print(Object i){
        System.out.println("Object");
    }

//    public void print(int i){
//        System.out.println("int");
//    }
//
//    public void print(long l){
//        System.out.println("long");
//    }

    public static void main(String[] args) {
        Tester obj = new Tester();
       // obj.print(10);

    }
}
// Predence
// Object < Long < Integer < long < int

// Object vs Integer -> Integer
// Object vs long -> long