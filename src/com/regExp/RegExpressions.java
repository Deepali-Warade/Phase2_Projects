package com.regExp;

import org.testng.annotations.Test;

public class RegExpressions {

	 @Test(groups = { "windows.checkintest" })
	  public void testWindowsOnly() {
	  }
	 
	  @Test(groups = {"linux.checkintest"} )
	  public void testLinuxOnly() {
	  }
	 
	  @Test(groups = { "windows.functest" })
	  public void testWindowsToo() {
	  }


}