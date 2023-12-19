package PageObjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInClass {

	WebDriver Currentdriver;
	public  LogInClass(WebDriver RemoteDriver) {
		
		Currentdriver=RemoteDriver;
		PageFactory.initElements(RemoteDriver,this);
	}
	@FindBy(id="username") WebElement Username;
	@FindBy(id="password") WebElement Password;
	@FindBy(id="submit") WebElement Submit;
	
	public void user_name(String user) {
		Username.sendKeys(user);
	}
	public void user_pass(String pass) {
		Password.sendKeys(pass);
	}
	public void user_sub() {
		Submit.click();
	}
}
