package com.fd.dp.steplib;

import com.fd.dp.pages.ExportsPageObjects;
import com.fd.serenity.core.BasePageObject;

public class ExportsMethods extends BasePageObject {

	String Result = null;
	final long ShortWait = 1500;
	ExportsPageObjects exports;

	public String clickonExportEmail(String Exportemail) {

		clickElement(exports.Admin_ExportEmail);
		if (exports.Admin_VerifyExportEmail.isCurrentlyVisible()) {

			Result = "Passed" + "User Successfully clicked on Export Email";
		} else {
			Result = "Failed" + "User Faild to click on Export Email";

		}
		return Result;
	}

	public String selectBin(String Bin) {

		if (exports.Admin_selectAlliancename.isDisplayed()) {
			selectFromDropdownByVisibleText(exports.Admin_selectAlliancename, Bin);
			Result = "Passed" + "User Select the alliance name";
		} else {
			Result = "Failed" + "User Failed to Select the alliance name";

		}
		return Result;
	}

	public String clickonExport(String exporttoCSV) {

		if (exports.Admin_clickExport.isCurrentlyVisible()) {
			clickElement(exports.Admin_clickExport);
			Result = "Passed" + "User successfully clicked on Export CSV button";
		} else {
			Result = "Failed" + "User Failed to  click on Export CSV button";

		}
		return Result;

	}
}
