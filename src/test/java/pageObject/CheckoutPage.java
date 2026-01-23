package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	WebElement proceedToCheckoutButton;
	
	@FindBy(xpath="//a[@class='btn btn-default check_out']")
	WebElement placeOrderButton;
	
	@FindBy(xpath="//h2[normalize-space()='Address Details']")
	WebElement addressDetails;
	
	@FindBy(xpath="//h2[normalize-space()='Review Your Order']")
	WebElement confirmOrder;
	
	public void clickOnproceedToCheckout()
	{
		proceedToCheckoutButton.click();
	}
	
	public String confirmAddressDetails()
	{
		try
		{
			return addressDetails.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public String reviewOrder()
	{
		try
		{
			return confirmOrder.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void clickOnPlaceOrder()
	{
		placeOrderButton.click();
	}
}
