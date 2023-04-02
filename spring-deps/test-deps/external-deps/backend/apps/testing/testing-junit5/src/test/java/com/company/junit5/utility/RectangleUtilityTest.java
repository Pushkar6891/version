package com.company.junit5.utility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleUtilityTest {

    @Test
    public void testGetArea() {
        Assertions.assertEquals(RectangleUtility.getArea(2, 3), 6);
    }
}
