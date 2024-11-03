	Feature: Salesforce Login and Home Functionalities
	
	
	Background:
	 Given the url "https://login.salesforce.com"
	
	
  Scenario: Login Error Message
  	When I land on the login page
    When I enter the username as "<User@gmail.com>"
    When I dont enter a password
    And I clicked the login button
    Then I should be able to see the login page error message
    
    
  Scenario: Successful Login
  	When I land on the login page a second time
  	When I enter the username a second time as "jiten@tekarch.com"
  	When I enter the password a second time as "Nami0506"
  	And I clicked the login button a second time
  	Then I should be able to see the Salesforce home page
  	
  	
  Scenario: Successful Logout
  	When I land on the login page a third time
  	When I enter the username a thrid time as "jiten@tekarch.com"
  	When I enter the password a third time as "Nami0506"
  	And I clicked the login button a third time
  	When I land on the home page
  	When I click the logout button
  	Then I should see the login page again
  	
  	
  Scenario: Remember Me
  	When I land on the login page a fourth time
  	When I enter the username a foruth time as "jiten@tekarch.com"
  	When I enter the password a fourth time as "Nami0506"
  	And I click on remember me
  	When I click the login button a fourth time
  	When I land on the home page a second time
  	And I click the logout button a second time
  	Then I should see my username is saved
  	
  	
  Scenario: Developer Console
  	When I land on the login page a fifth time
  	When I enter the username a fifth time as "jiten@tekarch.com"
  	When I enter the password a fifth time as "Nami0506"
  	When I click the login button a fifth time
  	When I land on the homepage
  	And I clicked on developer console
  	Then I should see the developer console
  	