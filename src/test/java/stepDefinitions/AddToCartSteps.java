package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CartPage;

public class AddToCartSteps {
	
	CartPage cp= new CartPage(BaseClass.getDriver());
	
	@When("User clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
	    BaseClass.getLogger().info("Click on add to cart below desired product");
	    
	    cp.clickAddToCart();
	}

	@When("User clicks on Cart button available on header of page")
	public void user_clicks_on_cart_button_available_on_header_of_page() {
	    BaseClass.getLogger().info("Click on cart button present on header of page");
	    
	    cp.viewCart();
	}

	@Then("User verify desired product is in the cart")
	public void user_verify_desired_product_is_in_the_cart() {
	    BaseClass.getLogger().info("Verify product is successfully added to cart");
	    
	    cp.verifyProductIsAddedToCart();
	}
}
