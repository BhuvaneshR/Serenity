package com.fd.dp.pages;

import java.util.List;

import com.fd.serenity.core.BasePageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdminconsoleSubMenu extends BasePageObject{
	
	@FindBy(xpath="//div[@id='content']//img")
	public List<WebElementFacade> Admin_SubMenu;

}
