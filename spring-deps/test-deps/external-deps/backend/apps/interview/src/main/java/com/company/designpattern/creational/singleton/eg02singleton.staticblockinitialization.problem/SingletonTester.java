package com.company.designpattern.creational.singleton.eg02singleton.staticblockinitialization.problem;

class SingletonTester {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}