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

Feature: Compose Email in Gmail

Scenario: Compose an email with subject and body
  Given I am logged into Gmail
  When I click on the "Compose" button
  And I enter "Incubyte Deliverables:1" in the subject field
  And I enter "Automation QA test for Incubyte" in the email body
  And I click on the "Send" button
  Then the email should be sent successfully
      