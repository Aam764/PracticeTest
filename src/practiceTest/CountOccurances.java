package practiceTest;

import org.testng.annotations.Test;

public class CountOccurances {

	
	@Test
	
	void countTotal() {
		
		String s = "mumbai";
		
		int totalcount = s.length();
		
		int totalcount_afterremove = s.replace("m", "").length();
		
		int count = totalcount - totalcount_afterremove;
		
		System.out.println("Number occurances of a is " +count);
		
	}




}
