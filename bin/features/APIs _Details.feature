@APIsDetails
Feature: As a User I navigate to APIs product details  page and able to use the APIs product details Page.
  
   Background:        
		Given I'm on "Welcome to the First Data Developer Hub"
		And I click and navigate to "Log into Developer Hub" Page from homepage
		When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
		And I click on "Log in" button and I should sucessfully logged in
		And I should see "Dashboard" page once I logged in
	  Then I should see the homepage and verify the homelink URL
		When I click on the "APIs" Tab from header
		#And I'm on "<APIs>" page
  
     
@TC01_BoardingAPIsdetailspage
Scenario: Verify the default view of "Boarding"  content present in "Boarding APIs product details" page
      When I click on boardingAPI page
      Then I navigate to boardingAPI and verify "Boarding APIs" page
      And I should see the detailed content "Entice new merchants and get them up and running in no time!"
      
      
@TC02_BoardingAPIsdetailspage
Scenario Outline: Verify all sections for "Boarding" APIS page
      When I click on the "APIs" Tab from header
      When I click on boardingAPI page
      Then I verify the following content of BoardingAPITab after clicking each "<DocumentationLinkHeader>"
     	And I should verify the furtherdetails "<FurtherdetailsHeader>" and the featureHeader "<FeaturesHeader>" content
     	Then I should verify the solutionHeader "<SolutionsHeader>" content
      Examples:
      |DocumentationLinkHeader|FurtherdetailsHeader|FeaturesHeader|SolutionsHeader|
     	|Authorisations|Further details|Features|Solutions|
     	|Offers|Further details|Features|Solutions|
     	|Boarding|Further details|Features|Solutions|


@TC_03PaymenstsAPIsdetailspage_UI
Scenario Outline: Verify the default view of "Payment" content present in "Payments APIs product details" page
     When I click on the "APIs" Tab from header
     When I click on PaymentAPI page
     Then I navigate to paymentAPI and verify "<paymentsAPIHeader>" page
     And I should see the detailed content of paymentAPI "<PaymentAPIDetailedContent>" content
		 Examples:
		 |paymentsAPIHeader|PaymentAPIDetailedContent|
		 |Payment APIs|Process payments in your App|

@TC_04PaymenstsAPIsdetailspage_UI
Scenario Outline: Verify all sections for "Payment" APIS page
			When I click on the "APIs" Tab from header
			When I click on PaymentAPI page
     	Then I verify the following content of PaymentAPITab after clicking each "<DocumentationLinkHeader>"
     	And I should verify the furtherdetails "<FurtherdetailsHeader>" and the featureHeader "<FeaturesHeader>" content
     	Then I should verify the solutionHeader "<SolutionsHeader>" content
      Examples:
      |DocumentationLinkHeader|FurtherdetailsHeader|FeaturesHeader|SolutionsHeader|
     	|Authorisations|Further details|Features|Solutions|
     	|Payment|Further details|Features|Solutions|

@TC_05MerchantsAPIsdetailspage_UI
Scenario Outline: Verify the "Merchants Tab" Content for "Merchant Intelligence APIs -> "Merchant", "transactions" and "Funding"
     When I click on the "APIs" Tab from header
     When I click on MerchantIntelligenceAPI page
     When I click on Merchants Tab
     Then I navigate to MerchantIntelligenceAPI and verify "<MerchantIntelligenceAPIHeader>" page
     And I should see the detailed content of MerchantIntelligenceAPI "<MerchantIntelligenceAPIDetailedContent>" content
     Then I verify the following content of merchantsTab after clicking each "<DocumentationLinkHeader>"
     And I should verify the furtherdetails "<FurtherdetailsHeader>" and the featureHeader "<FeaturesHeader>" content
     Then I should verify the solutionHeader "<SolutionsHeader>" content
     Examples:
     |MerchantIntelligenceAPIHeader|MerchantIntelligenceAPIDetailedContent|DocumentationLinkHeader|FurtherdetailsHeader|FeaturesHeader|SolutionsHeader|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Authorisations|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Account|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Chargeback|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|General Merchant|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Configuration|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Service Orders|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Terminal|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Fraud|Further details|Features|Solutions|
      
@TC_06MerchantsAPIsdetailspage_UI
Scenario Outline: Verify the "Transactions Tab" Content for "Merchant Intelligence APIs -> "Merchant", "transactions" and "Funding"
		 When I click on the "APIs" Tab from header
     When I click on MerchantIntelligenceAPI page
     When I click on Transactions Tab
     Then I navigate to MerchantIntelligenceAPI and verify "<MerchantIntelligenceAPIHeader>" page
     And I should see the detailed content of MerchantIntelligenceAPI "<MerchantIntelligenceAPIDetailedContent>" content
     Then I verify the following content of TransactionTab after clicking each "<DocumentationLinkHeader>"
     And I should verify the furtherdetails "<FurtherdetailsHeader>" and the featureHeader "<FeaturesHeader>" content
     Then I should verify the solutionHeader "<SolutionsHeader>" content
  	 Examples:
     |MerchantIntelligenceAPIHeader|MerchantIntelligenceAPIDetailedContent|DocumentationLinkHeader|FurtherdetailsHeader|FeaturesHeader|SolutionsHeader|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Authorisations|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Pre-payments|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Transactions|Further details|Features|Solutions|

@TC_07MerchantsAPIsdetailspage_UI 
Scenario Outline: Verify the "Funding Tab" Content for "Merchant Intelligence APIs -> "Merchant", "transactions" and "Funding"
     When I click on the "APIs" Tab from header
     When I click on MerchantIntelligenceAPI page
     When I click on Funding Tab
     Then I navigate to MerchantIntelligenceAPI and verify "<MerchantIntelligenceAPIHeader>" page
     And I should see the detailed content of MerchantIntelligenceAPI "<MerchantIntelligenceAPIDetailedContent>" content
     Then I verify the following content of FundingTab after clicking each "<DocumentationLinkHeader>"
     And I should verify the furtherdetails "<FurtherdetailsHeader>" and the featureHeader "<FeaturesHeader>" content
     Then I should verify the solutionHeader "<SolutionsHeader>" content
  	 Examples:
     |MerchantIntelligenceAPIHeader|MerchantIntelligenceAPIDetailedContent|DocumentationLinkHeader|FurtherdetailsHeader|FeaturesHeader|SolutionsHeader|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Authorisations|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|General Funding|Further details|Features|Solutions|
     |Merchant Intelligence APIs|View general merchant account, transaction and funding information|Funding Orders|Further details|Features|Solutions|