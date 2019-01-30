package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest_POM 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.Org_Login(lp.u, lp.p);
		
		Sleeper.sleepTightInSeconds(3);
		
		AdminPage ap=PageFactory.initElements(driver, AdminPage.class);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
		
	}

}
