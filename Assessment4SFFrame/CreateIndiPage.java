package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class CreateIndiPage extends ProjectSpecificMethods{
		
	
public CreateIndiPage enterSurName(String surName){

	WebElement ele = locateElement(Locators.XPATH,"//input[contains(@class,'lastName compoundBLRadius')]");
	clearAndType(ele, surName);
	click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
	reportStep("Last Name is entered", "PASS");
	return this;

}

public CreateIndiPage validateSurName(String sName) {

	WebElement surName = locateElement(Locators.XPATH, "//span[@class='uiOutputText']");
	verifyExactText(surName, sName);
	reportStep("SurName is Validated successfully", "PASS");
	return this;

}

public CreateIndiPage clickEdit() {
	
	click(locateElement(Locators.XPATH, "//div[@title='Edit']"));
	reportStep("Individuals option is clicked", "PASS");
	return this;
	
}

public CreateIndiPage selectSalutation(String salutation) {
	
	click(locateElement(Locators.XPATH, "//a[@class='select']"));
	click(locateElement(Locators.XPATH, "//a[text()='"+salutation+"']"));
	reportStep("Salutation is selected", "PASS");
	return this;
	
}

public CreateIndiPage enterFirstName(String firstName) {
	
	WebElement ele = locateElement(Locators.XPATH, "//input[contains(@class,'firstName compoundBorderBottom')]");
	clearAndType(ele, firstName);
	click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
	reportStep("First Name is Entered", "PASS");
	return this;
}

public CreateIndiPage validateFullName(String fullName) {
		 
 WebElement nameSal = locateElement(Locators.XPATH, "//span[text()='"+fullName+"']");
 verifyExactText(nameSal, fullName);
 reportStep("Full Name is Validated", "PASS");
 return this;
 
}

}
