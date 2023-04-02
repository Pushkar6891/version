package com.company.junit5.ashokit.junit5.parameterizedtestcsvfile;

import com.company.junit5.ashokit.junit5.parameterizedtestcsvfile.EvenOrOddNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class EvenOrOddNumberTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void testEvenOrOddNumber(String input, String expected) {
        EvenOrOddNumber evenOrOddNumber = new EvenOrOddNumber();
        String actual = evenOrOddNumber.evenOrOddNumber(Integer.parseInt(input));
        Assertions.assertEquals(expected, actual);
    }
}
