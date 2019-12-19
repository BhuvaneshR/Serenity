package com.fd.dp.pages;


import com.fd.serenity.core.BasePageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExportsPageObjects extends BasePageObject {
	
	
	@FindBy(xpath="(//div[@id='content']//img[@src='img/email.png'])[2]")
	public WebElementFacade Admin_ExportEmail;
	
	@FindBy(xpath="//h4[@class='section-title table-title']")
	public WebElementFacade Admin_VerifyExportEmail;
	
	@FindBy(xpath="//select[@class='longExport']")
	public WebElementFacade Admin_selectAlliancename;
	
	@FindBy(xpath="//input[@id='export']")
	public WebElementFacade Admin_clickExport;
	
}
