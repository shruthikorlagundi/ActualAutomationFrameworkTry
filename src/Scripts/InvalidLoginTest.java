package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Genric.BaseTest;
import Genric.Lib;
import Pompages.LoginPage;

public class InvalidLoginTest extends BaseTest {

	@Test(priority=2)
	public void invalidLoginTest() {

		LoginPage lp = new LoginPage(driver);

		int rowCount = Lib.getRowCount("InvalidCredentials");
		
		for (int i = 1; i <= rowCount; i++) {
			try {
				lp.setUsername(Lib.getCellValue("InvalidCredentials", i, 0));
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			
	
			lp.setPassword(Lib.getCellValue("InvalidCredentials", i, 1));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
			try {
				lp.clickLoginBtn();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}

}
