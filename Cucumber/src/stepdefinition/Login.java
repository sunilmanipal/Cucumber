package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("^Login application present$")
	public void login_application_present()  {
	    //i should be on the home page //https://opensource-demo.orangehrmlive.com/index.php/auth/login
		//this is to provide the chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome 87\\chromedriver.exe");
		//this line to start a new instance of chrome browser
		driver = new ChromeDriver();
		//i should be in the login page 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    
	}

	@When("^Enter valid credentials$")
	public void enter_valid_credentials() throws InterruptedException  {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	   Thread.sleep(3000);
	   
	}

	@Then("^Login successful$")
	public void login_successful() throws InterruptedException  {
		String expected =driver.findElement(By.id("welcome")).getText();
		String  Actual = "Welcome Harshith";
		Assert.assertEquals(expected, Actual);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.close();
		
	   
	    
	}

}
