package com.company;

import com.company.model.Person;

@FunctionalInterface
public interface CheckPerson {
    boolean test(Person person);
}
