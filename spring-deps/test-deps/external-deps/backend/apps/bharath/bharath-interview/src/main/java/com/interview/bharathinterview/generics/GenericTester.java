package com.interview.bharathinterview.generics;

public class GenericTester {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Pushkar");
        s.displayGenericObjectDetails();
        System.out.println(s.getObject());
        MyGenericClass<Double> d = new MyGenericClass<>(3.14);
        d.displayGenericObjectDetails();
        System.out.println(d.getObject());
        MyGenericClass<Integer> i = new MyGenericClass<>(100);
        i.displayGenericObjectDetails();
        System.out.println(i.getObject());
    }
}
/*
Type of object :java.lang.String
Pushkar
Type of object :java.lang.Double
3.14
Type of object :java.lang.Integer
100
*/