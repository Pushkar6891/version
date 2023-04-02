package com.company.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        MapTester obj = new MapTester();
        Map<Integer, Person> map = new HashMap<>();
        List<Person> persons = obj.getPersons();
        int keyCounter = 1;
        for (Person person : persons) {
            map.put(keyCounter++, person);
        }
        System.out.println(map.size());
        map.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        map.remove(3);
        System.out.println(map.size());

        System.out.println(map.getOrDefault(100, new Person("Pushkar", 30, Gender.MALE)));

        System.out.println(map.values());
        map.clear();
        System.out.println(map.size());
    }

    private List<Person> getPersons() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE),
                new Person("Madhuri Dixit", 40, Gender.FEMALE),
                new Person("Mithali Raj", 26, Gender.FEMALE)
        );
    }
}
