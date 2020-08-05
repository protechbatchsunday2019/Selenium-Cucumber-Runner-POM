
Feature: All Login Test Features
		As a User I Can login to the Multicart Webstie 
  
  #Domain Specific Scenario Writing Prctice 
  Scenario: Login Form is avaiable
    Given I browse to Mct webstie 
    When I Click the login link
    Then I Expect a complete Login Form
    
