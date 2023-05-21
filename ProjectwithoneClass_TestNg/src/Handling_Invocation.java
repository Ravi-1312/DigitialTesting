import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Handling_Invocation {

	@Test(invocationCount = 3)
	
	public void doLogin()
	{
		System.out.println("Login Passed");
	}
	
}
