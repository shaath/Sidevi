package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=3c19a604378237877512520a0a9661c8");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.name("country"));
		
		Select s=new Select(drop);
		List<WebElement> items=s.getOptions();
		
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++)
		{
//			s.selectByIndex(i);
//			String name=items.get(i).getText();
//			System.out.println(name);
			
//			String value=items.get(i).getAttribute("value");
//			s.selectByValue(value);
			
			String name=items.get(i).getText();
			s.selectByVisibleText(name);
			
			
		}
		
	}

}
