package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.project.beans.PaymentDetails;
import com.cg.project.beans.Registration;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {

	private WebDriver driver;
	Registration registration;
	PaymentDetails paymentdetails;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");		
	 }
	@Given("^User is on Registration page$")
	public void user_is_on_Registration_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("D:\\Practice\\BDDusingCucumber\\Today\\htmlPages\\ConferenceRegistartion.html");
	    registration = PageFactory.initElements(driver, Registration.class);
	 
	}

	@When("^User enter invalid input$")
	public void user_enter_invalid_input() throws Throwable {
	    
		registration.setFname("");
		registration.setLname("Reddy");
		registration.setEmail("greeshma@gmail.com");
		registration.setPhone("7732049627");
		registration.setPeoplecount("1");
		registration.setAddress("ERC 303");
		registration.setAddress2("CApgemini");
		registration.setCity("Pune");
		registration.setState("Maharashtra");
		registration.status.click();
		registration.next.click();
		
		Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("Personal details are validated."))
		{
			Thread.sleep(1000);
			jsAlert.accept();
			driver.navigate().to("D:\\Practice\\BDDusingCucumber\\Today\\htmlPages\\PaymentDetails.html");
			paymentdetails = PageFactory.initElements(driver, PaymentDetails.class);
		}
		else
		{
			
		}
	}

	@Then("^Invalid input message must be displayed$")
	public void invalid_input_message_must_be_displayed() throws Throwable {
		String actualErrorMessage="Please fill the First Name";
		String expectedErrorMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		
	}

	@When("^User enters correct details$")
	public void user_enters_correct_details() throws Throwable {
	    
		registration.setFname("Greeshma");
		registration.setLname("Reddy");
		registration.setEmail("greeshma@gmail.com");
		registration.setPhone("7732049627");
		registration.setPeoplecount("4");
		registration.setAddress("ERC 303");
		registration.setAddress2("CApgemini");
		registration.setCity("Pune");
		registration.setState("Maharashtra");
		registration.status.click();
		registration.next.click();
			
		Alert jsAlert = driver.switchTo().alert();
		if(jsAlert.getText().equals("Personal details are validated."))
		{
			Thread.sleep(1000);
			jsAlert.accept();
			driver.navigate().to("D:\\Practice\\BDDusingCucumber\\Today\\htmlPages\\PaymentDetails.html");
			paymentdetails = PageFactory.initElements(driver, PaymentDetails.class);
		}
		
		paymentdetails.setCardholdername("GREESHMA REDDY");
		paymentdetails.setDebit("6071638198");
		paymentdetails.setCvv("343");
		paymentdetails.setMonth("12");
		paymentdetails.setYear("2024");
		paymentdetails.submit.click();
	}

	@Then("^personal details are validated message should be displayed$")
	public void personal_details_are_validated_message_should_be_displayed() throws Throwable {
	   
		String actualErrorMessage="Conference Room Booking successfully done!!!";
		String expectedErrorMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		
	}


}
