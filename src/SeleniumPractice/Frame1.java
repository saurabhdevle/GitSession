package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.paytm.com");
		
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
	    int totalIframe = driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println(totalIframe);
	
	    for(int i=0; i<totalIframe;i++) {
	    	driver.switchTo().frame(i);
	    
	    	 if(driver.findElement(By.xpath("//span[@class='ng-scope']")).isDisplayed()){

	    		 driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
	    	 }else{
	    		 System.out.println("Contoller is out of frame");
	    	 }
	    }
	    
	}
}
