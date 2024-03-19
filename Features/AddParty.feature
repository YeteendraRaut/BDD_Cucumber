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
Feature: AddParty

Background: Steps common for all scenrios
Given User Launch Chrome browser 
    When User opens URL "https://fourtopstaging.appspot.com/login" 
    And User enters Email as "namratashahstage@yopmail.com" and Password as "123456" 
    And Click on Login 
    Then Page Title should be "Welcome to Waitlist Me"     
    
    
@regression
Scenario: Adding a new party to the waitlist

  When the user clicks on the "Add Party" button
  Then new child window for add party is open
  When User enter customer info 
  And clicks on the "Next" button
  And assigns the party to a staff member
  And clicks on the "Next" button
  And selects a 5-minute waiting time
  And clicks on the "Next" button
  Then a new party is created and added to the waitlist
  And close browser