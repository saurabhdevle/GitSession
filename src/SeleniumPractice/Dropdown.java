package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);

		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));

		Select month = new Select(birthMonth);
		Thread.sleep(3000);
		
		month.selectByVisibleText("Mar");
		Thread.sleep(3000);
		month.selectByValue("12");
		Thread.sleep(3000);
		month.selectByIndex(10);
		Thread.sleep(3000);
		
		System.out.println(month.getFirstSelectedOption().getText());
		
		List<WebElement> dropdown = month.getOptions();
		System.out.println(dropdown.size());

		for(int i=0;i<dropdown.size();i++) {
			String dropDownValues = dropdown.get(i).getText();
		
			if(dropDownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
			}
		}
		
		
		//driver.close();

	}

}
