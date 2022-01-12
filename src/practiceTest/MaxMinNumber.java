package practiceTest;

import org.testng.annotations.Test;

public class MaxMinNumber {

	@Test

	void maximumNumber() {

		int a = 10;
		int b = 15;
		int c = 50;

		if (a > b && a > c) {
			System.out.println("a is a maximum number");
		} else if (b > a && b > c) {
			System.out.println("b is a maximum number");
		} else {
			System.out.println("c is a maximum number");
		}
	}

	@Test

	void minimumNumber() {

		int a = 10;
		int b = 15;
		int c = 50;

		if (a < b && a < c) {
			System.out.println("a is a minimum number");
		} else if (b < a && b < c) {
			System.out.println("b is a minimum number");
		} else {
			System.out.println("c is a minimum number");

		}

	}

}
