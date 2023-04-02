package com.company.junit5.ashokit.junit5.exception;

public class StringUtils {

    public static int convertToInt(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("String must not be null or empty");
        }

        return Integer.valueOf(str);
    }
}
