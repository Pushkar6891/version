package com.company.questions.wissen.eg01hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Pushkar");
        Employee e2 = new Employee(1, "Pushkar");
        Employee e3 = new Employee(3, "Vivek");

        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "Delhi");
        map.put(e2, "Delhi");
        map.put(e3, "Pune");

        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
// Without equalsandhashcode duplicate entries will be stored in hashmap
// put() hashmap is a array where each index is a linkedlist of nodes
// hashing key % size = index

// 1. if no equals and hashcode then duplicate values are added
// 2. if no hashcode methods then duplicate values are added
// 3. if hashcode returns constant value then values will be re-written into map
// 4. if no equals method but hashcode then duplicate values are added