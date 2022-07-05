package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertLogic1 {
	
	
	WebDriver driver; // globally declared webdriver ref.
	
	@Test
	public void testCase1() throws Exception {
		String expected = "Sorry, we don't recognize this email.";
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAAl_DT4dTZ2zLUJHy_UYZTaUJyS5pQG_Cw_trp0fbI-DQzFHAoK3PptXP2fmj5mxIcB405n9QHN2nSEZLm_NK7uDkaGlME5l5_FeHDrla-M31U1am4plBVSbGpEbbtdv54RjeEvt4hpr6u95YxLIOZMgcvYAYB3m1f3-vzFiF1TN");
	
	//JavaScriptExecutor
	
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("document.getElementById('login-signin').click()");
	
	Thread.sleep(3000);
	
	String actual = driver.findElement(By.id("username-error")).getText();
	
	Assert.assertEquals(actual, expected);
	
	System.out.println("Assertion sucessfully validate");
	}
	

}
