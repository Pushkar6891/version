package com.company.hamcrest;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.*;

public class HamcrestCollectionMethodsTest {

    @Test
    void testListCollectionMethods() {
        List<Integer> list = null;
        MatcherAssert.assertThat(list, Matchers.nullValue());

        list = new LinkedList<>();
        MatcherAssert.assertThat(list, Matchers.empty());

        list = Arrays.asList(3, 1, 2, 4);
        MatcherAssert.assertThat(list, Matchers.hasSize(4));
        MatcherAssert.assertThat(list, Matchers.hasItem(1));
        MatcherAssert.assertThat(list, Matchers.hasItems(1, 4, 2));
        MatcherAssert.assertThat(list, Matchers.contains(3, 1, 2, 4));
        MatcherAssert.assertThat(list, Matchers.containsInAnyOrder(2, 4, 3, 1));

        List<Integer> numbers = Arrays.asList(3, 1, 2);

        MatcherAssert.assertThat(numbers.get(0), Matchers.equalTo(3));
        MatcherAssert.assertThat(numbers, Matchers.everyItem(Matchers.greaterThan(0)));
        MatcherAssert.assertThat(numbers, Matchers.everyItem(Matchers.greaterThanOrEqualTo(1)));
        MatcherAssert.assertThat(numbers, Matchers.everyItem(Matchers.lessThan(10)));
        MatcherAssert.assertThat(numbers, Matchers.everyItem(Matchers.lessThanOrEqualTo(3)));
    }

    @Test
    void testSetCollectionMethods() {
        Set<Integer> set = null;
        MatcherAssert.assertThat(set, Matchers.nullValue());

        set = new HashSet<>();
        MatcherAssert.assertThat(set, Matchers.empty());

        set.add(3);
        set.add(4);
        set.add(5);

        MatcherAssert.assertThat(set, Matchers.hasSize(3));
        MatcherAssert.assertThat(set, Matchers.hasItem(3));
        MatcherAssert.assertThat(set, Matchers.hasItems(3, 3));
        MatcherAssert.assertThat(set, Matchers.contains(3, 4, 5));
        MatcherAssert.assertThat(set, Matchers.containsInAnyOrder(3, 5, 4));
    }

    @Test
    void testMapCollectionMethods() {
        Map<String, Integer> inventory = new HashMap<>();
        MatcherAssert.assertThat(inventory, Matchers.anEmptyMap());
        MatcherAssert.assertThat(inventory, Matchers.aMapWithSize(0));

        inventory.put("shoes", 4);
        inventory.put("sneakers", 5);
        inventory.put("shirts", 10);

        MatcherAssert.assertThat(inventory, Matchers.hasKey("shoes"));
        MatcherAssert.assertThat(inventory, Matchers.hasValue(5));
        MatcherAssert.assertThat(inventory, Matchers.hasEntry("shirts", 10));
    }
}
