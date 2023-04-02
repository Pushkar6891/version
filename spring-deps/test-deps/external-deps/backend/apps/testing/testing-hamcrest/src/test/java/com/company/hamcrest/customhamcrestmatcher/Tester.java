package com.company.hamcrest.customhamcrestmatcher;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    void shouldPassIfOddNumberIsPassed() {
        int lhs = 5;
        MatcherAssert.assertThat(lhs, IsOdd.isOdd());
    }

    @Test
    void testSum() {
        int lhs = 60;
        MatcherAssert.assertThat(lhs, Sum.sum(10, 20, 30));
    }

    @Test
    void testStartsWith() {
        MatcherAssert.assertThat("Banana", StartsWith.startsWith('B'));
        MatcherAssert.assertThat("Banana", Matchers.not(StartsWith.startsWith('b')));
        MatcherAssert.assertThat("", Matchers.not(StartsWith.startsWith('b')));
    }

    @Test
    void testAlphanumeric(){
        MatcherAssert.assertThat("apple",Matchers.is(AlphaNumeric.alphaNumeric()));
        MatcherAssert.assertThat("123xyz",Matchers.is(AlphaNumeric.alphaNumeric()));
        MatcherAssert.assertThat("1-2-3",Matchers.is(Matchers.not(AlphaNumeric.alphaNumeric())));
        MatcherAssert.assertThat("",Matchers.is(Matchers.not(AlphaNumeric.alphaNumeric())));
    }
}
