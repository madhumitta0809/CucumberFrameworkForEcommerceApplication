package stepDefinitions;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountSuccessPage;
import pages.HomePage;
import pages.RegisterPage;
import utils.CommonUtils;
import utils.ConfigReader;

public class Register {
	WebDriver driver;
	RegisterPage registerpage;
	
	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {
	    
	    driver=DriverFactory.getDriver();
	    HomePage homepage=new HomePage(driver);
	    homepage.clickOnMyAccount();
	    homepage.selectRegisterOption();
	    registerpage =new RegisterPage(driver);
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(io.cucumber.datatable.DataTable dataTable) {
	    
	    Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	    registerpage.enterFirstName(dataMap.get("firstName"));
	    registerpage.enterLastName(dataMap.get("lastName"));
	    registerpage.enterEmailAddress(CommonUtils.getEmailWithTimeStamp());
	    registerpage.enterTelephoneNumber(dataMap.get("telephone"));
	    registerpage.enterPassword(dataMap.get("password"));
	    registerpage.enterConfirmPassword(dataMap.get("password"));
	    
	    
	}

	@When("User selects Privacy Policy")
	public void user_selects_privacy_policy() {
	    
		registerpage.selectPrivacyPolicy();
	}

	@When("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    
		registerpage.clickOnContinueButton();
	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		AccountSuccessPage accountsuccesspage=new AccountSuccessPage(driver);
	  Assert.assertTrue(accountsuccesspage.displayStatusOfAccountSuccess()); 
	}

	@When("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
	    
		registerpage.selectYesNewsletterOption();
	}

	@When("User enters the details into below fields with duplicate email")
	public void user_enters_the_details_into_below_fields_with_duplicate_email(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		 registerpage.enterFirstName(dataMap.get("firstName"));
		    registerpage.enterLastName(dataMap.get("lastName"));
		    registerpage.enterEmailAddress(dataMap.get("email"));
		    registerpage.enterTelephoneNumber(dataMap.get("telephone"));
		    registerpage.enterPassword(dataMap.get("password"));
		    registerpage.enterConfirmPassword(dataMap.get("password"));
		    
	   
	   
	}

	@Then("User should get a proper warning about duplicate email")
	public void user_should_get_a_proper_warning_about_duplicate_email() {
	    
	   Assert.assertTrue(registerpage.displayStatusOfDuplicateEmailWarningMessage());
	}

	@When("User dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
	    
		registerpage.enterFirstName("");
	    registerpage.enterLastName("");
	    registerpage.enterEmailAddress("");
	    registerpage.enterTelephoneNumber("");
	    registerpage.enterPassword("");
	    registerpage.enterConfirmPassword("");
	}

	@Then("User should get proper warning messages for every mandatory field")
	public void user_should_get_proper_warning_messages_for_every_mandatory_field() {
	    
	   Assert.assertTrue(registerpage.displayStatusOfPrivacyPolicyWarningMessage());
	   Assert.assertTrue(registerpage.displayStatusOfFirstNameWarning());
	   Assert.assertTrue(registerpage.displayStatusOfLastNameWarning());
	   Assert.assertTrue(registerpage.displayStatusOfEmailWarning());
	   Assert.assertTrue(registerpage.displayStatusOfTelephoneWarning());
	   Assert.assertTrue(registerpage.displayStatusOfPasswordWarning());
	   
	  
	}
	
}
