package practiceTest;

import org.testng.annotations.Test;

public class SwappingNumber {

	@Test

	public static void swapping() {

		int a = 10, b = 15, c;

		c = a;

		a = b;

		b = c;

		System.out.println("Value of a is =" + " " + a);
		System.out.println("Value of b is =" + " " + b);

	}

}
