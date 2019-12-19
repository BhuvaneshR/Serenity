package com.fd.dp.stepdef;

import org.junit.Assert;

import com.fd.dp.steplib.ExportsMethods;


import cucumber.api.java.en.Given;

public class ExportsStepDef {

	ExportsMethods exportsStep;

	@Given("^user should click on Export Email and I should see the \"([^\"]*)\" Header$")
	public void user_should_click_on_Export_Email_and_I_should_see_the_Header(String Exportemail) {

		try {
			String Result = exportsStep.clickonExportEmail(Exportemail);
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

	@Given("^user should select \"([^\"]*)\" from drop down$")
	public void user_should_select_from_drop_down(String Bin) {

		try {
			String Result = exportsStep.selectBin(Bin);
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

	@Given("^User should click on \"([^\"]*)\"$")
	public void user_should_click_on(String exporttoCSV) {

		try {
			String Result = exportsStep.clickonExport(exporttoCSV);
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
