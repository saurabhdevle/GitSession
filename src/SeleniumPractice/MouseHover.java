package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	
		WebElement Electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		WebElement Home = driver.findElement(By.xpath("//div[text()='Home']"));
		
		WebElement Grocery = driver.findElement(By.xpath("//div[text()='Grocery']"));

		Actions act = new Actions(driver);
		
		act.moveToElement(Electronics).build().perform();
		Thread.sleep(3000);
		
		//release mouse hover
		act.keyUp(Electronics, Keys.ALT).build().perform();

		act.contextClick(Home).build().perform();
		
		act.doubleClick(Grocery).build().perform();
		
		
		
	}

}
