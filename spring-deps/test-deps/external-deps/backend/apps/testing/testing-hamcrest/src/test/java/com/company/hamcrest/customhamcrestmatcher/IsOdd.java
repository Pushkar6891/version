package com.company.hamcrest.customhamcrestmatcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class IsOdd extends TypeSafeMatcher<Integer> {
    public IsOdd() {
    }

    public static IsOdd isOdd() {
        return new IsOdd();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("we want an odd number");
    }

    @Override
    protected boolean matchesSafely(Integer lhs) {
        return lhs % 2 == 1;
    }
}
