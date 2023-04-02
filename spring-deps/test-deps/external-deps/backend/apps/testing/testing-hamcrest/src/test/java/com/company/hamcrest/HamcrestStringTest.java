package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HamcrestStringTest {

    @Test
    void testStringLength() {

        String str = "abc";
        Assert.assertEquals(3,str.length());
        MatcherAssert.assertThat(str.length(), Matchers.equalTo(3));
        MatcherAssert.assertThat("my optional custom error message", str.length(), Matchers.equalTo(3));
    }

    @Test
    void testString_startsWith_endsWith_containsString_equalTo() {
        String str1 = "abc def";
        String str2 = "abc def";
        MatcherAssert.assertThat(str1, Matchers.startsWith("ab"));
        MatcherAssert.assertThat(str1, Matchers.endsWith("ef"));
        MatcherAssert.assertThat(str1, Matchers.containsString("c de"));
        MatcherAssert.assertThat(str1, Matchers.equalTo(str2));
    }

    @Test
    void testString_startsWithIgnoringCase_endsWithIgnoringCase_containsStringIgnoringCase_equalToIgnoringCase() {
        String str1 = "abcdef";
        String str2 = "aBCdef";
        MatcherAssert.assertThat(str1, Matchers.startsWithIgnoringCase("aB"));
        MatcherAssert.assertThat(str1, Matchers.endsWithIgnoringCase("dEF"));
        MatcherAssert.assertThat(str1, Matchers.containsStringIgnoringCase("BcD"));
        MatcherAssert.assertThat(str1, Matchers.equalToIgnoringCase(str2));
    }

    @Test
    void testEmptyString() {
        String str = "";
        MatcherAssert.assertThat(str, Matchers.emptyString());
    }

    @Test
    void testBlankString() {
        String str = "        ";
        MatcherAssert.assertThat(str, Matchers.blankString());
    }

    @Test
    void testEmptyOrNullString() {
        String str1 = "";
        String str2 = null;
        MatcherAssert.assertThat(str1, Matchers.emptyOrNullString());
        MatcherAssert.assertThat(str2, Matchers.emptyOrNullString());
    }

    @Test
    void testBlankOrNullString() {
        String str1 = "        ";
        String str2 = null;
        MatcherAssert.assertThat(str1, Matchers.blankOrNullString());
        MatcherAssert.assertThat(str2, Matchers.blankOrNullString());
    }

}
