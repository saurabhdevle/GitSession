package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG9 {

WebDriver driver;	
	@BeforeClass
	public void setEnv() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@DataProvider
	public Object[][] dataSet(){
		Object arr[][] = new Object [2][2];
		
		arr[0][0] = "Email";
		arr[0][1] = "pass1";
		arr[1][0] = "Emai2";
		arr[1][1] = "pass2";
		
		
		
		return arr;
		
	}
	
	@Test(dataProvider="dataSet")
	public void enterCredential(String userName,String passWord) {
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);
	
	
	}
	
}
