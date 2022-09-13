package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class CreateIndividual extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Individual";
		testDescription ="Create Individual with mandatory fields";
		authors="shru";
		category ="Smoke";
		excelFileName="CreatenewIndividuals";
	}
	
	 @Test(dataProvider = "fetchData")
	    public void createOpportunity(String username, String password, String searchValue, String surName, String salutation, String firstName, String fullName) {
	        new LoginPage()
	        .enterUsername(username)
	        .enterPassword(password)
	        .clickLogin()
	        .verifyHomePage()
	        .clickToggleMenn()
	        .searchAndClickInd(searchValue)
	        .clickNew()
	        .enterSurName(surName)
	        .validateSurName(surName)
	        .clickEdit()
	        .selectSalutation(salutation)
	        .enterFirstName(firstName)
	        .validateFullName(fullName);

	}

}
