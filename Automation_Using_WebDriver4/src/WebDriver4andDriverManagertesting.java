import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver4andDriverManagertesting {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		//Driver.switchTo().newWindow(WindowType.WINDOW);// new window after executing the program
		Driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");
		WebElement user = Driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		user.sendKeys("Tester");
		WebElement pass = Driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		pass.sendKeys("test");
		WebElement login = Driver.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		//directly click button using javascript menthod
	//	((JavascriptExecutor)Driver).executeScript("arguments[0].click();", login);
		//login.click();
	//	((JavascriptExecutor)Driver).executeScript("alert('Page excuted sucessfull')");
		/*Thread.sleep(1000);
		Driver.switchTo().newWindow(WindowType.TAB);//executing the program in new windows under other tab
		Driver.get("http://www.google.com");*/
		

	}

}
