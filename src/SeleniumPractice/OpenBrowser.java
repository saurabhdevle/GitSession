package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Setting the property of chrome browser and passing chromedriver.exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

		//
		WebDriver driver = new ChromeDriver();
		// launching website using get method
		driver.get("https://www.facebook.com/");

		// current url
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// current title
		String title = driver.getTitle();
		System.out.println(title);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
	//	driver.close();// close current driver instance window
		
		//driver.quit(); // close all driver instance window
	}

}
