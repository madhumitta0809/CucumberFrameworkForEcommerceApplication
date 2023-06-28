package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[.='HP LP3065']")
	private WebElement validProduct;
	
	@FindBy(xpath = "//p[.='There is no product that matches the search criteria.']")
	private WebElement inValidProduct;
	
	public boolean displayStatusOfValidproduct()
	{
		return validProduct.isDisplayed();
	}
	public boolean displayStatusOfinValidproduct()
	{
		return inValidProduct.isDisplayed();
	}
}
