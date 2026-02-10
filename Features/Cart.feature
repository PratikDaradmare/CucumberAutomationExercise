Feature: Adding a product to the cart

Background:
		 Given User navigates to Homepage
	  	 And User navigates to SignUp/Login page
		 And User enters the email as "asdfghhjk@gmail.com" and password as "pratik"
		 And User click on submit button
		 And User should redirect and see Logout header
			
Scenario: Successfully adding product to the cart
		 When User clicks on add to cart button
		 And User clicks on Cart button available on header of page
		 Then User verify desired product is in the cart