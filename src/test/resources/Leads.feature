Feature: Salesforce Leads


Background: 
Given I have logged in succesfully and am at the home page

  Scenario: Landing on the Leads Page
   	When I click on all tabs for Lead
    When I land on the all tabs page for Lead
    And I click on the Leads link
    When I land on the Leads page
    Then I should see the leads page

  
  Scenario: Displaying Lead View
    When I click on all tabs again 
    When I land on the all tabs page again 
    And I click on the Leads link again 
    When I land on the Leads page again
    When I click on the view button
    Then the Lead view should be displayed
