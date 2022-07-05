package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {

			// Creating ref of take screenshot interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Called method to capture screenshot in terms of file
			File src = ts.getScreenshotAs(OutputType.FILE);

			
			//copy file to specific location
			// ./ means I want to store image at project level
			FileUtils.copyFile(src,new File("./Screenshot" +result.getName() + ".png"));
		}
	}
}
