package StepDefinitionFile;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObjectFile.LogInClass;
import PageObjectFile.LogOutClass;


public class BaseClass {

	public WebDriver driver;
	public LogInClass lg;
	public LogOutClass lo;
	public static Logger Log;
}
