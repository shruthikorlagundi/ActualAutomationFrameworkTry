package Genric;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstants {

	public WebDriver driver;

	static {
		System.setProperty(GECKO_KEY, GECKO_PATH);
		System.setProperty(CHROME_KEY, CHROME_PATH);
		System.setProperty(IE_KEY, IE_PATH);
	}

	@BeforeMethod
	public void openApplication() {

		driver = new ChromeDriver();
		String propertyValue = Lib.getPropertyValue("URL");
		driver.get(propertyValue);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeApplication(ITestResult result) {
if(ITestResult.FAILURE==result.getStatus()){
	Lib.captureScreenshot(driver,result.getName());
	
}
		//driver.close();
	}

}
