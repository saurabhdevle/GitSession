package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertLogic2 {

	@Test
	public void testcase2() {

		int a=10;
		int b=20;
		
		String ExpectedTitle = "Google";
		String ActualTitle = "Google";
		
		//Assert.assertEquals(ActualTitle, ExpectedTitle);

		Assert.assertEquals(ActualTitle, ExpectedTitle, "ActualTitle & ExpectedTitle are not equal");
		System.out.println("Assertion Pass");

		
		Assert.assertFalse(a>b, "assertFalse condition get failed");
		
		System.out.println("AssertFalse executed");
	
		Assert.assertTrue(a>b, "test case failed");
		System.out.println("Assertion checking");
	
	}
	
	
	@Test
	public void testCase3() {
		//hence the scope of the assertion will be limited to testcase()2 only
		
		System.out.println("Hello");
	}
	
}
