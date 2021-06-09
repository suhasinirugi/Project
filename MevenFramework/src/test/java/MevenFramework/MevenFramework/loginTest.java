package MevenFramework.MevenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginTest {
	 WebDriver driver;
		@Test
		public void FaceBookLogin() {
			Loginpage login=PageFactory.initElements(driver,Loginpage.class );
			login.getusername().sendKeys("7744021005");
			login.getpassword().sendKeys("suhasini7744");
			login.getsubmitt().click();
		

		}
}
