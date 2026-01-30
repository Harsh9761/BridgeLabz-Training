package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DateFormatTest {
	DateFormat formatter = new DateFormat();

    @Test
    void testValidDate() {
        assertEquals("25-12-2024", formatter.formatDate("2024-12-25"));
    }

    @Test
    void testInvalidDate() {
        assertEquals("Invalid date", formatter.formatDate("25-12-2024"));
    }
}
