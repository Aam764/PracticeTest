package practiceTest;

import org.testng.annotations.Test;

public class UppserLowerCase {

	@Test(priority = 2)

	public void aMethod() {
		String lower = "WELCOME TO THE WORLD OF SELENIUM";

		String add = lower.toLowerCase();

		System.out.println(add);

	}

	@Test(priority = 1)

	public void bMethod() {

		String lower = "hello selenium";

		String add = lower.toUpperCase();

		System.out.println(add);

	}
}
