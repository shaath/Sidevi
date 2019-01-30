package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster
{
	public static WebDriver driver;
	public static String expval,actval;
	public static FileInputStream fi;
	public static Properties pr;
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Qedge123!@#";
	public static String f="Vihan",l="D",Eid="VD7854";
	public static String ename=f+" "+l,uname=f+l+"7896548123",pswd=f+l+"1233@4451",cpswd=f+l+"1233@4451";
	@BeforeSuite
	public void Org_Launch() throws IOException
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		fi=new FileInputStream("F:\\Sridevi_Vennela\\Workspace\\SelenumProject\\src\\config\\or.properties");
		pr=new Properties();
		pr.load(fi);
			
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("value");
		
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	
	@BeforeTest
	public void Org_login()
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	
	@AfterTest
	public void Org_Logout() throws InterruptedException
	{
		expval="LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	
	@AfterSuite
	public void Org_Close()
	{
		driver.close();
	}

}