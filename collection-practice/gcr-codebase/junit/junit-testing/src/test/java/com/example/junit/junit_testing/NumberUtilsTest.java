package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
	
	NumberUtils number = new NumberUtils();
	
	@Test
	void testEven() {
		assertEquals(true,number.isEven(8));
	}
}
