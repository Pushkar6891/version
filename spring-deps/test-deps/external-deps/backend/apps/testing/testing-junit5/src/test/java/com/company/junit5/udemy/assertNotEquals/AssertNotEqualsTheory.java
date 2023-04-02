package com.company.junit5.udemy.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNotEqualsTheory {

    @Test
    public void myTestMethod(){
        Assertions.assertNotEquals(1,2);
    }
}
