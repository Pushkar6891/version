package com.company.javafullcourse;

public class Eg12LogicalOperator {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        String name = "Pushkar";
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        System.out.println(!isAdult);
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
        System.out.println(isAdult == true);
        System.out.println(isAdult == false);
        System.out.println(isAdult);
        System.out.println(!isAdult);
        System.out.println(10 < 80 && 3.14 > 2.14 && name.contains("Push"));
    }
}
