package Scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genric.BaseTest;
import Genric.Lib;
import Pompages.LoginPage;

public class ValidLoginTest extends BaseTest {

	@Test
	public void validLoginTest() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(Lib.getCellValue("ValidCredentials", 1, 0));
		Thread.sleep(5000);
		lp.setPassword(Lib.getCellValue("ValidCredentials", 1, 1));
		Thread.sleep(5000);
		lp.clickLoginBtn();
//validating if home page is displayed or not
		
SoftAssert sa= new SoftAssert();
String actualData= "http://127.0.0.1/user/submit_tt.do";
String expectedData = driver.getTitle();
sa.assertEquals(actualData, expectedData);
	}
}


