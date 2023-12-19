package StepDefinitionFile;

import org.apache.logging.log4j.*;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectFile.LogInClass;
import PageObjectFile.LogOutClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class StepDefinitionClass extends BaseClass {
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() 
	{
	driver=new ChromeDriver();
	lg=new LogInClass(driver);
	lo=new LogOutClass(driver);
	Log=LogManager.getLogger("StepDefinitionClass");
	}

	@When("user open url {string}")
	public void user_open_url(String url) {
	driver.get(url);   
	Log.info("open url");
	}

	@When("user enter username {string} and password as {string}")
	public void user_enter_username_and_password_as(String user, String pass) {
	   lg.user_name(user);
	   lg.user_pass(pass);
	}

	@When("click on submit_button")
	public void click_on_submit_button() {
		lg.user_sub();
	   }

	@Then("Page title should be {string}")
	public void page_title_should_be(String Extitle) {
	String acttitle=driver.getTitle();  
	Assert.assertEquals(acttitle, Extitle);
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
	lo.user_logout();  
	
	}

	@When("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
		
	    }
	}
