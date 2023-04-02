package com.company.questions.hcl.eg04defaultMethods;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodTester {
    public static void main(String[] args) {
List list = new ArrayList<>();
    }
}

// Why default method added in Java 8?
// Backward Compatibility old interface can use Lambda Expression Capability

// List -> Collection -> Iterable
// forEach()
// new methods can be added without breaking existing functionality

// multiple default methods

