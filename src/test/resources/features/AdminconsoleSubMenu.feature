	@XRAY-1550
Feature: Verify the Admin Console sub menu components dispalyed in Admin console

  Background: 
    Given the user login to Admin console successfully

  Scenario Outline: To verify the Sub menu components in Admin console
    Given User should be able to see all the sub menu "<parameters>"  "<CreateUser>"  "<UserList>"  "<EmailTemplates>"  "<SMSTemplates>"  "<CommunicationSummary>"  "<GUIMessages>"  "<TermsAndConditions>"  "<documents>"  "<ExportEmail>" components in Admin console

    Examples: 
      | parameters | CreateUser  | UserList  | EmailTemplates  | SMSTemplates  | CommunicationSummary  | GUIMessages  | TermsAndConditions   | documents | ExportEmail  |
      | Parameters | Create User | Users List| Email Templates | SMS Templates | Communication Summary | GUI Messages | Terms And Conditions | Documents | Export Email |
			
	
