@homepage
Feature: As a User I navigate to Home Page and able to use the Home Page.

  Background: 
    Given I'm on "Welcome to the First Data Developer Hub"
   # And I click and navigate to "Log into Developer Hub" Page from homepage
   # When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
   # And I click on "Log in" button and I should sucessfully logged in
    #And I should see "Dashboard" page once I logged in
    #Then I should see following contents on "https://developerdev.firstdata.eu/" and click it

  @HomePageUI_01
  Scenario Outline: Verify the First Data content present in Home page UI -Scenario1
    Then i should see the following "<FirstDataMessage>" on home page
    Then I should see the "<View APIs>" button on Home page

    Examples: 
      |FirstDataMessage|View APIs|
      |The home of all First Data open APIs. Browse our catalogue and integrate with our APIs to enrich your clients digital experiences.|View APIs| 

  @HomePageUI_02
  Scenario Outline: Verify the FD API'S section content present in Home page UI -Scenario2
    And I should see the text on "<Boarding APIs>" the Home Page
    And I should see the following content for "<Boarding APIs text>" on Home Pagee
    And i should see the desc "<Boarding API's Description text>" on Home Page

    Examples: 
      |Boarding APIs|Icon|Boarding APIs text|Boarding API's Description text|
      |Choose the best FD API for your business|Icon|Boarding and Offers APIs|Entice new merchants and get them up and running in no time!|

  @HomePageUI_03
  Scenario Outline: Verify the FD PAyment APIs section content In Home Page UI -Scenario3
    And I should see the following content for "<Payment APIs>" on Home Page
    Then I should see the following "<PaymentAPIsDescription>" on Home page

    Examples: 
      |Payment APIs|PaymentAPIsDescription|
      |Payment APIs|Process payments in your App|

  @HomePageUI_04
  Scenario Outline: Verify the FD Merchant Intelligent APIs content on HomePage UI- Scenario 4
    Then I should see the following content on the "<Merchant Intelligent APIs>" on HomePagee
    And I should see the following "<Merchant>" text on HomePage
    And I should see the following message for "<Merchant Intelligent Description text>" on HomePage

    Examples: 
      |Merchant Intelligent APIs|Merchant|Merchant Intelligent Description text|
      |Merchant Intelligence APIs|Merchant|View general merchant account information|

  @HomePageUI_05
  Scenario Outline: Verify the How it Work section  content present in Home page UI -Scenario5
   
      And I should see the textt on "<How it works>" on Home page
      And I should see the following content for the "<Register an account>" on Home Page
      And I should see the following Message "<Register an account lable>" on Home Page
      Examples:
      |How it works|Register an account|Register an account lable|
      |How it works|1. Register an account|First things first, register an account with us so we can verify who you are.|
      
   @HomePageUI_06
   Scenario Outline: verify the Register your app on Home Page UI- Scenario6
    
     Then I should see the following text on "<Then register your app>" on Home Page
     And  I should see the Register App "<Icon>" on Home Page
     And  I should see the description Text "<Register your App Description>" on Home Page
     Examples:
     |Then register your app|Register your App Description|Icon|
     |2. Then register your App|By taking some extra details about your App we can optimise your API integration experience|Icon|
    
    @HomePageUI_07
    Scenario Outline: Verify the following content for API key approval on Home Page UI- Scenario7
    
    Then i Should see text "<API key approval>" on Home Page
    And I should see the API key Approval "<Icon>" on Home Page
    And i should the description text "<API Key Description>" on Home Page
    
    Examples:
    |API key approval|Icon|API Key Description|
    |3. API key approval|Icon|The Developer Hub team will then issue separate Sandbox and Production environment API keys as you work towards going live.|
    
    @HomePageUI_08
    Scenario Outline: verify the following content for Go Live on Home Page UI- Scenario8
    
    Then i should the "<Go Live>" Text on Home Page
    And I should see the "<Icon>" on Home Page
    And I should see the Go live description Text "<Go Live Description>" on Home Page
    Examples:
    |Go Live|Icon|Go Live Description|
   |4. Go Live!|Icon|The final step is for us to approve your Production key and GO LIVE with the API integration!|
    
    @HomePageUI_09
    Scenario Outline: verify the succesfull navigation to different pages on Home Page UI- Scenario8
    
    Then user navigates to "<API Page>" page one
    And User navigates to "<How it works>" page two
    And user navigates to "<contact us>" page three
    Examples:
    |API Page|How it works|contact us|
    |APIs|How it works|Contact us|
    
     
     
      
    
  