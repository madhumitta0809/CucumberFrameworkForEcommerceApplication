package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement passwordConfirmField;
	
	@FindBy(xpath="//input[@value='Continue']/preceding-sibling::input")
	private WebElement privacyPolicyOption;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name='newsletter']")
	private WebElement YesNewsletterOption;
	
	@FindBy(xpath="//div[.='Warning: E-Mail Address is already registered!']")
	private WebElement duplicateEmailwarningMessage;
	
	@FindBy(xpath = "//div[.='Warning: You must agree to the Privacy Policy!']")
	private WebElement privacyPolicywarningMessage;
	
	@FindBy(xpath="//input[@id='input-firstname']/following-sibling::div")
	private WebElement firstNameWarning;
	
	@FindBy(xpath="//input[@id='input-lastname']/following-sibling::div")
	private WebElement lastNameWaring;
	
	@FindBy(xpath="//input[@id='input-email']/following-sibling::div")
	private WebElement emailWarning;
	
	@FindBy(xpath="//input[@id='input-telephone']/following-sibling::div")
	private WebElement telephoneWarning;
	
	@FindBy(xpath="//input[@id='input-password']/following-sibling::div")
	private WebElement passwordWarning;
	
	public void enterFirstName(String firstNameText)
	{
		firstNameField.sendKeys(firstNameText);
	}
public void enterLastName(String lastNameText) {
		
		lastNameField.sendKeys(lastNameText); 
		
	}
	
	public void enterEmailAddress(String emailText) {
		
		emailField.sendKeys(emailText);
		
	}
	
	public void enterTelephoneNumber(String telephoneText) {
		
		telephoneField.sendKeys(telephoneText);
		
	}
	
	public void enterPassword(String passwordText) {
		
		passwordField.sendKeys(passwordText);  
		
	}
	
	public void enterConfirmPassword(String passwordText) {
		
		passwordConfirmField.sendKeys(passwordText);
		
	}
	
	public void selectPrivacyPolicy() {
		
		privacyPolicyOption.click();;
		
	}
	
	public void clickOnContinueButton() {
		
		continueButton.click();;
		
		
	}
	
	public void selectYesNewsletterOption() {
		
		YesNewsletterOption.click();;
		
	}
	
	public boolean displayStatusOfDuplicateEmailWarningMessage() {
		
		return duplicateEmailwarningMessage.isDisplayed();
		
	}
	
public boolean displayStatusOfPrivacyPolicyWarningMessage() {
		
		return privacyPolicywarningMessage.isDisplayed();
		
	}
	public boolean displayStatusOfFirstNameWarning() {
		
		return firstNameWarning.isDisplayed();
		
	}
	
	public boolean displayStatusOfLastNameWarning() {
		
		return lastNameWaring.isDisplayed();
		
	}
	
	public boolean displayStatusOfEmailWarning() {
		
		return emailWarning.isDisplayed();
		
	}
	
	public boolean displayStatusOfTelephoneWarning() {
		
		return telephoneWarning.isDisplayed();
		
	}
	
	public boolean displayStatusOfPasswordWarning() {
		
		return passwordWarning.isDisplayed();
		
	}
}
