package com.anass.orangehrm.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private static Logger log=Logger.getLogger(HomePage.class);
	public WebDriver driver;
	
	@FindBy(id="welcome") 
	private WebElement spanWelcomeMsg;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		log.info("Home page constructor is invoked");
	}
	
	public String getWelcomemessage() throws InterruptedException
	{
		log.info("Home page welcome text : "+spanWelcomeMsg.getText());
		return spanWelcomeMsg.getText();
	}
}
