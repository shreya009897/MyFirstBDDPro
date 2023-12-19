package PageObjectFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutClass {

	WebDriver Currentdriver;
	public LogOutClass(WebDriver Remotedriver) {
		Currentdriver = Remotedriver;
		PageFactory.initElements(Remotedriver,this);
	}
	@FindBy(xpath="//a[text()='Log out']") WebElement Logout;
	public void user_logout() {
		Logout.click();
}
}