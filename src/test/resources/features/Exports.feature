@Exports
Feature: Verify the import and export functionalities available in Admin Console

Background: 
Given the user login to Admin console successfully

@Testcase1
Scenario Outline: Verify the Exports functionality in Admin console
Given user should click on Export Email and I should see the "<Exportemail>" Header
And user should select "<Bin>" from drop down	
And User should click on "<export to CSV>"

Examples:
|Exportemail|Bin|exporttoCSV|
|Export Email|BIN|Export to CSV|
	
