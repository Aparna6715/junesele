package selepgms;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradiobu {

	ChromeDriver driver;
	@Before

	public void setUp()
	{	
		driver=new ChromeDriver();
	}
	@Test
	public void test1() throws IOException
	{
		driver.get(" https://register.rediff.com/register/register.php?FormName=user_details");
Boolean radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1] ")).isSelected();
	
if(radiobutton)
{
	System.out.println("male is selected");
}
	
else
{
	System.out.println("not selected");
}

}



	
	}	
	

