package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		String gmail=driver.getWindowHandle();
//		System.out.println(gmail);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		while (it.hasNext())
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			Thread.sleep(3000);
			String title=driver.getTitle();
			System.out.println(title);
			
//			try 
//			{
//				driver.findElement(By.linkText("Terms of Service")).click();
//				Thread.sleep(3000);
//				System.out.println(driver.getTitle());
//				break;
//			}
//			catch (Exception e) 
//			{
//				System.out.println("The expected element not avaialble in this page");
//			}
			
			if (title.contains("Privacy")) 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
			
			
		}
		
//		driver.findElement(By.linkText("Terms of Service")).click();

	}

}
