package com.company.designpattern.creational.singleton.eg06singleton.serialization.solution;

import java.io.*;

public class SingletonTester {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(singleton1);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Object singleton2 = null;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            singleton2 = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
