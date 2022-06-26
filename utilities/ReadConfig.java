package com.netbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig()    {

		
		File src= new File("E:\\EclipseWorkspaceNew\\liveproject\\configuration\\config.properties");
		
		{
			
				FileInputStream fis;
				
					try {
						fis = new FileInputStream(src);
					
				
					pro = new Properties();
							
								pro.load(fis);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					
			
		}
		         }
	

		
	
		
	public String getApplicationUrl() {
		String url=pro.getProperty("baseUrl");
		return url;
					
	}
	
	public String getUserNmae() {
		String uname=pro.getProperty("userName");
		return uname;
					
	}
	public String getPassword() {
		String pwd=pro.getProperty("password");
		return pwd;
					
	}

	
}
