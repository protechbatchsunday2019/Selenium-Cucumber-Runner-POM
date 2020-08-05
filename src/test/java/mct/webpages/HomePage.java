package mct.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	String userNameFiled = "//*[@id='username']";
	String passwordFiled = "//*[@id='password']";
	String loginButton = "//*[@id='jqLogin']";
	String signUpButton = "//*[@id='jqSignup']";
	String forgotPasswordLink = "//a[contains(text(),'Forgot Password')]";

	
	// Constructor ( A default method of all class will auto call when a object get created ) 
	// Constructor can't return anything 
	// Construr name and calss should same 
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// Page Specific Functions 
	public boolean isFiledExist(String fieldName) {
		
		if(fieldName.equals("username")) {
			return isElementDisplayed(userNameFiled);
		} else if(fieldName.equals("password")) {
			return isElementDisplayed(passwordFiled);
		} else if(fieldName.equals("loginButton")) {
			return isElementDisplayed(loginButton);
		} else if(fieldName.equals("signupbutton")) {
			return isElementDisplayed(signUpButton);
		} else if(fieldName.equals("forgotpasswordlink")) {
			return isElementDisplayed(forgotPasswordLink);
		}

		return false;
	}
	
	
	
	// Generic Method 
	public boolean isElementDisplayed(String elementXpath) {
		try {
			return driver.findElement(By.xpath(elementXpath)).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
}
