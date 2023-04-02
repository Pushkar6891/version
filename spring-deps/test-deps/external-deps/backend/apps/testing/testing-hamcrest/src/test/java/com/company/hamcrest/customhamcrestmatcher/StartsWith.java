package com.company.hamcrest.customhamcrestmatcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class StartsWith extends TypeSafeMatcher<String> {
    char c;
    String lhs;

    public StartsWith(char c) {
        this.c = c;
    }

    public static StartsWith startsWith(char c) {
        return new StartsWith(c);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(lhs + "does not start with " + c);
    }


    @Override
    protected boolean matchesSafely(String lhs) {
        if (lhs.length() == 0) return false;
        else {
            this.lhs = lhs;
            return lhs.charAt(0) == c;
        }
    }
}
