package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws Exception,ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Implicit wait syntax
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Handling Alert
		
		System.out.println(driver.switchTo().alert().getText());
		String expectedAlertText = "Please enter a valid user name";
		
		if(driver.switchTo().alert().getText().equalsIgnoreCase(expectedAlertText)) {
			System.out.println("Alert get verified");
		}
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}

	}

