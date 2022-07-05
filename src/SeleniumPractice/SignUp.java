package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


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


driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testlast");


List<WebElement> radios=driver.findElements(By.xpath("//input[contains(@type,'radio')]"));

System.out.println(radios.size());  // 3

System.out.println(radios.get(1).isEnabled());//true
radios.get(1).click(); //click

System.out.println(radios.get(0).isDisplayed());
System.out.println(radios.get(1).isSelected());

radios.get(2).click(); // click on custom button 

System.out.println(radios.get(1).isSelected());


driver.close();

	}

		
	}


