package SeleniumPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		
		// Setting the property of chrome browser and passing chromedriver.exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching website using get method
		driver.navigate().to("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title = driver.getTitle();


	}

}
