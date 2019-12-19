package com.fd.dp.steplib;

import org.openqa.selenium.WebDriver;
import java.util.List;
import com.fd.dp.pages.AdminconsoleSubMenu;
import com.fd.serenity.core.BasePageObject;

import net.serenitybdd.core.pages.WebElementFacade;

public class Adminconsolesubmenu_methods extends BasePageObject{
	
	WebDriver driver = null;
	String Result = null;
	BasePageObject basePageObject;
	final long LongWait = 3000;
	final long ShortWait = 1500;
	AdminconsoleSubMenu submenu;
	
	public String listSubMenu(String parameters,String CreateUser,String UserList,String EmailTemplates,String SMSTemplates,String CommunicationSummary,String GUIMessages,String TermsAndConditions,String documents,String ExportEmail)
	{
		List<WebElementFacade> al = submenu.Admin_SubMenu;
	
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i).getText().contains(parameters)||
			   al.get(i).getText().contains(CreateUser)||
		       al.get(i).getText().contains(UserList)||
		       al.get(i).getText().contains(EmailTemplates)||
		       al.get(i).getText().contains(SMSTemplates)||
		       al.get(i).getText().contains(CommunicationSummary)||
		       al.get(i).getText().contains(GUIMessages)||
		       al.get(i).getText().contains(TermsAndConditions)||
		       al.get(i).getText().contains(documents)||
		       al.get(i).getText().contains(ExportEmail))
			{
				Result = "Passed " + "User verified each sub components available in admin portal";
				break;
			}
			
			else
			{
				Result = "Failed " + "User failed to verify each sub components available in admin portal";
			}
			
		}
		return Result;

	}
	
	public void ClickonExport(String exporttoCSV){
		
		
	}

}
