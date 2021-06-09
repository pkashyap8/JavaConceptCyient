package com.cyient.loops;

public class CheckLoops {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 80, 55, 42, 8, 64, 25, 35 };
		int size = numbers.length;
		// System.out.println(size);
		for (int i = 0; i < size; i++) {
			// System.out.println(i);
			if (numbers[i] <= 50) {
				System.out.println(numbers[i]);
			}
		}

		String[] colors = { "red", "yellow", "pink", "green" };

		for (String b : colors) {
			System.out.println(b);
		}
	}
}
