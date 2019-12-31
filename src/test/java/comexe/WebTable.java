package comexe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {

	
	@Test
	public void dynamic()
	{
		WebDriver d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Selenicucumber\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/web-table-element.php");	
	}
}
