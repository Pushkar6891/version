package com.company.junit5.ashokit.junit5.parameterizedtest;

import java.util.Objects;

public class PalindromeCheck {

    public boolean isPalindrome(String str) {
        if (str.length() == 0 || Objects.isNull(str) || str.isEmpty() || str.isBlank()) {
            return true;
        }

        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
