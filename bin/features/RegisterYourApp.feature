@Yoursapps
Feature: As a User I navigate to YourApps page and able to use the Register your Apps and Your Apps page.

  Background: 
    Given I'm on "Welcome to the First Data Developer Hub"
    And I click and navigate to "Log into Developer Hub" Page from homepage
    When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
    #When I enter data in "Suganya.gajaraj@cognizant.com" and "Lovelylife@1" on login page
    And I click on "Log in" button and I should sucessfully logged in
    And I should see "Dashboard" page once I logged in
    And I click on your apps tab and verify the text "Register your App"

  @TC50_RegisterYourApppage_UI_01
  Scenario: Verify the Register your app UI content
    And I click on "Register your App" button on your apps page
    Then I should see the following "mandatory content"  and "Non mandatory content" on Register your App page
      | Register your App                                                                |
      | In order to proceed please describe the app you'd like to connect with the APIs. |
      | Application name                                                                 |
      | Callback URL                                                                     |
      | Environment                                                                      |
      | Description                                                                      |
      | Application type                                                                 |
      | Industry                                                                         |
      | Purpose                                                                          |

  @TC51_RegisterYourApppage_UI_02
  Scenario Outline: Verify the Register your app UI with Boarding API's option and validate on your API page
    And I click on "Register your App" button on your apps page
    Then I fill the following content in page "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And I click on "Next step >" after filling all the details
    Then I should see the following content on second page "<page_header>"  "<board_api>"  "<fund_api>"  "<trans_api>" "<merchant_api>"
    And I click on check box "Boarding API" and I click on "Register your App" button
    And I navigate to "Your apps" page
    Then I should the following content for "<appname>" on Your Apps page
    And verify all the details were added correctly "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And verify edit and revoke button and other information in yours apps "Edit >"  "Revoke >"  "1" "Pending"

    Examples: 
      | appname | callbackURL      | desc          | env  | apptype    | industry         | purpose                  | page_header         | board_api    | fund_api    | trans_api        | merchant_api  |
      | Test    | https://www.test | Test1_Details | Test | Mobile IOS | Consumer Finance | Research and Development | Select API products | Boarding API | Funding API | Transactions API | Merchants API |

  @TC52_RegisterYourApppage_UI_03
  Scenario Outline: Verify the Register your app UI with Boarding API and Funding API's option and validate on your API page
    And I click on "Register your App" button on your apps page
    Then I fill the following content in page "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And I click on "Next step >" after filling all the details
    And I click on check box "Boarding API"  "Funding API" and I click on "Register your App" button
    And I navigate to "Your apps" page
    Then I should the following content for "<appname>" on Your Apps page
    And verify all the details were added correctly "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And verify edit and revoke button and other information in yours apps "Edit >"  "Revoke >"  "2" "Pending"

    Examples: 
      | appname | callbackURL      | desc          | env  | apptype    | industry         | purpose                  |
      | Test    | https://www.test | Test1_Details | Test | Mobile IOS | Consumer Finance | Research and Development |

  @TC53_RegisterYourApppage_UI_04
  Scenario Outline: Verify the Register your app UI with Boarding API,Funding API's and Transactions API's option and validate on your API page
    And I click on "Register your App" button on your apps page
    Then I fill the following content in page "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And I click on "Next step >" after filling all the details
    And I click on check box "Boarding API"  "Funding API"  "Transactions API" and I click on "Register your App" button
    And I navigate to "Your apps" page
    Then I should the following content for "<appname>" on Your Apps page
    And verify all the details were added correctly "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And verify edit and revoke button and other information in yours apps "Edit >"  "Revoke >"  "3" "Pending"

    Examples: 
      | appname | callbackURL      | desc          | env  | apptype    | industry         | purpose                  |
      | Test    | https://www.test | Test1_Details | Test | Mobile IOS | Consumer Finance | Research and Development |

  @TC54_RegisterYourApppage_UI_05
  Scenario Outline: Verify the Register your app UI with Boarding API,Funding API's,Transactions API's and Merchants API's option and validate on your API page
    And I click on "Register your App" button on your apps page
    Then I fill the following content in page "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And I click on "Next step >" after filling all the details
    And I click on check box "Boarding API"  "Funding API"  "Transactions API"  "Merchants API" and I click on "Register your App" button
    And I navigate to "Your apps" page
    Then I should the following content for "<appname>" on Your Apps page
    And verify all the details were added correctly "<appname>"  "<callbackURL>"  "<desc>"  "<env>"  "<apptype>"  "<industry>" "<purpose>"
    And verify edit and revoke button and other information in yours apps "Edit >"  "Revoke >"  "4" "Pending"

    Examples: 
      | appname | callbackURL      | desc          | env  | apptype    | industry         | purpose                  |
      | Test    | https://www.test | Test1_Details | Test | Mobile IOS | Consumer Finance | Research and Development |
