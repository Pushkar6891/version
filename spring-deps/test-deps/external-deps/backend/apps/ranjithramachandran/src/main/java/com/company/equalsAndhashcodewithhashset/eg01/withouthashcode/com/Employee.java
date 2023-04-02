package com.company.equalsAndhashcodewithhashset.eg01.withouthashcode.com;

import java.util.Objects;

public class Employee {
    private String empId;
    private String empDob;

    public Employee(String empId, String empDob) {
        this.empId = empId;
        this.empDob = empDob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empDob, employee.empDob);
    }

    /*
    @Override
    public int hashCode() {
        return Objects.hash(empId, empDob);
    }
    */

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empDob='" + empDob + '\'' +
                '}';
    }
}
