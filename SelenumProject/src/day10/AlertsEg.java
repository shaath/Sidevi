package day10;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("fhalhf");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		String msg=alt.getText();
		System.out.println(msg);
		
		alt.accept();
//		alt.dismiss();
		
//		alt.sendKeys("yes");
	}

}
