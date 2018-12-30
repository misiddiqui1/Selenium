package com.anass.orangehrm.tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.anass.orangehrm.pages.HomePage;
import com.anass.orangehrm.pages.LoginPage;
import com.companyname.testframework.helper.TestBase;


public class ValidLoginTest extends TestBase {

	@Test
	public void ValidLogin() throws InterruptedException
	{	
		LoginPage obj=new LoginPage(driver);
		obj.setUsername("Admin");
		obj.setPassword("admin123");
		obj.clickSignIn();
		HomePage obj1=new HomePage(driver);
		assertTrue(obj1.getWelcomemessage().contains("Welcome"), "It seems like Invalid credential");
	}
	
	@Test
	public void emptyUsername() throws InterruptedException
	{	
		LoginPage obj=new LoginPage(driver);
		obj.setUsername("");
		obj.clickSignIn();
		assertTrue(obj.getErrormessage().equals("Username cannot be empty"), "It seems accepting empty username");
	}
	
	@Test
	public void emptyPassword() throws InterruptedException
	{	
		LoginPage obj=new LoginPage(driver);
		obj.setUsername("Admin");
		obj.setPassword("");
		obj.clickSignIn();
		assertTrue(obj.getErrormessage().equals("Password cannot be empty"), "It seems accepting empty Password");
	}
}
