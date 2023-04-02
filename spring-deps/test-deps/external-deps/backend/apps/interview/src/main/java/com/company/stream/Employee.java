package com.company.stream;

import lombok.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private int age;
    private String gender;
    private int departmentId;
    private String department;
    private String status;
    private int yearOfJoining;
    private double salary;
    private List<String> phoneNumbers;

    public static List<Employee> getEmployees() {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(111, "Jiya Brain", 32, "Female", 1, "HR", "active", 2011, 25000.0, Arrays.asList("919826396465", "919826096465")));
        employees.add(new Employee(122, "Paul Niksui", 25, "Male", 2, "Sales And Marketing", "active", 2015, 13500.0, Arrays.asList("916362660412", "919026096465")));
        employees.add(new Employee(133, "Martin Theron", 29, "Male", 3, "Infrastructure", "active", 2012, 18000.0, Arrays.asList("918826396465", "919826096460")));
        employees.add(new Employee(144, "Murali Gowda", 28, "Male", 4, "Product Development", "active", 2014, 32500.0, Collections.singletonList("919826396468")));
        employees.add(new Employee(155, "Nina Roy", 27, "Female", 1, "HR", "active", 2013, 22700.0, Arrays.asList("912826396465", "916826096465")));
        employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", 5, "Security And Transport", "inactive", 2016, 10500.0, Arrays.asList("6785674567", "4657667676")));
        employees.add(new Employee(177, "Manu Sharma", 35, "Male", 6, "Account And Finance", "inactive", 2010, 27000.0, Arrays.asList("7878786577", "99898978676")));
        employees.add(new Employee(188, "Wang Liu", 31, "Male", 4, "Product Development", "inactive", 2015, 34500.0, Arrays.asList("5656565565", "9090909090")));
        employees.add(new Employee(199, "Amelia Zoe", 24, "Female", 2, "Sales And Marketing", "active", 2016, 11500.0, Arrays.asList("2435465676", "78755657687")));
        employees.add(new Employee(200, "Jadan Dough", 38, "Male", 5, "Security And Transport", "inactive", 2015, 11000.5, Arrays.asList("8989786767", "888877767676")));
        employees.add(new Employee(211, "Jasna Kaur", 27, "Female", 3, "Infrastructure", "active", 2014, 15700.0, Arrays.asList("8878787877", "87878675565")));
        employees.add(new Employee(222, "Nitin Joshi", 25, "Male", 4, "Product Development", "active", 2016, 28200.0, Arrays.asList("343435760", "9987767656554545")));
        employees.add(new Employee(233, "Jyothi Reddy", 27, "Female", 6, "Account And Finance", "active", 2013, 21300.0, Arrays.asList("777656768888", "90766431246")));
        employees.add(new Employee(244, "Nicolus Den", 24, "Male", 2, "Sales And Marketing", "active", 2017, 10700.5, Arrays.asList("909876554434", "87754545788")));
        employees.add(new Employee(255, "Ali Baug", 23, "Male", 3, "Infrastructure", "active", 2018, 12700.0, Arrays.asList("8776576788", "9088766568")));
        employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", 4, "Product Development", "active", 2015, 28900.0, Arrays.asList("8886798986", "988668987")));
        employees.add(new Employee(277, "Anuj Chettiar", 31, "Male", 4, "Product Development", "active", 2012, 35700.0, Arrays.asList("78656878676", "895778786778")));
        return employees;
    }
}
