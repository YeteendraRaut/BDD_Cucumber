package stepDefinition;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.AddParty;
import PageObject.LoginPage1;
import Utilities.ReadConfig;
import io.cucumber.core.logging.Logger;

public class BaseClass {
 
	public static  WebDriver driver;
	public LoginPage1 loginPg;
	public AddParty addparty;	
	public static Logger log;
	public ReadConfig readConfig;	
	//generate unique email id
	
	public String generateEmailId()
	{
		return(RandomStringUtils.randomAlphabetic(5));
	}
}
