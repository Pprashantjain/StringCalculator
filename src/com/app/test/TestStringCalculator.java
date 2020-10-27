package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.StringCalculator;

public class TestStringCalculator {

	@Test
	public void testFindMax() {
		assertEquals(0, StringCalculator.Add(""));
		assertEquals(1, StringCalculator.Add("1"));
		assertEquals(5, StringCalculator.Add("2,3"));
	}
}
