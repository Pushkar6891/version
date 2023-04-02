package com.company.equalsAndhashcodewithhashset.eg01.withouthashcode.com;

import java.util.HashSet;
import java.util.Set;

public class ContractTesterWithoutHashCode {
    public static void main(String[] args) {
        Set<Employee> empSet = loadEmpSet();
        System.out.println(empSet);
        System.out.println(empSet.size());
    }

    public static Set<Employee> loadEmpSet() {
        Set<Employee> empSet = new HashSet<>();

        Employee employee1 = new Employee("101", "06081991");
        Employee employee2 = new Employee("101", "06081991");
        Employee employee3 = new Employee("103", "06081971");

        empSet.add(employee1);
        empSet.add(employee2);
        empSet.add(employee3);

        return empSet;
    }
}
