package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.BaseClass;

public class AddParty extends BaseClass {
	
	WebDriver ldriver;

	public AddParty(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}

	public void synchronised(By locator, WebElement element)  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		try {
		Thread.sleep(1000); }
		catch (InterruptedException e) {
		e.printStackTrace();	
		}
		}
	
	
	
	@FindBy(xpath="/html/body/div[4]/div/div[1]/div/div/div[1]/button")
	WebElement closeButton;
		
	@FindBy(xpath="/html/body/div[4]/div/div[1]/div/div/div[1]/h5/span")
	WebElement addPartyLabel;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement nameTextField;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phoneTextField;
	
	@FindBy(xpath="//input[@placeholder='email']")
	WebElement emailTextField;
	
	@FindBy(xpath="//input[@value='6']")
	WebElement	memberSize;
	
	@FindBy(xpath="(//img[contains(@src,\"data:image/png;base64,iVBOR\")])[1]")
	WebElement adultButton;
	
	@FindBy(xpath="(//img[contains(@src,\"data:image/png;base64,iVBOR\")])[2]")
	WebElement kidsButton;
	
	@FindBy(xpath="(//img[contains(@src,\"data:image/png;base64,iVBOR\")])[3]")
	WebElement agedButton;
	
	@FindBy(xpath="(//button[contains(@class,'style__ColoredCircleBtn')])[4]")
	WebElement statusButton;
	
	@FindBy(xpath="//textarea[@name='notes']")
	WebElement notesTextBox;
	
	@FindBy(xpath="//button[text()='next']")
	WebElement nextButton;
	
	@FindBy(xpath="//tr[@id='assign_3']")
	WebElement Assigment;
	

	@FindBy(xpath="//button[normalize-space()='next']")
	WebElement SecondNextButton;
	
	@FindBy(xpath="//select[@placeholder='choose']")
	WebElement TimeDropdown;
	
	@FindBy(xpath ="//button[normalize-space()='next']")
	WebElement ThirdNextButton;
	
	public void clickOnaddParty()
	{
		addPartyLabel.click();
	}
 
	public void getnameTextField(String Name)
	{
		nameTextField.sendKeys(Name);
	}

	public void getPhoneTextField(String phone) {
		 phoneTextField.sendKeys(phone);;
	}

	public void getEmailTextField(String email) {
		 emailTextField.sendKeys(email);
	}

	public void  getMemberSize() {
		 memberSize.click();
	}

	public void  getAdultButton() {
		 adultButton.click();
	}

	public void getKidsButton() {
		kidsButton.click();
	}

	public void getStatusButton() {
		statusButton.click();
	}

	public void  getNotesTextBox(String notes) {
		 notesTextBox.sendKeys(notes);;
	}

	public void  getNextButton() {
		nextButton.click();
	}
	public void  clickOnAssigment() {
		Assigment.click();
	}
	public void  clickOnSecondNextButton() {
		SecondNextButton.click();
	}
	public void enterTimeDropdown(String value)
	{
		Select drp=new Select(TimeDropdown);
		drp.selectByVisibleText(value);
	}
	public void  clickOnThirdNextButton() {
		ThirdNextButton.click();
	}
	
}


	

	    
	
