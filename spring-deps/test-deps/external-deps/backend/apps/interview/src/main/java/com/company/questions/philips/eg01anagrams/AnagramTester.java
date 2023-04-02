package com.company.questions.philips.eg01anagrams;

import java.util.Arrays;

public class AnagramTester {
    public static void main(String[] args) {
        AnagramTester obj = new AnagramTester();
        String s1 = "abc";
        String s2 = "cab";
        System.out.println(obj.areAnagrams(s1, s2));
    }

    private boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
