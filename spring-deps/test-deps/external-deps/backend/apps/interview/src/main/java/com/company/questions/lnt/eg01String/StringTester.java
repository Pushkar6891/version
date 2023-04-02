package com.company.questions.lnt.eg01String;

public class StringTester {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true (if equals not overriden it reference comparison)
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // content comparison as equals is overridden in String
    }
}
