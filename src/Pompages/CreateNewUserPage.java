package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {

	@FindBy(xpath = "//input[@name='username']")
	WebElement userNameTextfield;

	@FindBy(xpath = "//input[@name='passwordText']")
	WebElement passwordTextfield;

	@FindBy(xpath = "//input[@name='passwordTextRetype']")
	WebElement retypePasswordTextfield;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstNameTextfield;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastNameTextfield;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement createUserBtn;

	@FindBy(xpath="(//input[@type='button'])[3]")
	WebElement cancelBtn;
	
	
	
	
	public CreateNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUsernameTextfield(String username) {
		userNameTextfield.sendKeys(username);
	}

	public void setPasswordTextfield(String password) {
		passwordTextfield.sendKeys(password);
	}

	public void setRetypePasswordTextfield(String retypepassword) {
		retypePasswordTextfield.sendKeys(retypepassword);
	}

	public void setFirstNameTextfield(String firstname) {
		firstNameTextfield.sendKeys(firstname);
	}

	public void setLastNameTextfield(String lastname) {
		lastNameTextfield.sendKeys(lastname);
	}

	public void clickCreateUserBtn() {
		createUserBtn.click();
	}

	public void clickCancelBtn(){
		cancelBtn.click();
	}
}
