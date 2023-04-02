package com.interview.bharathinterview.generics;

public class MyGenericClass<T> {
    T obj;

    MyGenericClass(T obj) {
        this.obj = obj;
    }

    public void displayGenericObjectDetails() {
        System.out.println("Type of object :" + obj.getClass().getName());
    }

    public T getObject() {
        return obj;
    }
}
