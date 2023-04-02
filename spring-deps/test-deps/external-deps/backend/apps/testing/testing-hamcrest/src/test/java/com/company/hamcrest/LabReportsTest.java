package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LabReportsTest {

    @Test
    void testLabReports() {
        List<Integer> labReportsScores = Arrays.asList(70, 80, 85, 75, 90, 90, 74, 96, 85, 90);
        MatcherAssert.assertThat(labReportsScores.size(), Matchers.greaterThanOrEqualTo(8));
        MatcherAssert.assertThat(labReportsScores, Matchers.everyItem(Matchers.greaterThanOrEqualTo(70)));
    }
}
