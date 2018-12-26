package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyerSignInPage {
	
WebDriver driver;
	
	public BuyerSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS,using=".topright > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)")
	WebElement clicklogin;
	
	public void clickonLoginhomepage()
	{
		clicklogin.click();
	}
	
	@FindBy(how=How.NAME,using="loginemail")
	WebElement email;
	
	public void enterEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	@FindBy(how=How.NAME,using="loginpassword")
	WebElement pwd;
	
	public void enterPassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	@FindBy(how=How.CSS,using="input.btn")
	WebElement login;
	
	public void clickLoginButton()
	{
		login.click();
	}

}
