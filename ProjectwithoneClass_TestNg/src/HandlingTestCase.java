import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingTestCase {
	//@Test(timeOut =10)//time out condition until the time loop will run
//	@Test
	@Test(dependsOnMethods = "Registration")
	public void Login()
	{
		//while (true) {
			System.out.println("Login Successful");
		//}
	}
	
	@Test
	public void Registration()
	{
		int exception = 10;
		int actual = 20;
		Assert.assertEquals(exception, actual);
		System.out.println("Registration successful");
		
	}

}
