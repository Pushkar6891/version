package com.company.hamcrest.customhamcrestmatcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class Sum extends TypeSafeMatcher<Integer> {

    private final int a,b,c;

    public Sum(final int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static Sum sum(final int a, int b, int c) {
        return new Sum(a,b,c);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("we want to sum numbers");
    }

    @Override
    protected boolean matchesSafely(Integer lhs) {
        return lhs == a + b + c;
    }
}
