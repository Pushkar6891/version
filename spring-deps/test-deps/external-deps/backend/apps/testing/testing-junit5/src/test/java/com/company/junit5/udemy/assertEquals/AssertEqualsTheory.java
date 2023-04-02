package com.company.junit5.udemy.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsTheory {

    @Test
    public void myTestMethod(){
        Assertions.assertEquals(2,2);
        System.out.println("true");
    }
}
