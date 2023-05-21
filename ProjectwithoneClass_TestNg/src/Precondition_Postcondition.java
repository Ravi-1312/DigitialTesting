import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class Precondition_Postcondition {
	@BeforeSuite
	public void openDB() {
		System.out.println("DB open is successful");
		
	}
	@AfterSuite
	public void closeDB() {
		System.out.println("DB close is Successful");
	}
}
