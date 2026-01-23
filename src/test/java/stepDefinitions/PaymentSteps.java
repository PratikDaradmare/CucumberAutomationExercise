package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.OrderConfirmPage;
import pageObject.PaymentPage;

public class PaymentSteps {
	
	PaymentPage pp= new PaymentPage(BaseClass.getDriver());
	OrderConfirmPage ocp= new OrderConfirmPage(BaseClass.getDriver());
	
	@When("User enter valid card details")
	public void user_enter_valid_card_details() {
	    BaseClass.getLogger().info("Verify payment page id displayed");
		pp.paymentPageAppeared();
	    
		BaseClass.getLogger().info("Fill valid card details");
	    pp.fillCardDetails();
	}

	@When("User clicks on Pay and Confirm Order button")
	public void user_clicks_on_pay_and_confirm_order_button() {
		BaseClass.getLogger().info("Click on Pay and Confirm Order Button");
		pp.ClickOnPayAndConfirmOrder();
	}

	@Then("User should navigate to Order Confirm Page")
	public void user_should_navigate_to_order_confirm_page() {
	    
		BaseClass.getLogger().info("Verify order has been placed successfully");
		ocp.checkOrderIsConfirmed();
		
		BaseClass.getLogger().info("Click on continue button for further shopping");
		ocp.clickOnContinueButton();
	}
}
