package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

	@Test(dataProvider="getLogindata")
	public void LoginTestCase(String username,String password) 
	{
		System.out.println("Login test case -" +username + "-"+password);
	}
	
	@DataProvider
	public Object[][] getLogindata()
	{
		Object[][] logindata= new Object[2][2];
		logindata[0][0]="user1";
		logindata[0][1]="pass1";
		logindata[1][0]="user2";
		logindata[1][1]="pass2";
		return logindata;
		
	}
}
