package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(cat).build().perform();
		Thread.sleep(3000);
		
		WebElement music=driver.findElement(By.xpath("//span[@aria-label='Amazon Prime Music']"));
		act.moveToElement(music).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Amazon Prime Music Apps']")).click();
		

	}

}
