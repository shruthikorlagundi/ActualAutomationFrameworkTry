package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Genric.BaseTest;
import Genric.Lib;
import Pompages.ActiTIMEHomePage;
import Pompages.LoginPage;

@Test
public class VerifyActiTimeProductVersion extends BaseTest {

	public void verifyActiTimeProductVersion() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		try {
			lp.setUsername(Lib.getCellValue("ValidCredentials", 1, 0));
			Thread.sleep(5000);
			lp.setPassword(Lib.getCellValue("ValidCredentials", 1, 1));
			Thread.sleep(5000);
			lp.clickLoginBtn();
		} catch (Exception e) {
		}
		ActiTIMEHomePage ahp = new ActiTIMEHomePage(driver);
		ahp.clickHelpAndSupporbtn();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'About actiTIME')]")));
		ahp.clickaboutActiTimebtn();
		Thread.sleep(5000);
		/*
		 * String actualProductVersionText = ahp.getProductVersionText(); String
		 * expectedProductVersionText =
		 * Lib.getPropertyValue("PRODUCTVERSIONTEXT"); SoftAssert sa = new
		 * SoftAssert(); sa.assertEquals(actualProductVersionText,
		 * expectedProductVersionText); sa.assertAll();
		 */
	}
}