package com.bankingAutomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");
		//File src = new File(System.getProperty("user.dir")+"/Configuration//Config.properties");
		
		try {
			FileInputStream fin = new FileInputStream(src);
			pro = new Properties();
			pro.load(fin);
		}
		catch(Exception e){
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String userName = pro.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
}
