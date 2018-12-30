package com.anass.orangehrm.stepDefinition;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import com.anass.orangehrm.pages.HomePage;
import com.companyname.testframework.helper.TestBase;
import cucumber.api.java.en.Then;

public class HomepageSteps {
	
	public static WebDriver driver=TestBase.getDriver();
	
	@Then("^Home page will be displayed$")
	public void navigateHomePage() throws InterruptedException
	{
		HomePage obj1=new HomePage(driver);
		assertTrue(obj1.getWelcomemessage().contains("Welcome"), "It seems like Invalid credential");
	}	
}