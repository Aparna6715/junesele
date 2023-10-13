package testngpkg;

import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPaste {
	ChromeDriver driver;
	@BeforeTest

	public void setUp()
	{	
		driver=new ChromeDriver();
	}
	@Test
	public void test1() 
	{
	driver.get(" https://register.rediff.com/register/register.php?FormName=user_details");
	WebElement fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	
	WebElement rediffid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	//value in fullname
	fullname.sendKeys("aparna");
	Actions act=new Actions(driver);
	//select aparna
	//ctrl a
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);

	//to copy
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	
	//to paste
	act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	//to work perform method should be called
	act.perform();
	
	
	
}
}