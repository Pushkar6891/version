package com.company.myinterface;

import com.company.model.Student;

import java.util.Collections;
import java.util.List;

public interface MyInterface {

    default public List<Student> sortStudents(List<Student> stuList) {
        Collections.sort(stuList);
        return stuList;
    }

    public static void greet(String name) {
        System.out.println("Welcome:" + name);
    }

    public abstract Integer getMaxNum(List<Integer> intList);

}
