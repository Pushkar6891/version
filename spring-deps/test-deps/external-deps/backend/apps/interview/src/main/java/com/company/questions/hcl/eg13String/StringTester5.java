package com.company.questions.hcl.eg13String;

public class StringTester5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 = s2);// abc
        String s3 = new String("pqr");
        String s4 = new String("pqr");
        System.out.println(s3 = s4);// pqr
    }
}
