package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {

	@Test
	public void a() {
		Assert.assertTrue(3>12);
		System.out.println("sign up test method");
	}
	
	@Test(dependsOnMethods = {"a"})
	public void b() {
		System.out.println("Login test method");
	}
	
}
