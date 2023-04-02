package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    private static CalculatorService calculatorService;
    @InjectMocks
    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
    }

    @Test
    public void shouldPerform() {
        Mockito.when(calculatorService.sum(2.0, 3.0)).thenReturn(5.0);
        Assertions.assertEquals(10.0, calculator.perform(2.0, 3.0));
        Mockito.verify(calculatorService).sum(2.0, 3.0);
        Mockito.verify(calculatorService, Mockito.atLeastOnce()).sum(2.0, 3.0);
        Mockito.verify(calculatorService, Mockito.times(1)).sum(2.0, 3.0);
    }

}
