package Pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// declare elements

	public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement unObj;

	@FindBy(xpath = "//input[@name='pwd']")
	WebElement pwdObj;

	@FindBy(id = "loginButton")
	WebElement loginbtnObj;

	// Initialize elements

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// Utilize

	public void setUsername(String username) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		unObj.sendKeys(username);
		
	}

	public void setPassword(String password) {
		pwdObj.sendKeys(password);
		
	}

	public void clickLoginBtn() throws InterruptedException {
		loginbtnObj.click();
		Thread.sleep(5000);
		//unObj.clear();
	
	}

}
