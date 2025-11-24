Feature: Login with valid credentials

Scenario:Successful login with valid credentials
		 Given User navigates to Homepage
	  	 And User navigates to SignUp/Login page
		 When User enters the email as "asdfghhjk@gmail.com" and password as "pratik"
		 And User click on submit button
		 Then User should redirect and see Logout header

