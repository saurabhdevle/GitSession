package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlyWait1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Implicitlywait syntax
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.get("https://www.facebook.com");

		
String url = driver.getCurrentUrl();
System.out.println(url);

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();


driver.findElement(By.xpath("//input[@value='1']")).click();


driver.findElement(By.xpath("//input[@value='2']")).click();


driver.findElement(By.xpath("//input[@value='-1']")).click();

		

	}

}
