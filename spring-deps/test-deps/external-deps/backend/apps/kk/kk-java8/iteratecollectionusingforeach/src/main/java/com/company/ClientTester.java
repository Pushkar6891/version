package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClientTester {

    public static void main(String[] args) {

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("Sean", 45));
        stuList.add(new Student("Andrew", 40));
        stuList.add(new Student("Martin", 42));

        stuList.forEach(System.out::println);

        System.out.println("----------------------------------");

        for (Student student : stuList) {
            System.out.println(student);
        }

        System.out.println("----------------------------------");

        Iterator<Student> iterator = stuList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

