package com.framework.testng.api.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.framework.selenium.api.base.SeleniumBase;
import com.framework.utils.DataLibrary;
import com.leaftaps.pages.LoginPage;

public class ProjectSpecificMethods extends SeleniumBase {

	@DataProvider(name = "fetchData", indices = 0)
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}
	
	@BeforeMethod
	public void preCondition() {
		startApp("chrome", false, "http://login.salesforce.com/");
		setNode();
     
	}	
	@AfterMethod
	public void postCondition() {
		close();

	}

	

	
	  

	
	
}
