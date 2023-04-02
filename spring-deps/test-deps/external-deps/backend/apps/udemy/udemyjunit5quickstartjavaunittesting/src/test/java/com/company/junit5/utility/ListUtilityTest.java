package com.company.junit5.utility;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListUtilityTest {

    private static List<Integer> numbers;
    private static File file;
    private static Scanner scanner;

    @BeforeAll
    public static void init() throws FileNotFoundException {
        numbers = new LinkedList<>();
        file = new File("src/test/resources/numbers.txt");

        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            int number = Integer.parseInt(scanner.next());
            numbers.add(number);
        }
    }

    @Test
    public void testGetMaxElement() {
        int actual = ListUtility.getMaxElement(numbers);
        int expected = 40;
        Assertions.assertEquals(expected, actual);
    }

    @AfterAll
    public static void tearDown() {
        scanner.close();
    }

}