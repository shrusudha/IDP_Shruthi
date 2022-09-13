package com.leaftaps.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class ViewIndividualsPage extends ProjectSpecificMethods {

	
	 @BeforeTest
     public void setOppvalue() {
         testcaseName = "Create Individual";
         testDescription ="Create and Verify new Individual";
         authors="shru";
         category ="Smoke";
         excelFileName = "CreatenewIndividuals";
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
