package com.company.designpatterns.creational.singleton.serialization.solution;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class Tester {
    public static void main(String[] args) {

        ObjectOutputStream oos = null;
        Employee employee1 = Employee.getInstance();
        Employee employee2 = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File("employee.ser")));
            oos.writeObject(employee1);
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

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(new File("employee.ser")));
            try {
                employee2 = (Employee) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
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

        log.info("Employee 1 hashCode : {} ", employee1.hashCode());
        log.info("Employee 2 hashCode : {} ", employee2.hashCode());
    }
}
