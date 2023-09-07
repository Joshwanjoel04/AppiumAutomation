package stepDefinations;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefination {
	WebDriver driver;
	@Given("^user is present in login page$")
	public void user_is_present_in_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\SeleniumAutomation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cardekho.com/newcars");
	    
	}

	@When("^Tittle of the page is axismf$")
	public void tittle_of_the_page_is_axismf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String tittle= driver.getTitle();
	    Assert.assertEquals("abcd","tittle");
	    
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
