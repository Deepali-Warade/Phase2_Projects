package com.Annotations;

import org.testng.annotations.Test;


public class TestAnnotations3
{
	@Test(priority=0)	
	public void Login() {
		System.out.println("Test1 Executed");
	}
	@Test(priority=1)	
	public void AccountEnquiry() {
		System.out.println("Test2 Executed");
	}
	@Test(priority=2)	
	public void FundTransfer() {
		System.out.println("Test3 Executed");
	}
	
}
