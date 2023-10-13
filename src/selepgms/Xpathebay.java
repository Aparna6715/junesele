package selepgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathebay {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
		
		@Test
		public void test1()
		{
			driver.get("https://www.ebay.com");
			driver.findElement(By.xpath("//input[@placeholder=\"Search for anything\"]")).sendKeys("Mobiles");
			driver.findElement(By.xpath(" //*[@class='gh-cart-icon']")).click();
	driver.findElement(By.xpath(" //*[@class='actions multi-actions']/a[2]")).click();
	driver.findElement(By.xpath(" //*[@data-currenttabindex='2']/a[1]")).click();
		}	
	
}
