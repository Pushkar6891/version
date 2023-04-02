package com.company.junit5.utility;

import java.util.HashSet;

public class StringUtility {

    HashSet<Character> lowercaseVowels = new HashSet<>();
    HashSet<Character> uppercaseVowels = new HashSet<>();

    public StringUtility() {
        lowercaseVowels.add('a');
        lowercaseVowels.add('e');
        lowercaseVowels.add('i');
        lowercaseVowels.add('o');
        lowercaseVowels.add('u');
        uppercaseVowels.add('A');
        uppercaseVowels.add('E');
        uppercaseVowels.add('I');
        uppercaseVowels.add('O');
        uppercaseVowels.add('U');
    }

    public int vowelCount(String str) {
        int vowelCounter = 0;
        if (str == null || str.isBlank() || str.isEmpty() || str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (lowercaseVowels.contains(c)) {
                vowelCounter++;
            } else if (uppercaseVowels.contains(c)) {
                vowelCounter++;
            }
        }
        return vowelCounter;
    }

    public boolean isCapitalized(String str) {
        if (str == null || str.isBlank() || str.isEmpty() || str.length() == 0) {
            return false;
        }
        return uppercaseVowels.contains(str.charAt(0));
    }
}
