package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class ThermometerAccuracyTest {

    @Test
    void testThermometerAccuracy() {
        double[] actual = {22.1, 25.0, 33.4, 56.2};
        double[] thermometerValues = {22.0, 24.8, 33.4, 56.1};

        for (int i = 0; i < actual.length; i++) {
            MatcherAssert.assertThat(thermometerValues[i], Matchers.closeTo(actual[i], 0.2));
        }
    }
}
