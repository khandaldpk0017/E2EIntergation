package com.web.automation.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.web.automation.base.DriverInstance;

import cucumber.api.java.en.*;

public class StepDefenition {
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		DriverInstance.startDriverInstance();
		DriverInstance.getDriverInstance().findElement(By.xpath("//input[@id='tab2']/parent::li")).click();
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		DriverInstance.getDriverInstance().findElement(By.name("_txtUserName")).sendKeys("testing");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
		DriverInstance.getDriverInstance().findElement(By.name("_txtPassword")).sendKeys("testing");
	}

	@When("^User click on Signin button$")
	public void user_click_on_Signin_button() throws Throwable {
		DriverInstance.getDriverInstance().findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^User should be loggedin$")
	public void user_should_be_loggedin() throws Throwable {
		
	}

	@When("^User Clicks on Logout button$")
	public void user_Clicks_on_Logout_button() throws Throwable {
	 
	}

	@Then("^User should be Loggedout$")
	public void user_should_be_Loggedout() throws Throwable {
	   
	}

	@Given("^User is on Registration page$")
	public void user_is_on_Registration_page() throws Throwable {
		
	}

	@When("^User enter username$")
	public void user_enter_username() throws Throwable {
	   
	}

	@When("^User enters email address$")
	public void user_enters_email_address() throws Throwable {
	  
	}

	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
	   
	}

	@When("^User enters confirm password$")
	public void user_enters_confirm_password() throws Throwable {
	    
	}

	@When("^User enters date of birth$")
	public void user_enters_date_of_birth() throws Throwable {
	
	}

	@When("^User enters phone number$")
	public void user_enters_phone_number() throws Throwable {
	 
	}

	@When("^User enters address$")
	public void user_enters_address() throws Throwable {
	  
	}

	@When("^User click on Home address type$")
	public void user_click_on_Home_address_type() throws Throwable {
	
	}

	@When("^User select gender$")
	public void user_select_gender() throws Throwable {
	
	}

	@When("^User select Country$")
	public void user_select_Country() throws Throwable {
	
	}

	@When("^User select State$")
	public void user_select_State() throws Throwable {
	 
	}

	@When("^User select City$")
	public void user_select_City() throws Throwable {
	   
	}

	@When("^User enters zip code$")
	public void user_enters_zip_code() throws Throwable {
	  
	}

	@When("^User click on agree checkbox$")
	public void user_click_on_agree_checkbox() throws Throwable {
	  
	}

	@When("^User click on Signup button$")
	public void user_click_on_Signup_button() throws Throwable {

	}
	
	@Then("^User account should be created$")
	public void user_account_should_be_created() throws Throwable {
	
	}
	
}
