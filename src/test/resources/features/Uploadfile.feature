@Uploadfile
Feature: Upload file in Admin console

Background: 
  Given the user login to Admin console successfully

@Testcase1
Scenario Outline: To upload file in Admin console
Given the user click on Documents
And the user should click on Add Button
And select Alliance code as "<Bin>" 
And select the language "<language>" 
And select the document path "<path>" 		
And Enter the Description as "<Description>" 
And click on Choosefile button and Enter "<filepath>" Click on Upload Button
And Enter the document name as "<BINfile>" 	
And click on save Button
 
Examples:
|Bin|BINfile|language|path|Description|filepath|
|BIN|BINFile|ENGLISH|Newsletters|FileUpload|C:\eclipse\Adminpdf-converted|