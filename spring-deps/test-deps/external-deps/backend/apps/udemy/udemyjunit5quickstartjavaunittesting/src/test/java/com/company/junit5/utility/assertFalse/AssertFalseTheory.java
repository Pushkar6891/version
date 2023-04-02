package com.company.junit5.utility.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertFalseTheory {

    @Test
    public void test1() {
        Assertions.assertFalse(false);
    }

    @Test
    public void test2() {
        Assertions.assertFalse(1 == 2);
    }

    @Test
    public void test3() {
        Assertions.assertFalse("abc".length() == 4);
    }
}
