package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testcase1() {
		
		String expectedValue="Google";
		String actualValue="Google";
		
		try {
			Assert.assertEquals(actualValue, expectedValue ,"Actual and expected value not equal");
		}catch(AssertionError a) {
			System.out.println(a);
		}
		System.out.println("We are checking assertion");
	}
}
