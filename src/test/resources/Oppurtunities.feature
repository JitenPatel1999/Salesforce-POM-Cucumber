Feature: Salesforce Oppurtunities


Background: 
	Given the user is logged in and at the home screen


  Scenario: Landing on the Oppurtunities Page
    When I click on all tabs for Oppurtunities
    When I land on the all tabs page for Oppurtunities
    And I click on the Oppurtunities link
    When I land on the Oppurtunities page
    Then I should be viewing the Oppurtunities page


  Scenario: Viewing Pipeline 
    When I click on all tabs a second time
    When I land on the all tabs page a second time
    And I click on the Oppurtunities link a second time 
    When I land on the Oppurtunities page a second time
    When I click on the Pipeline link
    Then I should be seeing the Pipeline page
	
	
	Scenario: Viewing Stuck
		When I click on all tabs a third time
    When I land on the all tabs page a third time
    And I click on the Oppurtunities link a third time 
    When I land on the Oppurtunities page a thrid time
    And I click on the stuck link
    Then I should be seeing the stuck page