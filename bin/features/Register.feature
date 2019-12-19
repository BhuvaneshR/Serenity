@Register
Feature: As a User I navigate to Home Page and able to use the Home Page.

  Background: 
    Given I'm on "Welcome to the First Data Developer Hub"
    And I navigate to "Register an account" Page and I am on Register Page

  @TC48_registration_UI_01
  Scenario: Verify the Register page UI content
    Then I should see all the following contents on "<Register>" Page
      | https://FDdev:FDdev123!@developerdev.firstdata.eu/                                                                                 |
      | Home of all First Data open APIs. Browse our catalogue and integrate with our APIs to enrich your clients digital experiences.     |
      | Already have an account?                                                                                                           |
      | https://FDdev:FDdev123!@developerdev.firstdata.eu/user/login                                                                       |
      | Register an account                                                                                                                |
      | Name and surname                                                                                                                   |
      | Company                                                                                                                            |
      | Email                                                                                                                              |
      # | I'm not Robot                                                                                                                      |
      | Terms and Conditions                                                                                                               |
      | Contact                                                                                                                            |
      | Register                                                                                                                           |

  @TC49_registration_UI_02
  Scenario: Verify the successful registration with valid data
    When I enter data in all fields Name and Surname and Company and Email
 #   And I click on I'm not a Robot_checkbox
    And I click on both checkboxes "Term and Conditions" and "Contact"
    And I click on "Register" button
    Then I should see "Thank you for registering" message
    
    # waiting for client to provide test site which should have block recaptcha to complete this flow
