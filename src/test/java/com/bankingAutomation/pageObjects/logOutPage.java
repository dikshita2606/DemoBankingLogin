package com.bankingAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPage {
	WebDriver ldriver;
	
	public logOutPage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="(//a[normalize-space()='Log out'])")
	WebElement btnlogout;
	

	public void logout() {
		btnlogout.click();
	}
}
