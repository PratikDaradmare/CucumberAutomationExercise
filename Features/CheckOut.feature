Feature: checkout functionality 

Background:
		 Given User navigates to Homepage
	  	 And User navigates to SignUp/Login page
		 And User enters the email as "asdfghhjk@gmail.com" and password as "pratik"
		 And User click on submit button
		 And User should redirect and see Logout header
		 And User clicks on add to cart button
		 And User clicks on Cart button available on header of page

Scenario: Successful checkout with valid details 
		When User verify desired product is in the cart
		And User clicks on proceed to checkout button
		And User confirms delivery address
		And User review products in the cart
		And User clicks on place order button
		Then User should navigate to payment page  
		