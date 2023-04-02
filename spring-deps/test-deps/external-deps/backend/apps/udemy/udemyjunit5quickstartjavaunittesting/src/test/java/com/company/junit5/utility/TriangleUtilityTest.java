package com.company.junit5.utility;

import com.company.junit5.utility.TriangleUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleUtilityTest {

    @Test
    public void testIsEquilateral() {
        Assertions.assertFalse(TriangleUtility.isEquilateral(2, 3, 4));
        Assertions.assertFalse(TriangleUtility.isEquilateral(2, 3, 4));
        Assertions.assertTrue(TriangleUtility.isEquilateral(4, 4, 4));
    }

    @Test
    public void testIsIsoceles() {
        Assertions.assertFalse(TriangleUtility.isIsoceles(1, 2, 3));
        Assertions.assertTrue(TriangleUtility.isIsoceles(2, 2, 3));
        Assertions.assertTrue(TriangleUtility.isIsoceles(1, 2, 2));
        Assertions.assertTrue(TriangleUtility.isIsoceles(1, 2, 1));
    }
}