package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[@title='My Account']")
	private WebElement myAccountDropmenu;
	
	@FindBy(xpath = "//a[.='Login']")
	private WebElement loginOption; 
	
	@FindBy(xpath ="//a[.='Register']")
	private WebElement registerOption;
	
	@FindBy(name="search")
	private WebElement searchBoxField;
	
	@FindBy(xpath="//button[contains(@class,'btn-default')]")
	private WebElement searchButton;
	
	public void clickOnMyAccount()
	{
		myAccountDropmenu.click();
	}
	public void selectLoginOption()
	{
		loginOption.click();
	}
	public void selectRegisterOption()
	{
		registerOption.click();
	}
	public void enterProdutInSearchBox(String productText)
	{
		searchBoxField.sendKeys(productText);
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
	
	
}
