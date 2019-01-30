package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverWaitEg1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/membership/free-pass/detect.html?cm_sp=Homepage-_-Slideshow-_-Free_Fridays']")));
		
		driver.findElement(By.xpath("//a[@href='/membership/free-pass/detect.html?cm_sp=Homepage-_-Slideshow-_-Free_Fridays']")).click();

	}

}
