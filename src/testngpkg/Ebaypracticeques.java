package testngpkg;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaypracticeques {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.ebay.com");
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("total no of links="+links.size());

	
	Boolean search=driver.findElement(By.xpath("//input[@id='gh-btn']")).isEnabled();
	if (search)
	{
		System.out.println("button is enabled");
	
	}
	else
	{
		System.out.println("button is disabled");
	}
	Boolean logo=driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).isDisplayed();
	
	if(logo)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");

}
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
	String str=ele.getText();
	System.out.println("text is="+str);
}
}