package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetails {

	@FindBy(how=How.ID,id="txtCardholderName")
	private WebElement cardholdername;
	
	@FindBy(how=How.NAME,name="debit")
	private WebElement debit;
	
	@FindBy(how=How.NAME,name="cvv")
	private WebElement cvv;
	
	@FindBy(how=How.NAME,name="month")
	private WebElement month;
	
	@FindBy(how=How.NAME,name="year")
	private WebElement year;
	
	@FindBy(how=How.ID,id="btnPayment")
	public WebElement submit;

	public String getCardholdername() {
		return cardholdername.getAttribute("value");
	}

	public void setCardholdername(String cardholdername) {
		this.cardholdername.sendKeys(cardholdername);
	}

	public String getDebit() {
		return debit.getAttribute("value");
	}

	public void setDebit(String debit) {
		this.debit.sendKeys(debit);
	}

	public String getCvv() {
		return cvv.getAttribute("value");
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getMonth() {
		return month.getAttribute("value");
	}

	public void setMonth(String month) {
		this.month.sendKeys(month);
	}

	public String getYear() {
		return year.getAttribute("value");
	}

	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
}
