package selepgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookspgm {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//driver.findElement(By.id("q")).sendKeys("books");
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		
		//driver.findElement(By.name("btnk")).click();
		
		
	}

}
