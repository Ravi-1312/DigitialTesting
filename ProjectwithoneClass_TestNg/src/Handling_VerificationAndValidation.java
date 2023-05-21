import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Handling_VerificationAndValidation {

	@Test
	public void login()
	{
		int exception =20;
		int actual =10;
		//Assert.assertEquals(exception, actual);//hard assert
		SoftAssert a = new SoftAssert();//SoftAssert is a class within the TestNg
		a.assertEquals(exception, actual);
		System.out.println("Both values getting matched and Passed");
		a.assertAll();
		
	}
}

