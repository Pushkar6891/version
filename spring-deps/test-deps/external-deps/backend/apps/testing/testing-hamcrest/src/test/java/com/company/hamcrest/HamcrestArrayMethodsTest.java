package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class HamcrestArrayMethodsTest {

    @Test
    void testEmptyArray() {
        String[] stringArr = {};
        MatcherAssert.assertThat(stringArr, Matchers.emptyArray());

        Integer[] numbers = {};
        MatcherAssert.assertThat(numbers, Matchers.emptyArray());

        Car[] cars = {};
        MatcherAssert.assertThat(cars, Matchers.emptyArray());
    }

    @Test
    void testArrayWithElements() {
        String[] animals = {"cat", "dog", "lion"};
        MatcherAssert.assertThat(animals, Matchers.arrayWithSize(3));
        MatcherAssert.assertThat(animals, Matchers.hasItemInArray("cat"));
        MatcherAssert.assertThat(animals, Matchers.arrayContaining("cat", "dog", "lion"));
        MatcherAssert.assertThat(animals, Matchers.arrayContainingInAnyOrder("lion", "cat", "dog"));

    }
}

