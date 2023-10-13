package selepgms;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdetails {
	
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
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+links.size());
		
		//to get link details
		for (WebElement ele:links)      //(links=list) store one by one in ele
		{
			String linkdetails=ele.getAttribute("href");
			
			
			//to get link text/name:-get text
			String linktext=ele.getText();
			System.out.println(linkdetails+"--------"+linktext);
		}
	
	
	
	
	
	
	
	
	
			}

}

