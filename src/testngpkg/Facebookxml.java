package testngpkg;




import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Facebookxml {


	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{

		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Parameters({"Email","password"})
	@Test
	public void test1(String Email,String password) 
	{
		driver.findElement(By.name("Email")).sendKeys(Email);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	}	
	
}
