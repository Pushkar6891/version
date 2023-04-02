package com.company.junit5.utility.string;

import com.company.junit5.utility.StringUtility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    @Test
    public void testVowelCount() {
        String a = "hello";
        String b = "xyz";
        String c = "";
        String d = null;

        StringUtility stringUtility = new StringUtility();
        Assertions.assertEquals(2, stringUtility.vowelCount(a));
        Assertions.assertEquals(0, stringUtility.vowelCount(b));
        Assertions.assertEquals(0, stringUtility.vowelCount(c));
        Assertions.assertEquals(0, stringUtility.vowelCount(d));
    }

    @Test
    public void testIsCapitalized() {
        String a = "hello";
        String b = "xyz";
        String c = "";
        String d = null;
        String e = "Apple";
        String f = "apple";
        String g = "grape";

        StringUtility stringUtility = new StringUtility();
        Assertions.assertFalse(stringUtility.isCapitalized(a));
        Assertions.assertFalse(stringUtility.isCapitalized(b));
        Assertions.assertFalse(stringUtility.isCapitalized(c));
        Assertions.assertFalse(stringUtility.isCapitalized(d));
        Assertions.assertTrue(stringUtility.isCapitalized(e));
        Assertions.assertFalse(stringUtility.isCapitalized(f));
        Assertions.assertFalse(stringUtility.isCapitalized(g));
    }

}