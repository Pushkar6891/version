package com.company.junit5.utility.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertTrueTheory {

    @Test
    public void test1() {
        Assertions.assertTrue(true);
    }

    @Test
    public void test2() {
        Assertions.assertTrue(2 == 2);
    }

    @Test
    public void test3() {
        Assertions.assertTrue("abc".length() == 3);
    }
}
