package selepgms;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
		
		@Test
		public void test1()
		{
			driver.get("https://www.google.com");
	
	List <WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total no of links="+li.size());
	
	
	
	
	
}
}