package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser1 {

	public static void main(String[] args) throws Exception {

		// Setting the property of chrome browser and passing chromedriver.exe path
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// launching website using get method
		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
