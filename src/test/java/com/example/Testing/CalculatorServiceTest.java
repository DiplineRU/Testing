package com.example.Testing;

import com.example.Testing.Service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void testPlus() {
        assertEquals("5 + 5 = 10", calculatorService.plus(5, 5));
    }

    @Test
    public void testMinus() {
        assertEquals("5 - 5 = 0", calculatorService.minus(5, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals("5 x 5 = 25", calculatorService.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals("5 / 5 = 1", calculatorService.divide(5, 5));
    }

    @Test
    public void testDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(25, 0);
        });

        assertEquals("На ноль делить нельзя", exception.getMessage());

    }
}