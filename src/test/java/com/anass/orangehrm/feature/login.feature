Feature: Login tests

Scenario Outline: InValid Login
    Given User navigate to Login page
 	When User enters <user> as login
 	And User enters <pass> as password
    And User click Login button
	Then Error message will be displayed
	
	Examples: 
      | user  | pass |
      | user1 | pass1|
      | user2 | pass2|
      | user3 | pass3|
	
Scenario: Valid Login
    Given User navigate to Login page
 	When User enters "Admin" as login
 	And User enters "admin123" as password
    And User click Login button
	Then Home page will be displayed