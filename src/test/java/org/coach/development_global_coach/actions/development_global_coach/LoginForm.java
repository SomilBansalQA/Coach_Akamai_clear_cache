package org.coach.development_global_coach.actions.development_global_coach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm {
	By username=By.cssSelector(".login_input:nth-of-type(1)");
	By password=By.cssSelector(".login_input:nth-of-type(2)");
	By login_button=By.cssSelector(".button");
	WebDriver driver;
	WebDriverWait wait;

	public LoginForm(WebDriver driver) {
			this.driver = driver;
			wait = new WebDriverWait(driver, 30);
			// TODO Auto-generated constructor stub
	}
 
	public void setUserName()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("ssingh");
	}
	
	public void setPassword(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("C0ach!@#");
	}
	
	public void Login(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_button)).click();
	}
}
