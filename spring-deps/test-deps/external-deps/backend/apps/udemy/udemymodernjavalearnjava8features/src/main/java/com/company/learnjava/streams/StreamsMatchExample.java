package com.company.learnjava.streams;

import com.company.learnjava.data.StudentDataBase;

public class StreamsMatchExample {


    public static boolean allMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static boolean anyMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static boolean noneMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Result of allMatch : " + allMatch());
        System.out.println("Result of anyMatch : " + anyMatch());
        System.out.println("Result of noneMatch : " + noneMatch());
    }
}
