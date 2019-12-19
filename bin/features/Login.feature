@login
Feature: As a User I can able to login successfully

  Background: 
    Given I'm on "Welcome to the First Data Developer Hub"
    And I click and navigate to "Log into Developer Hub" Page from homepage

  @TC34_Login_UI_01
  Scenario: Verify the Login page UI content
    Then I should see the following content on "<Login Page Details>" Login Page
      | Log into Developer Hub                                                                                                             |
      | https://FDdev:FDdev123!@developerdev.firstdata.eu/                                                                                 |
      | Home of all First Data open APIs. Browse our catalogue and integrate with our APIs to enrich your clients digital experiences.     |
      | Don't have an account?                                                                                                             |
      | https://FDdev:FDdev123!@developerdev.firstdata.eu/user/register                                                                    |
      | E-mail                                                                                                                             |
      | Password                                                                                                                           |
      | Log in                                                                                                                             |
      | https://FDdev:FDdev123!@developerdev.firstdata.eu/user/password                                                                    |

  @TC35_Login_UI_02
  Scenario Outline: Verify the successful valid Login with valid data
    When I enter data in "<Email>" and "<Password>" on login page
    And I click on "Log in" button and I should sucessfully logged in
    And I should see "Dashboard" page once I logged in

    Examples: 
      | Email                          | Password   |
      | Rajkumar.S2d3811@cognizant.com | Single@123 |

  #|sfkjshdfj@test.co.uk|Password123|
  @TC36_Login_UI_03
  Scenario Outline: Verify the Error message with invalid data for login fields
    When I enter invalid data in login page "<Email>" and "<Password>"
    Then I should see "<Error>" message after I click log in

    Examples: 
      | Email              | Password    | Error                                           |
      | asd@mailinator.com | Password123 | The email or password you entered is incorrect. |

  #|"£$"£$"£|"£$"£$|
  @TC37_Login_UI_04
  Scenario Outline: Verify i navigate to different pages from Login from
    When I click on "Register here" register link "<Registerpage>" and navigate back to login page
    And I click on "Forgot password?" forgot password link  "<Forgot password>" and navigate back to login page

    Examples: 
      | Registerpage        | Forgot password                                                              |
      | Register an account | Enter your email below and we will send you a link to create a new password. |
