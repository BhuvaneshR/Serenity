package com.fd.dp.steplib;

import com.fd.dp.pages.ReportsPageObjects;
import com.fd.serenity.core.BasePageObject;

public class Reports_Methods extends BasePageObject{
	
	String Result = null;
	BasePageObject basePageObject;
	final long LongWait = 3000;
	final long ShortWait = 1500;
	ReportsPageObjects reports;
	
	public String BAReports(){
		
		if(reports.MP_Reports.isCurrentlyVisible()){
			 Result = "Failed" + "BA is allowed to Accces the Reports";
		}
		else{
			 Result = "Passed" + "BA is not Allowed to Access Reports";
		}
		
		return Result;
	}
}
