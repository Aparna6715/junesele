package testngpkg;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTask {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
		
		@Test
		public void test1()
		{
			driver.get("https://www.amazon.in");
			String CurrentHandle=driver.getWindowHandle();
			//mobile search
		WebElement m	=driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']"));	
			m.sendKeys("Mobiles");
			
	m.sendKeys(Keys.ENTER);
	
	//click on search button
	
	
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	
	
	
			   
	
	//to handle multiple tabs
	
Set<String> Handles	=driver.getWindowHandles();
	
for(String actual:Handles)//first index details to store in handle
{
	if(!actual.equalsIgnoreCase(CurrentHandle)) {
		driver.switchTo().window(actual);
		driver.close();
	}
	driver.switchTo().window(CurrentHandle);
	
		}

}
}
