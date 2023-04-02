package com.company.functionalinterface;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        search(() -> System.out.println("Linear Search"));
    }

    private static void search(Search search) {
        search.search();
    }
}
