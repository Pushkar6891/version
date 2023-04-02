package com.company.string;

public class CommonStringQuestion {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = new String("Abc");

        System.out.println(s1 == s2);//both have same referenced in scp
        System.out.println(s1 == s3);//one ref points to scp and other to heap
        System.out.println(s1.equals(s2));//both have same content and default equals checks content
        System.out.println(s1.equals(s3));//both have same content and default equals checks content
        System.out.println(s3 == s4);//both have same content but different referenced
        System.out.println(s3.equals(s4));//both have same content
        System.out.println(s4.equals(s5));//abc and Abc are different content
        System.out.println(s4.equalsIgnoreCase(s5));//abc and abc are same content

    }
}
