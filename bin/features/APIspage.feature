@APIspage
Feature: As a User I navigate to API's Page and  is able to use the API's Page.

Background: 
Given I'm on "Welcome to the First Data Developer Hub"
And I click and navigate to "Log into Developer Hub" Page from homepage
#When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
And I click on "Log in" button and I should sucessfully logged in
And I should see "Dashboard" page once I logged in
Then I should see the homepage and verify the homelink URL
When I click on the "APIs" Tab from header

@TC08_APIspage_UI_01
Scenario Outline: Verify the APIs page content present in APIs page UI
Then I should see the "<APIs_header_text>" on APIs page
Examples:
|APIs_header_text|
|Enrich your application or website by integrating with any of our APIs below|

@TC09_APIspage_UI_02
Scenario Outline: Verify the Boarding APIs product box content present in APIs page UI
Then I should see the "<Boarding APIs>" content
And after clicking on it 
Then I will be able to see "<Boarding APIs text>"
Examples: 
|Boarding APIs|Boarding APIs text|
|Boarding and Offers APIs|Boarding APIs|

@TC10_APIspage_UI_03
Scenario Outline: Verify the Payment APIs product box content present in APIs page UI
Then I should see the Payment API "<Payment APIs>" content
And after clicking on payment API box           
Then I should see the  "<Payment APIs text>" content PaymentAPI
Examples:
|Payment APIs|Payment APIs text|
|Payment APIs|Process payments in your App|

	 
@TC11_APIspage_UI_04
Scenario Outline: Verify the Merchant intelligence APIs Merchant content present in APIs page UI
Then I should see the MI Merchant "<MI APIs Merchant>"  content
And after clicking on MI Merchant API box           
Then I should see the  "<MI Merchant API page text>" content MI Merchant API
Examples:          
|MI APIs Merchant|MI Merchant API page text|
|View general merchant account information|View merchant authorisation information|

@TC12_APIspage_UI_05
Scenario Outline: Verify the Merchant Intelligence APIs Transcations content present in APIs page UI     
Then I should see the following content for MI Transcations "<MI APIs Transcations>"
And after clicking on MI Transcations API box           
Then I should see the  "<MI Transcations API page text>" content MI Transcations API
Examples:
|MI APIs Transcations|MI Transcations API page text|
|View transaction information|Get general pre-payment and request status information|

@TC13_APIspage_UI_06
Scenario Outline: Verify the Merchant Intelligence APIs Funding content present in APIs page UI      
Then I should see the following content for MI Funding "<MI APIs Funding>"
And after clicking on MI Funding API box           
Then I should see the  "<MI Funding API page text>" content MI Funding API
Examples:   
|MI APIs Funding|MI Funding API page text|
|View funding information|View general merchant funding information|



     
 