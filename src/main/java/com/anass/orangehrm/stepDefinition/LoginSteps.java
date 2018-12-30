package com.anass.orangehrm.stepDefinition;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import com.anass.orangehrm.pages.LoginPage;
import com.companyname.testframework.helper.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	public static WebDriver driver=null;

	@Given("^User navigate to Login page$")
	public void navigateLoginPage()
	{
		TestBase obj=new TestBase();
		obj.setupDriver("chrome");
		driver=obj.getDriver();
	}
	
	@When("^User enters (\\d+) as login$")
	public void enterLogin(String uname)
	{
		LoginPage obj=new LoginPage(driver);
		obj.setUsername(uname);
	}
	
	@And("^User enters (.*) as password$")
	public void enterPassword(String pwd)
	{
		LoginPage obj=new LoginPage(driver);
		obj.setPassword(pwd);
	}
	
	@When("^User click Login button$")
	public void clickLogin()
	{
		LoginPage obj=new LoginPage(driver);
		obj.clickSignIn();
	}

	@Then("Error message will be displayed")
	public void errorMessage()
	{
		LoginPage obj=new LoginPage(driver);
		assertTrue(obj.getErrormessage().contains("Invalid credentials"), "It seems like Invalid credential");	
	}
	
	/*@Then("^Home page will be displayed$")
	public void navigateHomePage() throws InterruptedException
	{
		HomePage obj1=new HomePage(driver);
		assertTrue(obj1.getWelcomemessage().contains("Welcome"), "It seems like Invalid credential");
	}	*/
}
