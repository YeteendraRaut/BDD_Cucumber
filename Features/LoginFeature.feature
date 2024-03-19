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
Feature: Login 

@Sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://fourtopstaging.appspot.com/login" 
	And User enters Email as "namratashahstage@yopmail.com" and Password as "123456" 
	And Click on Login 
	Then Page Title should be "Welcome to Waitlist Me" 	
	When User click on Hello, Stage Namrata
	And Click on LogOut link
	Then Page Title should be "Waitlist Me - Free Restaurant Wait List App" 
	And close browser 
@regression
Scenario Outline:Successful Login with Valid Credentials DDT
	Given User Launch Chrome browser 
	When User opens URL "https://fourtopstaging.appspot.com/login" 
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login 
	Then Page Title should be "Welcome to Waitlist Me" 
	When User click on Hello, Stage Namrata
	And Click on LogOut link
	Then Page Title should be "Waitlist Me - Free Restaurant Wait List App" 
	And close browser 

Examples:
|email|password|
|namratashahstage@yopmail.com|123456|
|namratasha@yopmail.com|admin|
|namratashahstage@yopmail.com||
|||
||123456|

	