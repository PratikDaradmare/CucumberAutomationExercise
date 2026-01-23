package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AccountRegistrationPage;

public class RegistrationSteps {
	
	AccountRegistrationPage arp= new AccountRegistrationPage(BaseClass.getDriver());
	
	@When("User enters name as {string} in the name box")
	public void user_enters_name_as_in_the_name_box(String name) {
		BaseClass.getLogger().info("Entering name");
	
		arp.setName(name);
		
	}

	@When("User enters the email as {string}")
	public void user_enters_the_email_as(String email) {
	   BaseClass.getLogger().info("Entering email");
	   
	   arp.setEmail(email);
	}

	@When("User clicks on on SignUp button")
	public void user_clicks_on_on_sign_up_button() {
		BaseClass.getLogger().info("Clicking on SignUp Button");
		
		arp.clickSignupButton();
	}
	
	@When("User navigates to Enter Account Information Page")
	public void user_navigates_to_enter_account_information_page() {
		BaseClass.getLogger().info("Verifying user navigates to Enter Account Info page");
		
		arp.accountInfoPageVisibility();
	}
	
	@When("User clicks on respective gender")
	public void user_clicks_on_respective_gender() {
		BaseClass.getLogger().info("Select a gender");
		
		arp.selectGender();
	}

	@When("User sets password as {string}")
	public void user_sets_password_as(String pwd) {
		BaseClass.getLogger().info("Set a password");
		
		arp.setPassword(pwd);
	}

	@When("User sets Date of birth")
	public void user_sets_date_of_birth() {
		BaseClass.getLogger().info("Select DOB");
		
		arp.setDOB();
	}

	@When("User enters Address information")
	public void user_enters_address_information() {
		BaseClass.getLogger().info("Enters all valid address details");
		
		arp.setFirstName("pratik");
	    arp.setLastName("daradmare");
	    arp.setCompany("pvt lt");
	    arp.setAddress("apartment");
	    arp.setAddress2("colony");
	    arp.selectCountry();
	    arp.setState("Maharashtra");
	    arp.setCity("chandrapur");
	    arp.setZipcode("442403");
	    arp.setMobileNo("9876543210");
	}

	@Then("User clicks on Create Account button")
	public void user_clicks_on_create_account_button() {
		BaseClass.getLogger().info("Click on Create account button");
		
		arp.clickCreateAccount();
	}

	@Then("User sees Account created message successfully")
	public void user_sees_account_created_message_successfully() {
		BaseClass.getLogger().info("Verify account has been created successfully");
		
		arp.getConfirmationMsg();
	}
	
}
