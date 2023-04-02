package com.company.questions.hcl.eg13String;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        String str = "Pushkar";
        System.out.println(obj.reverse(str));
    }

    private String reverse(String str) {
        int n = str.length();
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }


}
