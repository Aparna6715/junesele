package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipletabs {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/popup.php");
		//to get current window ,store in String
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		   
		
		//to handle multiple tabs
		
	Set<String> multipleWindowHandles	=driver.getWindowHandles();
		
	for(String handle:multipleWindowHandles)//first index details to store in handle
	{
		if(!handle.equalsIgnoreCase(parentWindow)) {//(not parentwindow switch to handle(multipleWindowHandles))
			driver.switchTo().window(handle);
			driver.close();
		}
		driver.switchTo().window(parentWindow);
	}
		
		
	}
	
	
	
	
}
