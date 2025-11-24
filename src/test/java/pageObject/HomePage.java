package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath="//a[normalize-space()='Home']")
	WebElement HomepageDisplayed;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement link_signuplogin;
	
	
	public void HomepageVisible()
	{
		System.out.println("HomePage is displayed: "+HomepageDisplayed.getText());
	}
	
	public void linkOfSignupLogin()
	{
		link_signuplogin.click();
	}
}
