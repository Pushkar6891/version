package com.company.junit5.ashokit.junit5.exception;

import com.company.junit5.ashokit.junit5.exception.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testConvertToInt() {
        String input = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.convertToInt(input));
    }
}