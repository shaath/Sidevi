package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///F:/Sharath/Desktop/cars.html");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.xpath("html/body/select"));
		
		Select s=new Select(drop);
		
//		s.selectByIndex(3);
//		s.selectByValue("mercedes");
//		s.selectByVisibleText("Saab");
		
		List<WebElement> items=s.getOptions();
		
		System.out.println(items.size());
		for (int i = 0; i < items.size(); i++) 
		{
			s.selectByIndex(i);
			String name=items.get(i).getText();
			System.out.println(name);
		}

	}

}
