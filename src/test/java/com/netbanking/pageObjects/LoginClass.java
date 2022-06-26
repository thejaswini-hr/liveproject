package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {

	WebDriver Idriver; // need to create webdriver Object
	
	//Idriver as local driver and rdiver as remote driver
	public LoginClass(WebDriver rdriver){ //then loginPage(classname)constructor,WEBDRIVER driver parameters
	
	//need to initiate driver
	
	Idriver=rdriver;
	// specify the PageFactory class
	PageFactory.initElements(rdriver, this); 
	//this is the constructor we created
	
	//need to identify the elements which are present in LoginPage
	
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public void setUserName(String name) {
		txtUserName.sendKeys(name);
	
	}
	public void setPassword(String pswd) {
		txtPassword.sendKeys(pswd);
	
	}
	
	public void clickLogin() {
		btnLogin.click();	
	}
	
	
}
