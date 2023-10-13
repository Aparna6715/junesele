package selepgms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitlepgm {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver	();
		
	driver.get("https://www.google.com");	
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
