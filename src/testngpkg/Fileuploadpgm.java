package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadpgm {

	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();

	}
	@Test
	public void test()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement choose=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		choose.sendKeys("C:\\Users\\User\\Downloads");
		
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
	
	
}
