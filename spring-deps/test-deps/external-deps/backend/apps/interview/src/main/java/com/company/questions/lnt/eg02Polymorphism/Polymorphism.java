package com.company.questions.lnt.eg02Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        // obj.show("test"); // string
        // obj.show(null); // string (most specific)
         obj.show(null); // ambiguous method compile time exception
    }

//    public void show(Integer i) {
//        System.out.println("integer");
//    }

//    public void show(StringBuffer s) {
//        System.out.println("stringbuffer");
//    }

    public void show(String s) {
        System.out.println("string");
    }

    public void show(Object o) {
        System.out.println("object");
    }

}
