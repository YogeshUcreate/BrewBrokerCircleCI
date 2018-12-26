package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.BuyerSignInPage;

import Helper.BrowserFactory;

public class VerifyLoginBuyer {
	
WebDriver driver;
	
	@Test
	public void buyerSignin() throws Exception
	{
		
		//Start the browser.
		driver=BrowserFactory.startBrowser("chrome", "http://brewbroker-react.herokuapp.com");
		
		//Created Page Object using Page Factory.
		BuyerSignInPage signin=PageFactory.initElements(driver, BuyerSignInPage.class);
		
		//signup.clickonProfileinfo();
		
		signin.clickonLoginhomepage();	
		
		//Enter email address
		signin.enterEmail("yogesh@ucreate.co.in");
		
		Thread.sleep(5000);
		
		//Enter Password
		signin.enterPassword("Yogesh@123");
		
		//click on login button
		signin.clickLoginButton();
	}

}
