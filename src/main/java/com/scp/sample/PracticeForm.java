package com.scp.sample;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/h1")
	WebElement practiceFormHeading;

	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/legend/strong")
	WebElement personalInfoLabel;
	
	@FindBy(partialLinkText="Partial Link Test")
	WebElement partialLinkText;
	
	@FindBy(linkText="Link Test")
	WebElement linkText;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/strong[1]")
	WebElement firstNameLbl;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/input[1]")
	WebElement firstNameInput;

	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/strong[2]")
	WebElement lastNameLbl;
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[1]/input[2]")
	WebElement lastNameInput;
	
	@FindBy(id="content")
	WebElement practiceFormInfo;

	@FindBy(name="sex")
	List<WebElement> gender;
	
	@FindBy(name="exp")
	List<WebElement> yearsOfExpRadioBtns;
	
	@FindBy(name="profession")
	List<WebElement> profession;
	
	
	@FindBy(id="datepicker")
	WebElement date;
	
	
	
	/**
	 * Sangeeta
	 */
	
	@FindBy(xpath="html/body/div[1]/div[5]/div[2]/div/div/form/fieldset/div[12]/p/strong/label")
	WebElement continentsLabel;
	
	@FindBy(id="continents")
	WebElement continentsComboBox;
	
	@FindBy(xpath="html/body/div[1]/div[5]/div[2]/div/div/form/fieldset/div[13]/p/strong/label")
	WebElement seleniumCmdLabel;
	
	@FindBy(id="selenium_commands")
	WebElement seleniumCmdComboBox;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	@FindBy(className="bcd")
	WebElement text1Span;
	
	@FindBy(id="NextedText")
	WebElement text2Label;

	
	/**
	 * Vasudha
	 */
	
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[5]/strong/label")
	WebElement ProfilePictureAttach;
	
	@FindBy(id="photo")
	WebElement browseProfilePicture;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[7]/strong")
	WebElement DowloadFramework;

	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[8]/a")
	WebElement LinkHybridFramework;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[9]/a")
	WebElement LinkDownloadTestFile;
	
	@FindBy(xpath="/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[11]/strong/label")
	WebElement LabelAutomationTool;
	
	@FindBy(name="tool")
	List<WebElement> tools; 

	
	public void enterFirstName(String fname){
		firstNameInput.clear();
		firstNameInput.sendKeys((fname));
	}
	
	public void enterLastName(String lname){
		lastNameInput.clear();
		lastNameInput.sendKeys(lname);
	}
	
	public void selectGender(String clickOnGender){
		for (WebElement item : gender) {
			if(item.getAttribute("value").equals(clickOnGender)){
				item.click();
				break;
			}
		}
		
	}
	
	
	public void selectExperience(String exp){
		for (WebElement item : yearsOfExpRadioBtns) {
			if(item.getAttribute("value").equals(exp)){
				item.click();
				break;
			}
		}
		
	}
	
	public void enterDate(String dateval){
		date.clear();
		date.sendKeys(dateval);
	}
	
	
	public void selectProfession(String prof){
		for (WebElement item : profession) {
			if(item.getAttribute("value").equals(prof)){
				item.click();
				break;
			}
		}
		
	}
	
	
	public void selectAutomationTools(String tool){
		for (WebElement item : tools) {
			if(item.getAttribute("value").equals(tool)){
				item.click();
				break;
			}
		}
		
	}
	
	
	public void selectCommands(String countryName){
		Select select = new Select(continentsComboBox);
		//select.selectByIndex(2);
		select.selectByVisibleText(countryName);
	}
	
	
	//Var args
	public void selectCountry(String ...countryName){
		Select select = new Select(seleniumCmdComboBox);
		for (String country : countryName) {
			select.selectByVisibleText(country);
		}
		
		
	}
	

	public void validatePracticeForm(){
		
		
	}

}