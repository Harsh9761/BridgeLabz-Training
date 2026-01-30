package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {
	Calculator calculator = new Calculator();

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
