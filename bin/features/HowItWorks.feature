@HowItworks
Feature: As a User I navigate to How it works page  and able to use the How it works Page.

  Background: 
Given I'm on "Welcome to the First Data Developer Hub"
And I click and navigate to "Log into Developer Hub" Page from homepage
When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
And I click on "Log in" button and I should sucessfully logged in
And I should see "Dashboard" page once I logged in
Then I should see following contents on "https://developerdev.firstdata.eu/" and click it
When I click on "How it works" Tab from header
And I'm on "How it works" Tab

  @TC29_HowitworksPage_UI_01
  Scenario: Verify the How it works content present in How it works page UI
    Then I should see "How it works_background image" on How it works page
    And I should see "How it works_text" on How it works page

  @TC30_HowitworksPage_UI_02
  Scenario: Verify the How it Work content details present in How it works page UI
    And I should see the following "<content Details>" , "<Content Image>" and "<Content Description>"
      | 1. Register an account    | RegisteAccount_Icon  | First things first, register an account with us so we can verify who you are.                                               |
      | 2. Then register your App | RegisterYourApp_Icon | By taking some extra details about your App we can optimise your API integration experience                                 |
      | 3. API key approval       | APIKey_Icon          | The Developer Hub team will then issue separate Sandbox and Production environment API keys as you work towards going live. |
      | 4. Go Live!               | GoLive_Icon          | The final step is for us to approve your Production key and GO LIVE with the API integration!                               |

  @TC31_HowitworksPage_UI_03
     Scenario Outline: Verify the Feedback content present in How it works page UI 
      And User should able to view feedback_header_text "<feedback_header_text>" on How it works page
      And User should able to verify feedback_icon is present on How it works page
      And User should able to see feedback_content_text "<feedback_content_text>" is present on How it works page
      Then User should able to see feedback_button "<feedback_button>" is present on How it works page
     
     Examples: 
     |feedback_header_text|feedback_content_text|feedback_button|
     |We are all ears|Whether your feedback is good, bad or ugly, the Developer Hub team want to hear all about it|Take me to a feedback form|
      
 
  @TC32_HowitworksPage_Functionality_01
   Scenario Outline: Verify the successful navigation to different pages from How it work page by clicking on Details link for each option (After login)
     And User should should able to see the Details_Header_Text "<Details_Header_Text>" for all options
     When User click on Details_link "<Details_link>" button
     Then User should should able to see a popup window for "<popupwindow_Header_text>"
     And User should close the popup_window
     And I'm on "How it works" Tab
     	
     Examples:
     |Details_Header_Text|Details_link|popupwindow_Header_text|
     |1. Register an account|#register|1. Register an account|
     |2. Then register your App|#registerApp|2. Then register your App|
     |3. API key approval|#apiKey|3. API key approval|
     |4. Go Live!|#goLive|4. Go Live!|
    
      
     
    @TC33_HowitwordsPage_Functionality_04
     Scenario Outline: Verify the Feedback Button and Feedback Form page
      And User should click on Take me to a feedback form button
      And User should navigate to Contact us "<Contact_us>" Tab
      Then User should be able to see I have a feedback_Header title "<feedback_Header_Title>" and I have a feedback_bedcrumps "<Contact_I_have_a_feedback>" Contact us page
       
     Examples:
      |Contact_us|feedback_Header_Title|Contact_I_have_a_feedback|
      |Contact us|I have a feedback|Contact > I have a feedback|
      
      
      
      
      
      
      
      
      
      
      