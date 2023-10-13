package testngpkg;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99rcandedc {

	ChromeDriver driver;
	@BeforeTest 
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right);
		act.perform();
		
		//to  click edit
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		//to handle alert
		driver.switchTo().alert().accept();
	WebElement doubleclick	=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();
		Alert a=driver.switchTo().alert();
		
		//to print the text
	System.out.println(a.getText());
	a.accept();
	}
	
	
	
	
	
	
	
	
	
	
}
