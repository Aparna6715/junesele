package selepgms;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Juinttleandps {
	
	
	ChromeDriver driver;
	@Before

	public void setUp()
	{	
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String actualtitle		=driver.getTitle();
		String Expected="Google";

		//to print pass or fail
		//compare
		if (actualtitle.equals(Expected))
		{
			System.out.println("pass");
			
		}
		
		else
		{
			System.out.println("fail");
		}
	}
		@Test
		public void test2()
		{
		String actualtitle		=driver.getTitle();
		String Expected="Google";

		//to print pass or fail
		//compare
		if (actualtitle.equals(Expected))
		{
			System.out.println("pass");
			
		}
		
		else
		{
			System.out.println("fail");
		
		
		
	}
			
		}
}
			
			
			
			
			
	
	



