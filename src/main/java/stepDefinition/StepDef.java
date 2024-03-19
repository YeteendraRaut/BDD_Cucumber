package stepDefinition;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.LoginPage1;
import Utilities.ReadConfig;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass {

	 @Before
	    public void setup1()
	    {
	        readConfig = new ReadConfig();
	        
	        //initialise logger
	       
	      //  log = LogManager.getLogger("StepDef");

	        System.out.println("Setup-Sanity method executed..");

	        String browser = readConfig.getBrowser();
	        
	        //launch browser
	        switch(browser.toLowerCase())
	        {
	        case "chrome":
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            break;

	        case "msedge":
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	            break;

	        case "firefox":
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	            break;
	        default:
	            driver = null;
	            break;

	        }

	    
	       // log.fatal("Setup1 executed...");


	    }

	//public static  WebDriver driver;
	//public LoginPage1 loginPg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		driver=new ChromeDriver();
		loginPg= new LoginPage1(driver);
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
	

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password);
		
	}

	@When("Click on Login")
	public void click_on_login() {
	   loginPg.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTital) {
	   
		
		String actualTitle=driver.getTitle();

		if(actualTitle.equals(expectedTital))
		{
			

			Assert.assertTrue(true);//pass
		}
		else
		{
			Assert.assertTrue(false);//fail

		}
	}

	@When("User click on Hello, Stage Namrata")
	public void user_click_on_hello_stage_namrata() {
	  loginPg.clickOngreetingText();
	}

	@When("Click on LogOut link")
	public void click_on_log_out_link() {
	   loginPg.clickOnLogOutLink();
	}
	
	   @When("the user clicks on the")
	    public void the_user_clicks_on_the_button() {
		   addparty.clickOnaddParty();   
	    }

	    @Then("new child window for add party is open")
	    public void new_child_window_for_add_party_is_open() {
	    	addparty.getEmailTextField(null);
	    }

	    @When("User enter customer info")
	    public void user_enter_customer_info() {
	    addparty.getnameTextField("Yeteendra");
	    addparty.getEmailTextField("guest12345@yopmail.com");
	    addparty.getPhoneTextField("8758458695");
	    addparty.getMemberSize();
	    addparty.getStatusButton();
	    addparty.getNotesTextBox("test");
	    addparty.getNextButton();
	    addparty.clickOnAssigment();
	    }

	    @When("clicks on the {string} button")
	    public void clicks_on_the_button(String getNextButton) {
	    	  addparty.getNextButton();
	    }

	    @When("assigns the party to a staff member")
	    public void assigns_the_party_to_a_staff_member() {
	    	addparty.clickOnAssigment();
	    	addparty.clickOnSecondNextButton();
	    }

	    @When("selects a {int}-minute waiting time")
	    public void selects_a_minute_waiting_time(Integer int1) {
	        addparty.enterTimeDropdown("10 Minutes");
	    }

	    @Then("a new party is created and added to the waitlist")
	    public void a_new_party_is_created_and_added_to_the_waitlist() {
	       addparty.clickOnThirdNextButton();
	    }
}
