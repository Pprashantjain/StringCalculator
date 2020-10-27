package com.app;

public class StringCalculator {

	public static int Add(String numbers) {
		if (numbers.contains(",")) {
			String[] str = numbers.split(",");
			return Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
		} else {
			return numbers.equals("") ? 0 : Integer.parseInt(numbers);
		}
	}
}
