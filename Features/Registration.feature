Feature: Account Registration Page with valid details 

Background:
		Given User navigates to Homepage
		And User navigates to SignUp/Login page	

Scenario:Successfully Register an account with valid registration details
		When User enters name as "pratik" in the name box
		And User enters the email as "pratikatwork@gmail.com" 
		And User clicks on on SignUp button
		And User navigates to Enter Account Information Page
		And User clicks on respective gender
		And User sets password as "pratik"
		And User sets Date of birth
		And User enters Address information
		Then User clicks on Create Account button
		And User sees Account created message successfully
		