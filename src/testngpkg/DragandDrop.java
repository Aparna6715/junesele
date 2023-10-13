package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {

	
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		WebElement From=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		 WebElement To=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
	
		 WebElement a=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		 
		 WebElement c=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement d=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement f=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		
		
		 
		  
		 
	
	act.dragAndDrop(From, To).build().perform();
	act.dragAndDrop(a,b).build().perform();
	act.dragAndDrop(c,d).build().perform();
	act.dragAndDrop(e,f).build().perform();
	
	
	
}
}