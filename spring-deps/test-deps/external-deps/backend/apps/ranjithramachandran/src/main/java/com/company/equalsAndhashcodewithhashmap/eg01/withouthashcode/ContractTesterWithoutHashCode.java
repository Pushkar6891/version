package com.company.equalsAndhashcodewithhashmap.eg01.withouthashcode;

import java.util.HashMap;
import java.util.Map;

public class ContractTesterWithoutHashCode {
    public static void main(String[] args) {
        Map<Employee, String> empCache = loadEmpCache();
        Employee lookupEmployeeKey = new Employee("101", "06081991");
        String empName = empCache.get(lookupEmployeeKey);
        System.out.println(empName);
    }

    public static Map<Employee, String> loadEmpCache() {
        Map<Employee, String> empCache = new HashMap<>();

        Employee employee1 = new Employee("101", "06081991");
        Employee employee2 = new Employee("102", "06081981");
        Employee employee3 = new Employee("103", "06081971");

        empCache.put(employee1, "Pushkar");
        empCache.put(employee2, "Ajay");
        empCache.put(employee3, "Priya");

        return empCache;
    }
}
