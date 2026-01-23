package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage{
	
	public CartPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")
	WebElement addToCartButton;
	
	@FindBy(xpath="//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement headerCartButton;
	
	@FindBy(xpath="//a[normalize-space()='Blue Top']")
	WebElement productAddedToCart;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement removeFromCartButton;
	
	@FindBy(xpath="//u[normalize-space()='View Cart']")
	WebElement viewCartFlash;

	public void clickAddToCart()
	{
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(11));
		mywait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
		
		addToCartButton.click();
	}
	
	public void viewCart()
	{
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(20));
		//mywait.until(ExpectedConditions.elementToBeClickable(headerCartButton));
		mywait.until(ExpectedConditions.elementToBeClickable(viewCartFlash));
		
		viewCartFlash.click();
		
//		if (viewCartFlash.isDisplayed())
//		{
//			viewCartFlash.click();
//		}
//		else if(headerCartButton.isDisplayed())
//		{
//			headerCartButton.click();
//		}
		 
	}
	
	public String verifyProductIsAddedToCart()
	{
		try {
			return (productAddedToCart.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

}
