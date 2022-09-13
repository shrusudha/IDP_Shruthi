package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {
		
		WebElement ele = locateElement("userName");
		
		 clearAndType(ele,data);
		
		reportStep("Username is entered","pass");
		
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		
		WebElement ele = locateElement(Locators.XPATH,"//input[@type='password']");
		
		clearAndType(ele,data);
		
		reportStep("Password is entered","pass");
		
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement(Locators.NAME,"Login"));
		reportStep("Login button clicked", "pass");
		return new HomePage();
	}

}
