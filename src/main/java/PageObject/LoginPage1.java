package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {


		WebDriver ldriver;

		public LoginPage1(WebDriver rDriver)
		{
			ldriver=rDriver;

			PageFactory.initElements(rDriver, this);
		}
		
		
		@FindBy(id="email")
	    WebElement emailTextField;
		
		@FindBy(id="password")
	    WebElement passwordTextField;
		
		@FindBy(name="Submit")
		WebElement loginButton;
		
		@FindBy(id="greeting")
		WebElement greetingText ;
		
		@FindBy(xpath="//ul[@role='menu']//a[normalize-space()='Log Out']")
		WebElement LogOutLink ;
		
		public void enterEmail(String emailAdd)
		{
			emailTextField.clear();
			emailTextField.sendKeys(emailAdd);
		}
		
		public void enterPassword(String pwd)
		{
			passwordTextField.clear();
			passwordTextField.sendKeys(pwd);
		}
		
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		public void clickOngreetingText()
		{
			 greetingText.click();
		}
		public void clickOnLogOutLink()
		{
			LogOutLink.click();
		}
}
