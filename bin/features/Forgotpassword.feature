@forgot_password
Feature: As a User I navigate to forgot password flow

Background: 
Given I'm on "Welcome to the First Data Developer Hub"
And I navigate to "Forgot password?" Page from homepage
When I'm on "Forgot password?" forgot password page

@TC17_Forgot_Password_UI_01          
Scenario Outline: Verify the Forgot Password page UI content
Then I should see following contents on "<HomeLink>"  "<passwordtext desc>"  forgot password page
And I should see the following contents on forgot password page "<Email Label>"  "<Email new password btn>"  "<Back to login>" 
Examples:    
|HomeLink|passwordtext desc|Email Label|Email new password btn|Back to login|
|https://FDdev:FDdev123!@developerdev.firstdata.eu/|Enter your email below and we will send you a link to create a new password.|E-mail *|E-mail new password|https://FDdev:FDdev123!@developerdev.firstdata.eu/user/login|


@TC18_Forgot_Password_UI_02 
Scenario Outline: Verify the forgot password functionality with valid data. 
And I enter data in "<Email>" field and click Email new password button
Then I should navigated to "<Password reset email sent>" page
Examples:       
|Email|Password reset email sent|
|Rajkumar.S2d3811@cognizant.com|Password reset email sent!|
#|rameshbala568+1@gmail.com|
#|rameshbala568+2@gmail.com|

#Password_functionality 
@TC19_Forgot_Password_UI_03
Scenario Outline: Verify the forgot password functionality with invalid data.  
And I enter invalid data in "<Email>" field and click Email new password button
Then I should see "<error message>" on forgot password page
Examples:       
|Email|error message|
|fghfgh|Sorry, fghfgh is not recognised as a user name or an email address.|
#|"£$%£$^£$^|


        
        
       
        
      
        
  
        
       

   

