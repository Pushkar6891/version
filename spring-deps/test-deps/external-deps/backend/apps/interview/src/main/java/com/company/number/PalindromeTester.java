package com.company.number;

public class PalindromeTester {
    public static void main(String[] args) {
        PalindromeTester obj = new PalindromeTester();
        System.out.println(obj.isPalindromeWithoutUsingLoop("a".toCharArray(), 0, 0));
        System.out.println(obj.isPalindromeWithoutUsingLoop("ab".toCharArray(), 0, 1));
        System.out.println(obj.isPalindromeWithoutUsingLoop("abc".toCharArray(), 0, 2));
        System.out.println(obj.isPalindromeWithoutUsingLoop("abccba".toCharArray(), 0, 5));
        System.out.println(obj.isPalindromeWithoutUsingLoop("aa".toCharArray(), 0, 1));
    }

    private boolean isPalindromeUsingLoop(String str) {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = false;
            }
        }
        return flag;
    }

    public static boolean isPalindromeWithoutUsingLoop(char[] arr, int left, int right) {
        if (arr[left++] != arr[right--])
            return false;
        if (left < right)
            isPalindromeWithoutUsingLoop(arr, left++, right--);
        return true;
    }
}
