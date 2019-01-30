package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutofillersEg {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("H");
		Thread.sleep(3000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++)
		{
			String city=auto.get(i).getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("Dharamshala (himachal pradesh)"))
			{
				auto.get(i).click();
				break;
			}
			
		}
		

	}

}
