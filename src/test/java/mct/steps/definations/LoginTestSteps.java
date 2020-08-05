package mct.steps.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mct.webpages.HomePage;

import java.util.Scanner;

import org.junit.Assert;


public class LoginTestSteps {

	
	WebDriver driver;
	
	
	@Given("I browse to Mct webstie")
	public void i_am_mct_webstie() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	}

	@When("I Click the login link")
	public void i_use_the_login_link() {
		driver.findElement(By.xpath("//*[@id=\"dLabellogin\"]")).click();
	}
	
	
	@Then("I Expect a complete Login Form")
	public void i_expect_a_complete_login_form() {
		
		HomePage home = new HomePage(driver);
		
		Assert.assertEquals("User Name Filed Is Not Found", true, home.isFiledExist("username"));
		Assert.assertEquals("Password Filed Is Not Found", true, home.isFiledExist("password"));
		Assert.assertEquals("Login Button Is Not Found", true, home.isFiledExist("loginButton"));
		Assert.assertEquals("Sign Button Is Not Found", true, home.isFiledExist("signupbutton"));
		Assert.assertEquals("Forgot Password Link Is Not Found", true, home.isFiledExist("forgotpasswordlink"));

	
		
		Scanner scan = new Scanner(System.in);
		
		
	}
	
	
}
