package com.company.junit5.ashokit.junit5.parameterizedtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "radar", "madam", "racecar"})
    void testIsPalindrome(String str) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        boolean actual = palindromeCheck.isPalindrome(str);
        Assertions.assertTrue(actual);
    }
}