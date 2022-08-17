package Finalassignment2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class script extends baseclass {
	@Test(dataProvider="readData")
	public void sales(String fname,String lname, String mail) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Contacts");
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Mr.']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		WebElement id = driver.findElement(By.xpath("//input[@name='Email']"));
		Actions builder = new Actions(driver);
                builder.scrollToElement(id);
		id.sendKeys(mail);
		String exemail = id.getAttribute("value");
		driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']")).click();
		driver.findElement(By.xpath("//span[text()='New Account']")).click();
		WebElement acname = driver.findElement(By.xpath("//input[@class=' input']"));
		acname.click();
		acname.sendKeys("Credits");
		driver.findElement(By.xpath("//button[@title='Save']")).click();	
		driver.findElement(By.xpath("(//button[text()='Save'])")).click();
		String acemail = driver.findElement(By.xpath("//a[@class='emailuiFormattedEmail']")).getText();
                System.out.println(acemail);
		Assert.assertEquals(acemail, exemail);
        
		
}
    @DataProvider
	public String[][] readData() throws IOException {
		return ReadExcel.testData();
				
	}


}
