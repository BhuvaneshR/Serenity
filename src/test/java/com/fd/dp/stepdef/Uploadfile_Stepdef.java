package com.fd.dp.stepdef;

import org.junit.Assert;

import com.fd.dp.steplib.uploadfile_Methods;

import cucumber.api.java.en.Given;
import net.serenitybdd.core.pages.PageObject;

public class Uploadfile_Stepdef extends PageObject{

	uploadfile_Methods uploadfile;
	
	@Given("^the user login to Admin console successfully$")
	public void the_user_login_to_Admin_console_successfully() throws InterruptedException {
		try {
			String Result = uploadfile.adminLogin();
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
	    
	


	@Given("^the user click on Documents$")
	public void the_user_click_on_Documents() {
		try {
			String Result = uploadfile.clickonDocuments();
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

	@Given("^the user should click on Add Button$")
	public void the_user_should_click_on_Add_Button() {
		
		try {
			String Result = uploadfile.clickAddButton();
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

	@Given("^select Alliance code as \"([^\"]*)\"$")
	public void select_Alliance_code_as(String Bin) {
		try {
			String Result = uploadfile.selectAllianceCode(Bin);
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

	@Given("^Enter the document name as \"([^\"]*)\"$")
	public void enter_the_document_name_as(String BINfile) {
		try {
			String Result = uploadfile.EnterDocumentname(BINfile);
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

	@Given("^select the language \"([^\"]*)\"$")
	public void select_the_language(String language) {
		try {
			String Result = uploadfile.selectlanguage(language);
			if (Result.contains("passed")) {

				Assert.assertTrue(Result, true);
			} else {

				Assert.fail(Result);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
					}

	}
	
	
	@Given("^select the document path \"([^\"]*)\"$")
	public void select_the_document_path(String path) {
		try {
			String Result = uploadfile.selectDocumentPath(path);
			if (Result.contains("passed")) {

				Assert.assertTrue(Result, true);
			} else {

				Assert.fail(Result);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
					}
		
		
		
		
		
		
	}
	@Given("^Enter the Description as \"([^\"]*)\"$")
	public void enter_the_Description_as(String Description) {
		try {
			String Result = uploadfile.Enterdescription(Description);
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

	@Given("^click on Choosefile button and Enter \"([^\"]*)\" Click on Upload Button$")
	public void click_on_Choosefile_button_and_Enter_Click_on_Upload_Button(String filepath) {
		try {
			String Result = uploadfile.clickonchoosefileandupload(filepath);
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

	@Given("^click on save Button$")
	public void click_on_save_Button() {
		try {
			String Result = uploadfile.clickonSave();
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




