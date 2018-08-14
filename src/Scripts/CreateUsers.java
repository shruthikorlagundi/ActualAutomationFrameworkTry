package Scripts;

import org.testng.annotations.Test;

import Genric.BaseTest;
import Genric.Lib;
import Pompages.ActiTIMEHomePage;
import Pompages.CreateNewUserPage;

public class CreateUsers extends ValidLoginTest{

	@Test
	public void createUser() throws InterruptedException{
		ValidLoginTest vlt= new ValidLoginTest();
		vlt.validLoginTest();
		ActiTIMEHomePage athp= new ActiTIMEHomePage(driver);
		athp.clickUsers();
		
		CreateNewUserPage cnp= new CreateNewUserPage(driver);
		cnp.setUsernameTextfield(Lib.getCellValue("UserDetails", 1, 0));
		cnp.setPasswordTextfield(Lib.getCellValue("UserDetails", 1, 1));
		cnp.setRetypePasswordTextfield(Lib.getCellValue("UserDetails", 1, 2));
		cnp.setFirstNameTextfield(Lib.getCellValue("UserDetails", 1, 3));
		cnp.setLastNameTextfield(Lib.getCellValue("UserDetails", 1, 4));
		cnp.clickCreateUserBtn();
		
		
	}
	
	
}
