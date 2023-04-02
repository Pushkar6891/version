package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClientTester {

    public static void main(String[] args) {

        Map<Integer, Employee> map = new HashMap<>();
        map.put(19022, new Employee("Sean", "sean.m@gmail.com", 90000.00));
        map.put(19044, new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
        map.put(19055, new Employee("Martin", "martin.m300@gmail.com", 80000.00));

        Set<Entry<Integer, Employee>> entrySet = map.entrySet();
        for (Entry<Integer, Employee> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("----------------------------------------");

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        System.out.println("----------------------------------------");

        map.forEach((k, v) -> System.out.println(k + "\t" + v));

    }
}
