package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://money.rediff.com/gainers");

		// Print the name of compnay

		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")).getText());

		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")));

		// Create list of all company

		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies :" + allCompanies.size());

		// Create a list of all companies price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Companies :" + currentPrice.size());

		String companyName = "Nitin Castings";

		for (int i = 0; i < allCompanies.size(); i++) {

			if (allCompanies.get(i).getText().equalsIgnoreCase(companyName)) {
				System.out.println(allCompanies.get(i).getText() + "==" + currentPrice.get(i).getText());

				allCompanies.get(i).click();
				break;

			}

		}
	}
}