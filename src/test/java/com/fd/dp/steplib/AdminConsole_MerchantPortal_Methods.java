package com.fd.dp.steplib;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

//import com.fd.dp.pages.AdminConsole_MerchantPortal_Page;
import com.fd.serenity.core.BasePageObject;
import com.fd.serenity.core.ConfigParameters;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class AdminConsole_MerchantPortal_Methods extends BasePageObject
{
	String Result = null;
	BasePageObject basePageObject;
	//AdminConsole_MerchantPortal_Page ac_mp_Page;
	
	final long LongWait=3000;
	final long ShortWait=1500;
	
	public String adminLogin() throws InterruptedException
	{
		
		navigateToURL(ConfigParameters.getInstance().getProperty("Admin_URL"));
		/*if(ac_mp_Page.adminConsoleUserName.isCurrentlyVisible())
		{
			Clear_SendKeys(ac_mp_Page.adminConsoleUserName, ConfigParameters.getInstance().getProperty("Admin_UserName"));
			Clear_SendKeys(ac_mp_Page.adminConsolePassword, ConfigParameters.getInstance().getProperty("Admin_Password"));
			Clear_SendKeys(ac_mp_Page.adminConsoleAllianceName, "BIN");
			clickElement(ac_mp_Page.adminConsoleLoginButton);
			
			Result = "Passed "+ "User successfully logged into admin portal";
		}
		else
		{	
			Result = "Failed" + "User- " + ConfigParameters.getInstance().getProperty("Admin_UserName") + "login to failed" ;
		}
		
		return Result;
		
		}


	public String clickGUIMessages()
	{
		waitforNonAngular(ac_mp_Page.guiMessageLink,ShortWait);
		
		if(isDisplayed(ac_mp_Page.guiMessageLink))
		{
			clickElement(ac_mp_Page.guiMessageLink);
			
			Result = "Passed " + "User successfully clicked on " + getText(ac_mp_Page.guiMessageLink);
		}
		else
		{	
			Result = "Failed" + "User failed to click on " + getText(ac_mp_Page.guiMessageLink);  
		}
		
		return Result;
		
	}
	
	public String clickAddButton()
	{
		waitforNonAngular(ac_mp_Page.guiAddButton,ShortWait);
		
		if(ac_mp_Page.guiAddButton.isCurrentlyVisible())
		{
			clickElement(ac_mp_Page.guiAddButton);
			
			Result = "Passed " + "User successfully clicked on " + getText(ac_mp_Page.guiAddButton);
		}
		else
		{	
			Result = "Failed" + "User failed to click on " + getText(ac_mp_Page.guiAddButton);
		}
		
*/		return Result;
		
	}
	
	public String selectAllianceName()
	{
		
			//selectFromDropdownByVisibleText(ac_mp_Page.messageAllianceCode, text);
			/*
			Result = "Passed " + "User successfully clicked on " + ac_mp_Page.guiAddButton.getText();  
			Result = "Failed" + "User failed to click on " + ac_mp_Page.guiAddButton.getText();  
		*/
		
		return Result;
		
	}




}