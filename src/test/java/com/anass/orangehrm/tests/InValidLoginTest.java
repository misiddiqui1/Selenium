package com.anass.orangehrm.tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import com.anass.orangehrm.pages.LoginPage;
import com.companyname.testframework.helper.TestBase;

public class InValidLoginTest extends TestBase {

	@Test
	public void InValidLogin() throws InterruptedException
	{		
		LoginPage obj=new LoginPage(driver);
		obj.setUsername("gvvhg");
		obj.setPassword("kjhkj");
		obj.clickSignIn();
		assertTrue(obj.getErrormessage().contains("Invalid credentials"), "It seems like Invalid credential");
	}
}
