Feature:Payment Functionality

Background:
		 Given User navigates to Homepage
		 And User navigates to SignUp/Login page
		 And User enters the email as "asdfghhjk@gmail.com" and password as "pratik"
		 And User click on submit button
		 And User should redirect and see Logout header
		 And User clicks on add to cart button
		 And User clicks on Cart button available on header of page
		 And User clicks on proceed to checkout button
		 And User clicks on place order button
		 
Scenario: Enter valid card details
		When User enter valid card details
		And User clicks on Pay and Confirm Order button
		Then User should navigate to Order Confirm Page