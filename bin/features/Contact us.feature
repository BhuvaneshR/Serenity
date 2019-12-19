@Contactus
Feature: As a User I navigate to Contact us and able to use the Contact us Page.

Background: 
Given I'm on "Welcome to the First Data Developer Hub"
And I click and navigate to "Log into Developer Hub" Page from homepage
#When I enter data in "Rajkumar.S2d3811@cognizant.com" and "Single@123" on login page
And I click on "Log in" button and I should sucessfully logged in
And I should see "Dashboard" page once I logged in
Then I should see the homepage and verify the homelink URL
When I click on "Contact us" Tab and Verify I am on Contact us Page

  @TC14_Contactus_UI_01
  Scenario Outline: Verify the contact us content present in Contact us UI
    Then I should see the background text on "<Contact us_backgroundtext>" on Contact us page

    Examples: 
      | Contact us_backgroundtext |
      | How can we help?          |

  @TC15_Contactus_UI_02
  Scenario Outline: Verify the three contents present in Contact us UI 
    And I should see the following contents for "<I need Support>""<Desc Of I need Support>" and I need Support Icon
    And I should see the following content for "<I have an idea>""<Desc Of I have an idea>" and I have an idea Icon
    And I should see the following content for "<I have feedback>""<Desc Of I have feedback>" and I have feedback Icon

    Examples: 
      | I need Support | Desc Of I need Support                                                 | I have an idea | Desc Of I have an idea                                | I have feedback | Desc Of I have feedback                                          |
      | I need Support | Search our list of FAQs or raise a ticket with the Developer Hub Team. | I have an idea | Collaborate and innovate with the Developer Hub Team. | I have feedback | Good, bad or ugly. the Developer Hub team want to hear about it. |

  @TC16_Contactus_UI_03
  Scenario Outline: Verify the successful navigation to different pages from Contact us
    And I click on respective boxes in contact us page "<Contact us boxes>" and verify the content on corresponding "<Page ContentDetails>"  and I click on Browser Back

    Examples: 
      | Contact us boxes | Page ContentDetails    |
      | I need Support   | Raise a support ticket |
      | I have an idea   | I have an idea         |
      | I have feedback  | I have a feedback      |
