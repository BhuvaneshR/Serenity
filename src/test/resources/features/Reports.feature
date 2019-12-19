@Reports
Feature: BA is not able to access Reports

 Background:
 
 
 @XRAY-1124
 Scenario Outline: Buisness Assistant is not allowed to access Reports
 
Given User should not be able to see "<Reports>" 
 
 Examples:
 |Reports|
 |REPORTS|
 