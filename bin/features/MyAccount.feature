@MyAccount
Feature: As a User I Validate My account Page contains the details of the user.

  Background: 
    Given I'm on "Welcome to the First Data Developer Hub"
    And I navigate to "Login" Page
    And I login with an "rameshbala568" account
    
    
   @TC38_MyAccount_UI01
  Scenario Outline: Verify the My account page UI content
    And I should see the following "<My Account>" Page
    And I should see the "<Dashboard>" tab
    Then i should see the "<Your apps>" label
    And I should see the "<Settings>" Tab

    Examples: 
      |My Account|Dashboard|Your apps|Settings|
      |My account|Dashboard|Your apps|Settings|

  @TC39_MyAccount_UI02
  Scenario Outline: I click on "Settings_Tab"
    And i should click on "<settings>" button
    And I should see the following "<Personal details content>" 
    And I should see the "<personal details>" 
    And I should see the "<emailaddress>" labell
    And I should see the "<Company>" on label

    Examples: 
      |settings|Personal details content|personal details|emailaddress|Company|
      |Settings|Personal details|Suganya|E-mail address|Company|
      
   @TC40_MyAccount_UI03
     Scenario Outline: I should see the following "personal details"
     And I should click "<settings>" 
      And I should see "<login credentials>" label
      And i should see the password "<password>" tab
      And i should see the star "<Passwordhidden>" 
      
     Examples:    
   |login credentials|password|Passwordhidden|
   |Login credentials|Password|*********|
   
   @TC41_MyAccount_UI04
   Scenario Outline: Verify the Edit and save functionality on My account page
   
   And I click on "<Settings_Tab>"   
   And I click on to "<Edit_hyperlink>" 
   And I should see label "<Edit personal details_label>" page
   And I should see email-a "<E-mail address_label>" 
   And I should see company "<Company_label>"  
  Examples:
  |Settings_Tab|Edit_hyperlink|Edit personal details_label|E-mail address_label|Company_label|
   |Settings|Edit|Edit personal details|E-mail address *|Company|
   
   @TC42_MyAccount_UI05     
  Scenario Outline: Verify the Edit and save with valid data on My account page
  
  And I click the "<Settings_Tab>" 
  And I click on "<Edit_hyperlink>" link
  And I enter the "<Email address>" and "<Company>" in input fields 
  And I click on "<Save>" icon    
  And i should the details should save successfully with "<Updated Personal Details>" 
  And I should see "<Personal Details page>" 

Examples:
  |Settings_Tab|Edit_hyperlink|Email address|Company|Save|Updated Personal Details|Personal Details page|
  |Settings|Edit|E-mail address *|Company|Save|The changes have been saved.|Personal details|

   
   @TC43_MyAccount_UI06
  Scenario Outline: Verify the Content for Change Password on My account page
  
  And i should click on SettingsTabIcon "<settings>" 
  And i should click on ChangePasswordlinkText "<changepassword>" 
  And i should see change password hearder "<password header>" 
  And i should see new Password label "<NewPassword>" 
  And i should see confirm new Password label "<confirmnewPassword>" 
  And i should see make safe text "<make your paswd safe>" 
  And i should see the minimum of characters "<minimum of 8 characters>" 
  And i should capital text "<Capitals and small letters>" 
  And i should see the special characters text "<Special characters and numbers>" 
  And i should see the password text "<Password cannot contain 4 same consecutive characters>" 
  
  Examples: 
  |settings|changepassword|password hearder|NewPassword|confirmnewPassword|make your paswd safe||minimum of 8 characters|Capitals and small letters|Special characters and numbers|Password cannot contain 4 same consecutive characters|
  |Settings|Change your password|Password change|New Password|Confirm New Password|Make your password extra safe:| |A minimum of 8 characters|Capitals as well as small letters|Special characters (>?#$%*^) and numbers|Password cannot contain 4 same consecutive characters|
  
  @TC44_MyAccount_UI07
  Scenario Outline: Verify the Change Password and Save with valid data on My account page
  
  And I click on settings_Tab icon "<Settings_Tab>" 
  And I should see the change password link icon "<Change Password_hyperlink>" 
  And I click on change_password link "<Change Password hyperlink>" 
  And I enter "<NewPassword>" and "<ConfirmPassword>" in text box
  And I click on save icon "<Save>"  
  And I should see the "<Personal Details page>" personal details page 
  
  Examples:
  |Settings_Tab|Change Password_hyperlink|Change Password hyperlink|NewPassword|ConfirmPassword|Save|Personal Details page|
  |Settings|Change your password|Change your password|New Password|Confirm New Password|Save|Personal details|
  
 
  
   @TC45_MyAccount_UI08       
Scenario Outline: Verify the Edit and save with invalid data on My account page

  And I click on Settings Tab icon "<Settings_Tab>" 
  And I should see the EditHyperLink "<Edit_hyperlink>" 
  And I click on EditHyperLink "<Edit_hyperlink>" 
  And I enter the email "<Email address>" and company "<Company>" in input fields 
  And I click on save icon link "<Save>" 
  And I see Error message "<Error message>" 
     
  
  Examples:
   |Settings_Tab|Edit_hyperlink|Edit_hyperlink|Email address|Company|Save|Error message|
   |Settings|Edit|Edit|E-mail address *|Company|Save|The e-mail address abcd is not valid.|
   
        
  
  @TC46_MyAccount_UI09         
Scenario Outline: Verify the Edit Back functionality on My account_EditPersonal Details page

  And I click on Settings_icon "<Settings_Tab>" 
  And I click on Edit_link "<Edit_hyperlink>" 
  And I should see the BackButton "<Back_button>"  
  And I click on BackHyperlink "<Back_hyperlink>" 
  Then I should navigate to "<Personal_Details>" Page
  And I should see "<Settings_Tab>" Highlighted 
  
 
 Examples:
  |Settings_Tab|Edit_hyperlink|Back_button|Back_hyperlink|Personal_Details|Settings_Tab|
  |Settings|Edit|Back|Back|Personal details|Settings|
  
  
    @TC47_MyAccount_UI10              
Scenario Outline: Verify the Edit and Cancel functionality on My account page

  And I click on settings "<Settings_Tab>" 
  And I should see the edit link "<Edithyperlink>" 
  And I click on edithyperlink "<Edit_hyperlink>" 
  And I should see Edit personal details "<Edit personal details_label>" 
  And I should see Email address "<E-mail address_label>" 
  And I should see companylabel "<Company_label>" 
  And I enter the "<Emailaddress>" and "<Company>" in input field 
  And I click on cancel "<Cancel>"  
  And I should see the personal details content "<Personal Details page>" 
  
  Examples:
  |Settings_Tab|Edithyperlink|Edit_hyperlink|Edit personal details_label|E-mail address_label|Company_label|Emailaddress|Company|Cancel|Personal Details page|
  |Settings|Edit|Edit|Edit personal details|E-mail address *|Company|E-mail address *|Company|Cancel|Personal details|
  
  
 
  
 
  