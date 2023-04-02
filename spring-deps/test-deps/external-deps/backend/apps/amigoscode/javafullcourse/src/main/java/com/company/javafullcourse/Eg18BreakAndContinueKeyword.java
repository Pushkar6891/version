package com.company.javafullcourse;

public class Eg18BreakAndContinueKeyword {
    public static void main(String[] args) {
        String[] names = {"Bob", "Jim", "Anna", "Ali", "Tim", "Mark", "Smith"};
        for (String name : names) {
            if ("Mark".equals(name)) {
                break;
            }
            if (name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
