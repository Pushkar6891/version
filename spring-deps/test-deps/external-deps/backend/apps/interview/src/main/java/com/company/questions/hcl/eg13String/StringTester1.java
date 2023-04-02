package com.company.questions.hcl.eg13String;

public class StringTester1 {
    public static void main(String[] args) {
        String s1 = "hello"; // SCP
        String s2 = new String("hello"); // Heap
        String s3 = "hello"; // SCP

        if (s1 == s2) {
            System.out.println("s1 s2 equal");
        } else {
            System.out.println("s1 s2 not equal");
        }

        if (s1 == s3) {
            System.out.println("s1 s3 equal");
        } else {
            System.out.println("s1 s3 not equal");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 s2 equal");
        } else {
            System.out.println("s1 s2 not equal");
        }

        if (s1.equals(s3)) { // content comparison
            System.out.println("s1 s3 equal");
        } else {
            System.out.println("s1 s3 not equal");
        }


    }
}
