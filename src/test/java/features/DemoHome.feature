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
Feature: Demo Home page

  Background: 
   
     user should should be on homepzage

  @SelectProduct
  Scenario: Select the expected product from homepage
    When user selects the expected product
      | Nokia lumia 1520 |
    Then user should be on productDetailspage
    And expected product name should be displayed

  @VerifyCategories
  Scenario: Verify three categories on homepage
    When user selects Phones categories
    Then a phone product should display
      | Nokia lumia 1520 |
    When user selects Laptops categories
    Then a laptop product should display
      | Sony vaio i5 |
    When user selects Monitors categories
    Then a monitor product should display
      | Apple monitor 24 |
