package com.fd.dp.steplib;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.fd.dp.pages.Adminconsole_fileupload;
import com.fd.serenity.core.BasePageObject;
import com.fd.serenity.core.ConfigParameters;

public class uploadfile_Methods extends BasePageObject {

	String Result = null;
	String path = "Adminpdf-converted.pdf";
    Robot robot ;
	StringSelection ss = new StringSelection(path);
	Adminconsole_fileupload AC_fileUpload;
	final long LongWait = 3000;
	final long ShortWait = 1500;

	public String adminLogin() throws InterruptedException {
		navigateToURL(ConfigParameters.getInstance().getProperty("Admin_URL"));
		if (AC_fileUpload.Admin_username.isCurrentlyVisible())
		{
			Clear_SendKeys(AC_fileUpload.Admin_username, ConfigParameters.getInstance().getProperty("Admin_UserName"));
			Clear_SendKeys(AC_fileUpload.Admin_password,ConfigParameters.getInstance().getProperty("Admin_Password"));
			Clear_SendKeys(AC_fileUpload.Admin_Alliancecode, "BIN");
			clickElement(AC_fileUpload.Admin_login);

			return Result = "Passed " + "User successfully logged into admin portal";
		} 
		else 
		{
			return Result = "Failed" + "User- " + ConfigParameters.getInstance().getProperty("Admin_UserName")
					+ "login to failed";
		}
	}

	public String clickonDocuments() {
		waitforNonAngular(AC_fileUpload.Admin_clickDocuments, ShortWait);

		if ((AC_fileUpload.Admin_clickDocuments).isDisplayed()) {
			clickElement(AC_fileUpload.Admin_clickDocuments);

			return Result = "Passed " + "User successfully clicked on " ;
		} else {
			return Result = "Failed" + "User failed to click on " ;
		}

	}

	public String clickAddButton() {
		waitforNonAngular(AC_fileUpload.Admin_clickAdd, ShortWait);

		if (AC_fileUpload.Admin_clickAdd.isCurrentlyVisible()) {
			clickElement(AC_fileUpload.Admin_clickAdd);

			Result = "Passed " + "User successfully clicked on " ;
		} else {
			Result = "Failed" + "User failed to click on ";
		}

		return Result;

	}

	public String selectAllianceCode(String Bin) {
		
		selectFromDropdownByVisibleText(AC_fileUpload.Admin_EnterAlliancecode, Bin);
        if(AC_fileUpload.Admin_EnterAlliancecode.isEnabled()){
        Result = "Passed " + "User successfully Entered Alliance code " ;
        }
        else{
		
		Result = "Failed" + "User failed to Enter Alliance code ";
        }

		return Result;

	}

	public String EnterDocumentname(String BINfile) {

		
		if (AC_fileUpload.Admin_EnterDocumentName.isPresent()) {
		Clear_SendKeys(AC_fileUpload.Admin_EnterDocumentName, BINfile);
			Result = "Passed" + "Document Name is Entered";
		} else {
			Result = "Failed" + "Document Name is not Entered";
		}
		return Result;
	}

	public String selectlanguage(String language) {

		waitforNonAngular(AC_fileUpload.Admin_selectlanguage, ShortWait);
		
		if (AC_fileUpload.Admin_selectlanguage.isDisplayed()) {
			selectFromDropdownByVisibleText(AC_fileUpload.Admin_selectlanguage, language);
			
			Result = "passed" + "user selected the appropriate language ";
		} else {
			Result = "Failed" + "User selected the inappropriate Language";
		}
		return Result;
	}
	
	public String selectDocumentPath(String path) {

		waitforNonAngular(AC_fileUpload.Admin_selectdocumentpath, ShortWait);
		
		if (AC_fileUpload.Admin_selectdocumentpath.isDisplayed()) {
			selectFromDropdownByVisibleText(AC_fileUpload.Admin_selectdocumentpath, path);
			
			Result = "passed" + "user selected the appropriate Document path ";
		} else {
			Result = "Failed" + "User selected the inappropriate Document path";
		}
		return Result;
	}

	public String Enterdescription(String Description) {
		
		if (AC_fileUpload.Admin_EnterDescription.isEnabled()) {
			Clear_SendKeys(AC_fileUpload.Admin_EnterDescription, Description);
			Result = "Passed" + "User Entered the description";
		} else {
			Result = "Failed" + "User not entered the description";
		}
		return Result;
	}

	public String clickonchoosefileandupload(String filepath) {
		clickElement(AC_fileUpload.Admin_choosefile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //copy the above string to clip board     
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000); 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER); 
		
		//uploadFile(AC_fileUpload.Admin_choosefile, filepath);
		clickElement(AC_fileUpload.Admin_clickupload);
		if (AC_fileUpload.Admin_fileuploadmessage.isDisplayed()) {
			Result = "Passed" + "file uploaded successfully";
		} else {
			Result = "failed" + "failed upload failed";

		}
		return Result;
	}

	public String clickonSave() {
		clickElementJS(AC_fileUpload.Admin_clicksave);
		if (AC_fileUpload.Admin_clicksave.isCurrentlyVisible()) {
			Result = "Passed" + "clicked on save button";
		} else {
			Result = "failed" + "failed to click on save button";

		}
		return Result;
	}

}
