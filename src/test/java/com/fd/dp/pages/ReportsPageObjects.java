package com.fd.dp.pages;

import com.fd.serenity.core.BasePageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReportsPageObjects extends BasePageObject{
	
	@FindBy(xpath="//span[@translate='PAGE_TITLES.REPORTS']")
	public WebElementFacade MP_Reports;
	
	

}
