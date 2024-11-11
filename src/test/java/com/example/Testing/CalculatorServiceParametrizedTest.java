package com.example.Testing;

import com.example.Testing.Service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParametrizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({"5, 5, 10", "10, 2, 12"})
    public void testPlus(int num1, int num2, int result) {
        assertEquals(num1 + " + " + num2 + " = " + result, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"5, 2, 3", "10, 4, 6"})
    public void testMinus(int num1, int num2, int result) {
        assertEquals(num1 + " - " + num2 + " = " + result, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"3, 4, 12", "5, 6, 30"})
    public void testMultiply(int num1, int num2, int result) {
        assertEquals(num1 + " x " + num2 + " = " + result, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"6, 2, 3", "10, 5, 2"})
    public void testDivide(int num1, int num2, int result) {
        assertEquals(num1 + " / " + num2 + " = " + result, calculatorService.divide(num1, num2));
    }
}
