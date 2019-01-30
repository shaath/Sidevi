package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement email=driver.findElement(By.id("identifierId"));
		
		email.sendKeys("gandesharath@gmail.com");
		
//		Thread.sleep(3000);
//		email.clear();
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		
		driver.findElement(By.name("password")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
