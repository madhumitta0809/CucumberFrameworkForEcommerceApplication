package stepDefinitions;

import java.time.Duration;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import utils.CommonUtils;

public class Login {
	LoginPage loginpage;
	WebDriver driver=DriverFactory.getDriver();
	
	@Given("User has navigated to Login page")
	public void userHasNavigatedToLoginPage() {
	    //driver=DriverFactory.getDriver();
	    HomePage homepage=new HomePage(driver);
	    homepage.clickOnMyAccount();
	    homepage.selectLoginOption();
	     loginpage=new LoginPage(driver);
	    
	    
	    
	}
	@When("user has entered valid email address {string} in email field")
	public void userHasEnteredValidEmailAddressInEmailField(String validEmailText) {
	    
	    loginpage.enterEmailAddress(validEmailText);
	}
	
	
	@When("user has entered valid password {string} in the password field")
	public void userHasEnteredValidPasswordInThePasswordField(String validPasswordText) {
	    
		loginpage.enterPassword(validPasswordText);
	}
	
	
	@When("user has entered  Invalid email address in email field")
	public void userHasEnteredInvalidEmailAddressInEmailField() {
	   
		loginpage.enterEmailAddress(CommonUtils.getEmailWithTimeStamp());
	}
	
	
	@When("user has entered  Invalid password {string} in the password field")
	public void userHasEnteredInvalidPasswordInThePasswordField(String invalidPasswordText) {
	   
		loginpage.enterPassword(invalidPasswordText);
	}
	@When("user has not entered anything in email field")
	public void userHasNotEnteredAnythingInEmailField() {
		loginpage.enterEmailAddress("");
	    
	}
	@When("user has not entered anything in the password field")
	public void userHasNotEnteredAnythingInThePasswordField() {
	   
		loginpage.enterPassword("");
	}
	@Then("User should get email\\/password not matching warning message")
	public void userShouldGetEmailPasswordNotMatchingWarningMessage() {
	   
	    Assert.assertTrue(loginpage.displayStatusOfWarningMessage());
	}

	@When("user clicks on login button")
	public void userClicksOnLoginButton() {
	    
	    loginpage.clickOnLoginButton();
	}
	@Then("User should get successfully logged in")
	public void userShouldGetSuccessfullyLoggedIn() {
		AccountPage accountpage=new AccountPage(driver);
	  Assert.assertTrue(accountpage.displayStatusOfEditYourAccountInformationoption());  
	    
	}
	
	
	


}
