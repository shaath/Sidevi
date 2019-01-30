package day12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://imgur.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='https://imgur.com/upload']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Browse']")).click();
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FileUpload.exe");
		
//		driver.findElement(By.id("paste-url-input")).sendKeys("C:\\Users\\Dell\\Pictures\\jira.png");
	}

}
