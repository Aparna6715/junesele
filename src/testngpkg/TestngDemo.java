package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
@BeforeTest
public void setUp()	
	
{
	System.out.println("browser open");
}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	
	@Test
	public void test1()
	
	{
		System.out.println("test1");
	}
	@AfterMethod
	public void methodclose()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void tearDown()
	
	{
		System.out.println("browser close");
	}
	
}
