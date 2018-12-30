package com.anass.orangehrm.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
    private static Logger logobj=Logger.getLogger(LoginPage.class);
	public WebDriver localdriver;
	
	@FindBy(id="txtUsername") 
	private WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id="spanMessage")
	private WebElement spanErrorMsg;
	
	public LoginPage(WebDriver driver)
	{
		this.localdriver=driver;
		PageFactory.initElements(localdriver, this);
		logobj.info("Loginpage Constructor is invoked");
	}
	
	public void setUsername(String username)
	{
		txtUsername.clear();
		txtUsername.sendKeys(username);
		logobj.info("Username is set as "+username);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		logobj.info("Password is set as "+pwd);
	}
	
	public void clickSignIn()
	{
		btnLogin.click();
		logobj.info("Clicked Sign In button");
	}
	
	public String getErrormessage()
	{
		logobj.info("Login page error message : "+spanErrorMsg.getText());
		return spanErrorMsg.getText();
	}
}
