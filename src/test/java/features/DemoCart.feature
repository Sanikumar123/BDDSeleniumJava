#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Demo Cart page

  Background: 
   
    Given user should should be on homepage
    When user selects the expected product
      | Nokia lumia 1520 |
    Then user should be on productDetailspage
    When user clicks on Add to Cart button
    Then a pop-up should appear with "Product added."
    And user should be able to click on Ok button

  @ProductAddedInTheCart
  Scenario: Verify the added product displayed in the Cart
    When user clicks on Cart button
    Then the added product should be displayed

  @DeleteProductFromCart
  Scenario: Verify user is able to delete the added product displayed in the Cart
    When user clicks on Cart button
    And clicks on Delete button
    Then the added product should not be displayed.
