package com.bankingAutomation.testCases;


import com.bankingAutomation.pageObjects.logInPage;
import com.bankingAutomation.pageObjects.logOutPage;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_LoginTest_001 extends BaseCLass{

	@Test
	public void LoginTest() {
		driver.manage().window().maximize();
	
		logger.info("URL is opened successfully");
		
		logInPage lp = new logInPage(driver); 
		logOutPage lp1 = new logOutPage(driver); 
		
		lp.setUserName(userNaame);
		logger.info("UserName is set successfully");
		lp.setPassword(password);
		logger.info("Password is set successfully");
		lp.clickSubmit();
		logger.info("Submit is clicked successfully");
		
		/*System.out.println("Alert after login btn : "+driver.switchTo().alert().getText());*/
		//driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Test Case Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}
		
		lp1.logout();
		logger.info("Logout btn clicked");
	}
}
