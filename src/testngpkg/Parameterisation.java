package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {

	
	@Parameters("a")
@Test
public void test(String V)
{
	System.out.println (V);
}
	
	
	
	
	
	
	
	
	
}
