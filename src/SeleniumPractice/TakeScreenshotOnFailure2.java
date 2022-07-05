package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {


TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();

@Test(priority=1)
public void doLogin() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
	t1.driver = new ChromeDriver();
	t1.driver.manage().window().maximize();
	t1.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	t1.driver.get("https://www.facebook.com");
	
	Thread.sleep(3000);
	
	t1.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
	t1.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testlast");

	t1.driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	
	
}

@Test(priority=2)
public void assertionCheck() {
	String actual1="abc";
	String expected1="abc";
	
	Assert.assertEquals(actual1, expected1);
}

@AfterMethod
public void takScreenshotOnFailure(ITestResult result) throws Exception {
	t1.captureScreenshot(result);
    t1.driver.quit();
}


}


