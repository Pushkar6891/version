package com.company.hamcrest.customhamcrestmatcher;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class AlphaNumeric extends TypeSafeMatcher<String> {
    public AlphaNumeric() {
    }

    public static AlphaNumeric alphaNumeric() {
        return new AlphaNumeric();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("alphaNumeric");
    }

    @Override
    protected boolean matchesSafely(String lhs) {
        if (lhs.length() == 0)
            return false;
        else {
            for (int i = 0; i < lhs.length(); i++) {
                char c = lhs.charAt(i);
                if (isAlphaNumericCharacter(c))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    private boolean isAlphaNumericCharacter(char c) {
        int asciivalue = (int) c;
        if (asciivalue >= 48 && asciivalue <= 57)
            return true;
        else if (asciivalue >= 65 && asciivalue <= 90)
            return true;
        else if (asciivalue >= 97 && asciivalue <= 122)
            return true;
        else
            return false;
    }
}
