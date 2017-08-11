package org.coach.development_global_coach.actions.development_global_coach;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	WebDriver driver = null;
	String browser = System.getProperty("browser","chrome");

	
	String exePath;

	public WebDriver LaunchApplication() {
	
		System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}

		
		else if (browser.equalsIgnoreCase("chrome")) {
			
			exePath = "C:" + File.separator + "Users" + File.separator + "somilbansal" + File.separator + "Desktop"
					+ File.separator + "Driver" + File.separator + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("IE")) {
		
			exePath = "C:" + File.separator + "Users" + File.separator + "somilbansal" + File.separator + "Desktop"
					+ File.separator + "Driver" + File.separator + "IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
		
			driver = new InternetExplorerDriver();
		}

		
		else if (browser.equalsIgnoreCase("Edge")) {
	
			exePath = "C:" + File.separator + "Program Files (x86)" + File.separator + "Microsoft Web Driver" +  File.separator + "MicrosoftWebDriver.exe";
			System.setProperty("webdriver.edge.driver", exePath);
			
			driver = new EdgeDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	//	driver.get("https://storefront:coach123@dwstaging2.coach.com/");
		driver.get("https://development-global-coach.demandware.net/on/demandware.store/Sites-Site/default/ViewApplication-DisplayWelcomePage");
		return driver;
	}
}

