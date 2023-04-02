package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class HamcrestExpressiveSyntaxTest {

    @Test
    void testExpressionMethods() {
        String str1 = "abc def";
        String str2 = "abc def";
        String str3 = "xyz";

        MatcherAssert.assertThat(str1, Matchers.is(str2));
        MatcherAssert.assertThat(str2, Matchers.not(Matchers.equalTo(str3)));
        MatcherAssert.assertThat(str2, Matchers.is(Matchers.not(Matchers.equalTo(str3)))); // reads like a sentence!
    }
}
