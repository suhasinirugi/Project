package MevenFramework.MevenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
 
public class Loginpage {
@FindBy(xpath="//input[@id='email']")
private WebElement username;

@FindBy(xpath="//input[@=id'pass']")
private WebElement password;

@FindBy(xpath="//button[@id='u_0_h_ED']")
private WebElement submitt;

private WebDriver driver;
public Loginpage(WebDriver driver) {
	this.driver =driver;
}

public WebElement getusername() {
return username; 
}
public WebElement getpassword() {
	return password; 
  }
public WebElement getsubmitt() {
	return submitt; 
}

}