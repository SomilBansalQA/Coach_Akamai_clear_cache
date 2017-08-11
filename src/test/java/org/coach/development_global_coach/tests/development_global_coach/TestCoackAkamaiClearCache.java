package org.coach.development_global_coach.tests.development_global_coach;

import org.coach.development_global_coach.actions.development_global_coach.Driver;
import org.coach.development_global_coach.actions.development_global_coach.LoginForm;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCoackAkamaiClearCache {
	Driver driverobj;
	LoginForm loginFormObj;
	WebDriver driver;
	
	@BeforeTest
	void setup() {
		driverobj = new Driver();
	
	}
	@Test(priority = 0)
	void testLaunchApplication() {
		driver = driverobj.LaunchApplication();
		loginFormObj= new LoginForm(driver); 
		Reporter.log("Successfully Launched Coach Website");
	}

	
	@Test(priority = 0)
	void testUserLogin() {
		loginFormObj.setUserName();
		loginFormObj.setPassword();
		loginFormObj.Login();
		Reporter.log("Successfully Launched Coach Website");
	}
	
}
