package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesLogic {

	public static void main(String[] args) throws Exception {

		//specify the location path of properties file
		File src = new File("C:\\Selenium\\FST_Selenium\\SeleniumPractice\\Repository\\login.properties");
		
		//we need to create FileInputStream object 
		
		FileInputStream fis = new FileInputStream(src);
		
		// create properties class object to read properties
		Properties prop = new Properties();
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//get property will accept the key and it will return the value for the same key
		driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys("Abcd@email.com");
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys("1234");
		

	}

}
