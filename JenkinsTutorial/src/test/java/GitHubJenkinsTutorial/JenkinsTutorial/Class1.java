package GitHubJenkinsTutorial.JenkinsTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void Method1()
	{
		System.out.println("This is commit and push Test Method1");
	}
	
	@BeforeTest
	public void Method2()
	{
		System.out.println("This is Before Test Method2");
	}
	
	@AfterTest
	public void Method3()
	{
		System.out.println("This is After Test MEthod3");
	}
}
