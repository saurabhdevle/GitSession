package SeleniumPractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	
	
	@Test
	public void a() {
		System.out.println("a test method");
	}
	
	@Test(enabled = false)
	public void b() {
		System.out.println("b test method");
	}
	
	@Test
	public void c() {
		System.out.println("c test method");
	}
	
	@Test
	public void d() {
		System.out.println("d test method");
	    throw new SkipException("skiiping d test method");
	}
}
