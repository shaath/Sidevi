package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();

//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://facebook.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}

}
