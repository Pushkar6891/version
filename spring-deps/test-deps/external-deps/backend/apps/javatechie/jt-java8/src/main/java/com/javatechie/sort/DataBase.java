package com.javatechie.sort;

import java.util.ArrayList;
import java.util.List;

//DAO layer
public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", "C", 600000));
        list.add(new Employee(388, "Bikash", "CIVIL", "B", 900000));
        list.add(new Employee(470, "Bimal", "DEFENCE", "D", 500000));
        list.add(new Employee(624, "Sourav", "CORE", "D", 400000));
        list.add(new Employee(176, "Prakash", "SOCIAL", "A", 1200000));
        return list;
    }

}
