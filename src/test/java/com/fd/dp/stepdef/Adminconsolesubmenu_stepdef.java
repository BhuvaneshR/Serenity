package com.fd.dp.stepdef;

import org.junit.Assert;

import com.fd.dp.steplib.Adminconsolesubmenu_methods;


import cucumber.api.java.en.Given;

public class Adminconsolesubmenu_stepdef 
{
	Adminconsolesubmenu_methods ac_submenu;
	
	@Given("^User should be able to see all the sub menu \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\" components in Admin console$")
	public void user_should_be_able_to_see_all_the_sub_menu_components_in_Admin_console(String parameters, String CreateUser, String UserList, String EmailTemplates, String SMSTemplates, String CommunicationSummary, String GUIMessages, String TermsAndConditions, String documents, String ExportEmail) 
	{
		try {
			String Result = ac_submenu.listSubMenu(parameters, CreateUser, UserList, EmailTemplates, SMSTemplates, CommunicationSummary, GUIMessages, TermsAndConditions, documents, ExportEmail) ;
			if (Result.contains("Passed")) {

				Assert.assertTrue(Result, true);
			} else {
				Assert.fail(Result);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());

		}
	}

}
