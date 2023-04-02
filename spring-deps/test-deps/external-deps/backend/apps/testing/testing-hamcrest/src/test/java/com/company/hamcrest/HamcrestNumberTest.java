package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class HamcrestNumberTest {

    @Test
    void testNumbers(){
        MatcherAssert.assertThat(10, Matchers.lessThan(20));
        MatcherAssert.assertThat(10, Matchers.lessThanOrEqualTo(20));
        MatcherAssert.assertThat(10, Matchers.equalTo(10));
        MatcherAssert.assertThat(10, Matchers.greaterThan(0));
        MatcherAssert.assertThat(10, Matchers.greaterThanOrEqualTo(0));
    }

    @Test
    void testFloatingPointValues(){
        double d = 3.14;
        MatcherAssert.assertThat(d,Matchers.closeTo(3.5,0.5));
    }
}
