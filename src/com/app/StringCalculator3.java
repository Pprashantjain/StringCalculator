package com.app;

public class StringCalculator3 {

	// task2
	public static int Add(String numbers) {
		if (numbers.contains(",") || numbers.contains("\n")) {
			String[] str = numbers.replaceAll("(\\r\\n|\\n)", ",").split(",");
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
