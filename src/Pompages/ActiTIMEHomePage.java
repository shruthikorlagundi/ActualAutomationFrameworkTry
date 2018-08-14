package Pompages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIMEHomePage {

 public	static WebDriver driver;
	
	// declare objects

	@FindBy(xpath = "//span[contains(text(),'Help & Support')]")
	WebElement helpAndSupportObj;

	@FindBy(xpath = "//div[contains(text(),'About actiTIME')]")
	WebElement aboutActiTimeObj;

	@FindBy(xpath = "//td[contains(text(),'3.1 (build 15563), Auto-installation package')]")
	WebElement productVersionObj;

	@FindBy(xpath = "(//img[@class='sizer'])[3]")
	WebElement usersObj;

	@FindBy(xpath = "(//img[@class='sizer'])[1]")
	WebElement tasksObj;

	@FindBy(xpath = "(//img[@class='sizer'])[2]")
	WebElement reportsObj;

	@FindBy(xpath = "(//img[@class='sizer'])[4]")
	WebElement workschedulObj;

	// initialize elements

	public ActiTIMEHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilize

	public void clickUsers() {
		usersObj.click();
	}

	public void clickTasks() {
		tasksObj.click();
	}

	public void clickReports() {
		reportsObj.click();
	}

	public void clickWorkschedule() {
		workschedulObj.click();

	}

	public void clickHelpAndSupporbtn() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		helpAndSupportObj.click();
	}

	public void clickaboutActiTimebtn() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		aboutActiTimeObj.click();
	}

	public String getProductVersionText() {
		String productVersionText = productVersionObj.getText();
		return productVersionText;

	}

}
