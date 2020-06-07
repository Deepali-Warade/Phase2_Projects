package com.Annotations;

import org.testng.annotations.Test;


public class TestAnnotations2
{
	@Test(priority=0)	
	public void Login() {
		System.out.println("Test1 Executed");
	}
	@Test(dependsOnMethods="Login")	
	public void AccountEnquiry() {
		System.out.println("Test2 Executed");
	}
	@Test(dependsOnMethods="Login")	
	public void FundTransfer() {
		System.out.println("Test3 Executed");
	}
	
}
