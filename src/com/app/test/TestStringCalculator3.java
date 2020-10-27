package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.StringCalculator3;

public class TestStringCalculator3 {

	// task2
	@Test
	public void testAdd() {
		assertEquals(6, StringCalculator3.Add("1\n2,3"));
		assertEquals(6, StringCalculator3.Add("1\n2\n3"));
	}
}
