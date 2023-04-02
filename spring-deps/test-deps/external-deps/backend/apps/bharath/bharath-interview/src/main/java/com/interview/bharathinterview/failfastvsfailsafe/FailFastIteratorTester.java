package com.interview.bharathinterview.failfastvsfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorTester extends Thread {

    private static List<String> courses = new ArrayList<String>();

    public static void main(String[] args) {
        FailFastIteratorTester obj = new FailFastIteratorTester();
        obj.start();

        courses.add("Java");
        courses.add("AWS");
        courses.add("Docker");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String course = iterator.next();
            System.out.println(course);
        }

        System.out.println(courses);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        courses.add("Kubernetes");
    }
}
