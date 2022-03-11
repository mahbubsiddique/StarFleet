@amazonLogin
Feature: Login to amazon.com
  I want to validate amazon login feature for valid and invalid credentials

Scenario Outline: Validate amazon login for invalid credentials

Given I am on Amazon homepage
When I click on sign in button
And I enter "<email>" addreess and click continue
And I enter invalid "<password>" and click continue  
Then I receive an error message

    Examples: 
      | email  											| password 		| 
      | mahbub.siddique@gmail.com	 	| test@pass		|
      | mahbub.siddique@gmail.com 	|test2@pass 	|
