package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	// declare elements

	@FindBy(xpath = "(//input[@type='button'])[3]")
	WebElement createNewUserButton;

	// initialize

	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilize

	public void clickCreateNewUserButton() {
		createNewUserButton.click();
	}

}
