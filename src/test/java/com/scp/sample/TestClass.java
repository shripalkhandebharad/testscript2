package com.scp.sample;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.scp.utitilities.AppUtility;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		File f=new File("");
		FileInputStream fin = new FileInputStream(f);
		Properties p=new Properties();
		p.load(fin);
		String un= (String) p.get("uname");
		PracticeForm practicePage = AppUtility.initilizaBrowser("Chrome");
		practicePage.enterFirstName(un);
		practicePage.enterLastName("Chame");
		practicePage.selectGender("Male");
		practicePage.selectExperience("3");
		practicePage.enterDate("18 th May");
		practicePage.selectProfession("Automation Tester");
		AppUtility.scrollPage("Down");
		practicePage.selectAutomationTools("Selenium Webdriver");
		practicePage.selectCommands("Australia");
		practicePage.selectCountry("Navigation Commands","Wait Commands");
		
	}
	
}
