package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
	StringUtils string = new StringUtils();
	
	@Test
	void testReverse() {
		assertEquals("hsrah",string.reverse("harsh"));
	}
	
	@Test
	void testPalindrome() {
		assertEquals(true,string.isPalindrome("harah"));
	}
	
	@Test
	void testUpperCase() {
		assertEquals("HARSH",string.toUpperCase("harsh"));
	}
}
