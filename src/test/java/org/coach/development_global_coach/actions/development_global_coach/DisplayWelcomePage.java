package org.coach.development_global_coach.actions.development_global_coach;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisplayWelcomePage {
	WebDriver driver;
	WebDriverWait wait;
    By select_a_site=By.cssSelector(".sod_label");
	String clearcache = System.getProperty("clearCache","US");
    
	public DisplayWelcomePage(WebDriver driver) {
					this.driver = driver;
					wait = new WebDriverWait(driver, 30);
				
	}

	public void ClickOnSelectASite(){
		  	wait.until(ExpectedConditions.visibilityOfElementLocated(select_a_site)).click();
	}
	
	public void ClickOnabc(){
		if(clearcache.equalsIgnoreCase("US"))
		{
			
		}
		else if(clearcache.equalsIgnoreCase("UK"))
	{
		
	}
	}
	
}
