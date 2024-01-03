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

Feature: Home screen
  
  @TC001
  Scenario: Verify user able to click on the get more and able to receive follow us footer
    Given User launch the application
    And verify user navigate to the landing page
    When user clicks on the home menu
    And user should able to view get more button
    And user clicks get more button
    Then verify follow us footer is displayed
    And user close the application

  
