import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseOne extends Precondition_Postcondition {

	//@Test
	
	//@Test(priority=3)
	@Test(groups="Regression")
	public void doLoginTest() {
		System.out.println("Login Successful");
		
	}
	@Test(groups="Regression")
	//@Test(priority=2)
	public void Contactus() {
		System.out.println("Contact details update");
	}
	//@Test(enabled=false)
	//@Test(priority=1)
	//@Test
	@Test(groups="Regression")
	public void ForgetPassword() {
		System.out.println("Password update");
	}
	//@Test
	@Test(groups="Regression")
	public void ecommerceTest() {
		System.out.println("Ecommerce test successful1");
	}
	@BeforeClass
	public void OpenURL() {
		System.out.println("URL opened successful");
		
	}
	@AfterClass
	public void CloseURL() {
		System.out.println("URL Closed successful");
	}
	//@Test
	@Test(groups="Sainty")
	public void UpdateAuthentication() {
		System.out.println("Authentication Successful");
	}
	//@Test
	@Test(groups="Sainty")
	public void editPersonalDetails() {
		System.out.println("Personal Details Updated");
}
}