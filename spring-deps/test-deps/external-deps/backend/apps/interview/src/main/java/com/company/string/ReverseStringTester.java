package com.company.string;

public class ReverseStringTester {
    public static void main(String[] args) {
        ReverseStringTester obj = new ReverseStringTester();
        System.out.println(obj.reverseString("John Cena"));
    }

    private String reverseString(String str) {
        return reversal(str, 0, "");
    }

    private String reversal(String str, int i, String currRev) {
        if (i == str.length()) {
            return currRev;
        }

        currRev = currRev + str.charAt(str.length() - i - 1);
        return reversal(str, i + 1, currRev);
    }
}
