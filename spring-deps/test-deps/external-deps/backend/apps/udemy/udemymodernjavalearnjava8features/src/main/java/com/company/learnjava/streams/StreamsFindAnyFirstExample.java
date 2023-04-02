package com.company.learnjava.streams;

import com.company.learnjava.data.Student;
import com.company.learnjava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAny(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findAny();
    }

    public static Optional<Student> findFirst(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAny();
        if(findAnyStudent.isPresent()){
            System.out.println("Student is :" + findAnyStudent.get());
        }else{
            System.out.println("No Student Found");
        }

        Optional<Student> findFirst = findFirst();
        if(findFirst.isPresent()){
            System.out.println("Student is :" + findFirst.get());
        }else{
            System.out.println("No Student Found");
        }
        //it will make a lot of different during parallel stream

    }
}
