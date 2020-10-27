package com.app;

public class StringCalculator2 {

	// task2
	public static int Add(String numbers) {
		if (numbers.contains(",")) {
			String[] str = numbers.split(",");
			int res = 0;
			for (String i : str) {
				res = res + Integer.parseInt(i);
			}
			return res;
		} else {
			return numbers.equals("") ? 0 : Integer.parseInt(numbers);
		}
	}
}
