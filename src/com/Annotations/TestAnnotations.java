package com.Annotations;

import org.testng.annotations.Test;


public class TestAnnotations
{
	@Test
	public void Login() {
		System.out.println("Test1 Executed");
	}
	@Test	
	public void AccountEnquiry() {
		System.out.println("Test2 Executed");
	}
	@Test	
	public void FundTransfer() {
		System.out.println("Test3 Executed");
	}
	
}
