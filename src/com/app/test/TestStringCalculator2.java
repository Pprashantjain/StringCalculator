package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.StringCalculator2;

public class TestStringCalculator2 {

	// task2
	@Test
	public void testAdd() {
		assertEquals(180, StringCalculator2.Add("10,50,15,35,40,30"));
		assertEquals(6, StringCalculator2.Add("1,2,3"));
		assertEquals(1, StringCalculator2.Add("1"));
		assertEquals(5, StringCalculator2.Add("2,3"));
		assertEquals(3, StringCalculator2.Add("1,2,"));
		assertEquals(1, StringCalculator2.Add("1,,"));
		assertEquals(0, StringCalculator2.Add(",,"));
	}
}
