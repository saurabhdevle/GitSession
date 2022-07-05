package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Handling cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('email').value='xyz@email.com'");
		
		
		//scroll down 
		
		jse.executeScript("window.scrollBy(0,200)");
		
		//scroll up
		
		jse.executeScript("window.scrollBy(0,-200)");
		
		//click on create new account by using JSE
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		jse.executeScript("arguments[0].click()",createAccount);
		
	}
}
