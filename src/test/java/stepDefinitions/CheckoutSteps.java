package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;
import pageObject.PaymentPage;

public class CheckoutSteps {
	
	CheckoutPage cop=new CheckoutPage(BaseClass.getDriver());
	PaymentPage pp= new PaymentPage(BaseClass.getDriver());
	
	@When("User clicks on proceed to checkout button")
	public void user_clicks_on_proceed_to_checkout_button() {
	    
		BaseClass.getLogger().info("Click on proceed to checkout");
		cop.clickOnproceedToCheckout();
	}
	
	@When("User confirms delivery address")
	public void user_confirms_delivery_address() {
		BaseClass.getLogger().info("COnfirm dellivery address");
		cop.confirmAddressDetails();
	}

	@When("User review products in the cart")
	public void user_review_products_in_the_cart() {
		
		BaseClass.getLogger().info("Review products in the cart");
		cop.reviewOrder();
	}

	@When("User clicks on place order button")
	public void user_clicks_on_place_order_button() {
	    
		BaseClass.getLogger().info("Click on place order button");
		cop.clickOnPlaceOrder();
	}

	@Then("User should navigate to payment page")
	public void user_should_navigate_to_payment_page() {
	    
		pp.paymentPageAppeared();
	}
}
