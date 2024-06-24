package com.bankingAutomation.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.bankingAutomation.utilities.ReadConfig;

public class BaseCLass {

	/*
	 * public String baseURL = "https://demo.guru99.com/V1/index.php"; 
	 * public String userNaame = "mngr136913";
	 * public String password = "Omn@12";
	 */

	ReadConfig readData = new ReadConfig();
	
	public String baseURL = readData.getApplicationURL(); 
	public String userNaame = readData.getUserName();
	public String password = readData.getPassword();
	
	public static WebDriver driver;
	//public static ChromeOptions co;
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {		
		logger = Logger.getLogger(BaseCLass.class);
		PropertyConfigurator.configure("log4j2.properties");
		
		if(br.equals("Chrome") || br.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		
		driver.get(baseURL); //removed from login test and entered here 
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		logger.info("Test Case ended and Chrome is closed");
	}
	
}
