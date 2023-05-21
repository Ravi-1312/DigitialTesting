import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Handling_Parametrization {

	@Test(dataProvider = "getData")//fetching the details using getdata method in the below
	public void login(String Username, String Password)
	{
		System.out.println("Username: "+Username+"  "+"Password: "+Password);
	}
	@DataProvider
	public String[][] getData()
	{
		String data[][] = new String [3][2];
		data[0][0]="Ravi";
		data[0][1]="Rishaav";
		data[1][0]="New";
		data[1][1]="Time";
		data[2][0]="Good";
		data[2][1]="Morning";
		return data;
	}
	@Test(dataProvider = "RegistrationTestData")
	public void Registration(String Username, String Password, String Empid, String Salary, String Department)
	{
		System.out.println("Username: "+Username+"  "+"Password: "+Password+" "+"EmpID: "+Empid+" "+"Salary: "+Salary+" "+"Department: "+Department);
	}
	@DataProvider
	public String[][] RegistrationTestData()
			{
				String td [][]=new String [4][5];
				td[0][0]="Send";
				td[0][1]="Received";
				td[0][2]="Failed";
				td[0][3]="Pass";
				td[0][4]="Email sent or fail to";
				
				td[1][0]="1";
				td[1][1]="2";
				td[1][2]="3";
				td[1][3]="4";
				td[1][4]="Rishaav";
			
				td[2][0]="10-Ravi";
				td[2][1]="20-Rishaav";
				td[2][2]="30-Rahul";
				td[2][3]="40-Rajesh";
				td[2][4]="50-John";
					
				td[3][0]="40";
				td[3][1]="50";
				td[3][2]="30";
				td[3][3]="40";
				td[3][4]="50";
				return td;
			}
}

