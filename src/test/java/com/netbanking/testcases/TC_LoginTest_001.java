package com.netbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.BaseClass;
import com.netbanking.pageObjects.LoginClass;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void LoginTest() throws IOException {
		Logger.info("url is opened");
		
		LoginClass lp= new LoginClass(driver);
		lp.setUserName(userName);
		Logger.info("entered username");
		

		lp.setPassword(password);
		Logger.info("entered password");

		lp.clickLogin();
		if(driver.getTitle().equals("Guru99 Bank Manager ")) {
			
			Assert.assertTrue(true);
			Logger.info("test pass");

			
			}
		else
			{
			captureScreen(driver,"LoginTest");
		Assert.assertFalse(false);
		Logger.info("test fail");
           System.out.println("screenshot taken");
				}
	
	}


}
