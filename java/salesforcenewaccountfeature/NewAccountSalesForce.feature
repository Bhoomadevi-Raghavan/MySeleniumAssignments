Feature: New Account creation in SalesFforce Application

Scenario: Login to Salesforce Application and create new account

Given Launch the Chrome browser
Given Load the Salesforce URL

When Enter a valid Username
When Enter a Password	 
When Click on the Log In button
When Click on the ToggleMenu on the left corner
When Click on the View All link 
When Click on the Sales link on App launcher
When Click on the Accounts tab
When Click on the New button
When Enter a valid Account Name 
When Select public under Ownership dropdown
When Click on Save button

Then Verify Account Name 
