package com.company.designpattern.creational.prototype.eg01Prototype;

import java.util.List;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {

        StudentDAO studentDAO = new StudentDAO();

        //Getting Original copy of student list
        List<Student> allStudents = studentDAO.getAllStudents();

        //Getting clone copy of student list
        List<Student> updatedStudentList = studentDAO.clone();
        Student student = new Student();
        student.setId(30);
        student.setName("SK");

        //Doing manipulation on cloned copy
        updatedStudentList.add(student);

        System.out.println("Original Student List::");
        allStudents.forEach(System.out::println);

        System.out.println("Updated Student List::");
        updatedStudentList.forEach(System.out::println);
    }

}
