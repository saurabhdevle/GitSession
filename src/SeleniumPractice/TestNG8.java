package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG8 {

	@Test
	public void assertionCheck() {
		
		String expectedMsg = "User Created Sucessfully";
		
		String actualMsg = "User Created Sucessfully";
		
		Assert.assertEquals(actualMsg, expectedMsg);
	
		System.out.println("verification sucessfully");
	}
	
}
