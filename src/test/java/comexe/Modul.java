package comexe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Modul 
{
	
	private static Logger log=LogManager.getLogger(Simplelog.class.getName());
	
	@Test
	public void test() throws Throwable
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenicucumber\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	  
	    driver.get("https://www.google.com/");
	    log.debug("welcome to rest");
	    log.info("url is launched successfully");
	    log.error("$$$$$$$$$$$");
	    log.debug("welcome to Selenium");
	    
	}
    

}
