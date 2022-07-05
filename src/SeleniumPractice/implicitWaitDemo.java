package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWaitDemo {

	public static void main(String[] args) {


		// Setting the property of chrome browser and passing chromedriver.exe path
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				// launching website using get method

				
	
				driver.manage().window().maximize();
				
				// implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
				driver.get("https://www.google.com/");
				
				driver.findElement(By.xpath("//*[@name='q']")).sendKeys("how stuff works");
				
				
				List<WebElement> allSearch = driver.findElements(By.xpath("//*[@role='listbox']//li"));
				System.out.println(allSearch.size());


				for (int i=0;i<allSearch.size();i++) {
					String allSearchList = allSearch.get(i).getText();
					
				
					String finalResult = "how stuff works science" ;
					
					if(allSearchList.equalsIgnoreCase(finalResult)) {
						allSearch.get(i).click();
					
						System.out.println("You have selected " + finalResult);
						break;
					}
					
				
				}
				
				
				driver.close();
	}

}
