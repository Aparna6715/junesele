package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffradioandbutton {
	ChromeDriver driver;
	@BeforeTest
	
	public void SetUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void login ()
	{
driver.get(" https://register.rediff.com/register/register.php?FormName=user_details");
}
	
@Test

	public void genderfield()
	
	{
	Boolean radiobutton	=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
	
if(radiobutton)
{
	System.out.println("male is selected");
}
	
else
{
	System.out.println("not selected");
}
	}
//	@Test
	//public void button() 
		//
//
//
//{
			//driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		//}
	
	
}

