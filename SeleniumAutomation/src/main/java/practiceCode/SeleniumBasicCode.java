package practiceCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumBasicCode {

   @Test
   public void run()
	//public static void main(String[] args)
	{
	
	
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\SeleniumAutomation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cardekho.com/newcars");
	}
	

}
