package com.fd.dp.pages;

import com.fd.serenity.core.BasePageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class Adminconsole_fileupload extends BasePageObject {
	
	@FindBy(xpath="//input[@id='username']")
	public WebElementFacade Admin_username;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElementFacade Admin_password;
	
	@FindBy(id="allianceLogin")
	public WebElementFacade Admin_Alliancecode;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElementFacade Admin_login;
	
	@FindBy(xpath="//div[@class='home-menu']//a[@href='./documents']")
	public WebElementFacade Admin_clickDocuments;
	
	@FindBy(xpath="//a[@class='action-button']")
	public WebElementFacade Admin_clickAdd;
	
	@FindBy(xpath="//select[@id='allianceCode']")
	public WebElementFacade Admin_EnterAlliancecode;
	
	@FindBy(xpath="//input[@id='documentname']")
	public WebElementFacade Admin_EnterDocumentName;
	
	@FindBy(xpath="//select[@id='language']")
	public WebElementFacade Admin_selectlanguage;
	
	@FindBy(xpath="//select[@id='attachmentPath']")
	public WebElementFacade Admin_selectdocumentpath;
	
	@FindBy(xpath="//textarea[@id='textarea']")
	public WebElementFacade Admin_EnterDescription;
	
	@FindBy(xpath="//input[@name='cmsAttachmentDocPanel:fileInput']")
	public WebElementFacade Admin_choosefile;
	
	@FindBy(xpath="//input[@value='Upload']")
	public WebElementFacade Admin_clickupload;
	
	@FindBy(xpath="//span[@class='feedbackPanelINFO']")
	public WebElementFacade Admin_fileuploadmessage;
	
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElementFacade Admin_clicksave;
	
	
	
	
	
	
	
	
	
	
}
