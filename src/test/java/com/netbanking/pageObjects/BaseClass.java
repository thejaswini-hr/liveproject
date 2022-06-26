package com.netbanking.pageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.netbanking.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readconfig= new ReadConfig();
	public String baseUrl=readconfig.getApplicationUrl();
	public String userName=readconfig.getUserNmae();
	public String password=readconfig.getPassword();
	
	public WebDriver driver;
	public static Logger Logger;
	
	@Parameters("browser")
	@BeforeClass
	public void SetUp(String br) {
		Logger =Logger.getLogger("ebanking");
	     PropertyConfigurator.configure("log4j.properties");
	    
	if(br.equals("ME")) {
  WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		}
		else if
		(br.equals("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
		}else if
		(br.equals("chrome")){
			WebDriverManager.chromedriver().reset();
			driver= new ChromeDriver();
		}else if(br.equals("IE")){
			WebDriverManager.iedriver();
			driver= new InternetExplorerDriver();
		}
		driver.get(baseUrl);
		

      
      }
	@AfterClass
	public void TearDown() {
		driver.close();
		
		
	}
	
	public void captureScreen(WebDriver driver, String LoginTest) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("E:\\EclipseWorkspaceNew\\liveproject\\screenshot\\"+ LoginTest + ".png");
		FileUtils.copyFile(source, target);
		System.out.println(target);
		System.out.println("screenshot.png");
	}
	
}
