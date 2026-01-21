package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class LoginSteps {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	MyAccountPage macc;
	
	@Given("User navigates to Homepage")
	public void user_navigates_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		BaseClass.getLogger().info("Goto Homepage ");
    	hp= new HomePage(BaseClass.getDriver());
    	
    	hp.HomepageVisible();
		
	}
	
	@Given("User navigates to SignUp\\/Login page")
	public void user_navigates_to_sign_up_login_page() {
    	BaseClass.getLogger().info("Click on Signup/Login.. ");
    	
    	hp.linkOfSignupLogin();
		
		// Write code here that turns the phrase above into concrete actions
	  
	}

	@When("User enters the email as {string} and password as {string}")
	public void user_enters_the_email_as_and_password_as(String email, String pwd) {
    	BaseClass.getLogger().info("Entering email and password.. ");	   
		
    	lp=new LoginPage(BaseClass.getDriver());
    	lp.setEmail(email);
    	lp.setPassword(pwd);
    	
		// Write code here that turns the phrase above into concrete actions

	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	   lp.clickLoginButton();
       BaseClass.getLogger().info("clicked on login button...");		
		
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User should redirect and see Logout header")
	public void user_should_redirect_and_see_logout_header() {
	    macc=new MyAccountPage(BaseClass.getDriver());
	    boolean targetpage=macc.isMyAccountPageExists();
	    
	    Assert.assertEquals(targetpage, true);
		
		// Write code here that turns the phrase above into concrete actions

	}

	
}
