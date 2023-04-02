package com.company.questions.hcl.eg13String;

public class StringTester6 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        s2 = s2.intern(); // reference moved from Heap to SCP
        System.out.println(s1 == s2);// true
    }
}
