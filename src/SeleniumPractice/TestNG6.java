package SeleniumPractice;

import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void a() {
		System.out.println("a test method");
	}

	@Test
	public void b() {
		System.out.println("b test method");
	}

	@Test(invocationCount=2)
	public void c() {
		System.out.println("c test method");
	}

	

}
