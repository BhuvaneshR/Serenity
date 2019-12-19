package com.fd.dp.stepdef;

import org.junit.Assert;

import com.fd.dp.steplib.Reports_Methods;
import com.fd.serenity.core.BasePageObject;

import cucumber.api.java.en.Given;

public class ReportsStepDef extends BasePageObject {
	
	Reports_Methods reports;
	
	@Given("^User should not be able to see \"([^\"]*)\"$")
	public void user_should_not_be_able_to_see(String arg1) {
		
		try {
			String Result = reports.BAReports();;
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


