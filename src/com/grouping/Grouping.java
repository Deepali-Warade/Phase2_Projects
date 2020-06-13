package com.grouping;
import org.testng.annotations.Test;
public class Grouping {
    @Test(groups= {"login","chrome"})
    public void ValidLogin() {
        
    }
    @Test(groups= {"login","firefox"})
    public void InValidLogin() {
        
    }
    @Test(groups="login")
    public void EmptyPasswordLogin() {
        
    }
    @Test(groups="FT")
    public void FundTransfer() {
        
    }
    
    
}