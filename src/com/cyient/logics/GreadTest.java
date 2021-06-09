package com.cyient.logics;

public class GreadTest {
	public static void main(String[] args) {
		int m1 = 79;

		if (m1 <= 33) {
			System.out.println("F");
		}

		else if (m1 > 33 && m1 <= 59) {
			System.out.println("D");
		}

		else if (m1 >= 60 && m1 <= 79) {
			System.out.println("C");
		} else if (m1 >= 80 && m1 <= 89) {
			System.out.println("B");
		} else if (m1 >= 90) {
			System.out.println("A");
		}
	}

}
