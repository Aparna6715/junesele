package selepgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {
	ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
}
	
	@Test
	public void test1()
	{
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.xpath(" //*[@id='nav-cart-count-container']/span[2]")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]")).click();
		
		
	}
}
