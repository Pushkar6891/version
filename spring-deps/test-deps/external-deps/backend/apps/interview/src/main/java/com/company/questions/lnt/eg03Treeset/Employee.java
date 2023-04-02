package com.company.questions.lnt.eg03Treeset;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
//public class Employee implements Comparable<Employee> {
    public class Employee {
    private int id;
    private String name;
    private double salary;

//    @Override
//    public int compareTo(Employee employee) {
//        return this.getId() - employee.getId();
//    }
}
