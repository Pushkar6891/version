package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class RideEligibilityTest {

    @Test
    void testRideEligibility() {
        Person pushkar = Person.builder().name("Pushkar").age(30).height(68).build();
        MatcherAssert.assertThat(pushkar.getAge(), Matchers.greaterThan(10));
        MatcherAssert.assertThat(pushkar.getHeight(), Matchers.greaterThanOrEqualTo(48));

        Person amit = Person.builder().name("Amit").age(10).height(40).build();
        MatcherAssert.assertThat(amit.getAge(), Matchers.greaterThanOrEqualTo(10));
        MatcherAssert.assertThat(amit.getHeight(), Matchers.not(Matchers.greaterThanOrEqualTo(48)));
    }
}
