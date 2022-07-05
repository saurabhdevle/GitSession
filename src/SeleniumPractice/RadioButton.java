
package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
//		System.setProperty("WebDriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
String url = driver.getCurrentUrl();
System.out.println(url);

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@value='1']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@value='2']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@value='-1']")).click();


	}

}
