package com.cg.project.beans;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	@FindBy(how=How.NAME,name="txtFN")
	private WebElement fname;
	
	@FindBy(how=How.NAME,name="txtLN")
	private WebElement lname;
	
	@FindBy(how=How.NAME,name="Email")
	private WebElement email;
	
	@FindBy(how=How.NAME,name="Phone")
	private WebElement phone;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[5]/td[2]/select")
	private WebElement peoplecount;
	
	@FindBy(how=How.NAME,name="Address")
	private WebElement address;
	
	@FindBy(how=How.NAME,name="Address2")
	private WebElement address2;
	
	@FindBy(name = "city")
	public List<WebElement> city;
	
	@FindBy(name = "state")
	public List<WebElement> state;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")
	public WebElement status;
	
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[14]/td/a")
	public WebElement next;

	public String getFname() {
		return fname.getAttribute("value");
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public String getLname() {
		return lname.getAttribute("value");
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}

	public String getEmail() {
		return email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getPhone() {
		return phone.getAttribute("value");
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}

	public String getPeoplecount() {
		return peoplecount.getAttribute("value");
	}

	public void setPeoplecount(String peoplecount) {
		this.peoplecount.sendKeys(peoplecount);
	}

	public String getAddress() {
		return address.getAttribute("value");
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public String getAddress2() {
		return address2.getAttribute("value");
	}

	public void setAddress2(String address2) {
		this.address2.sendKeys(address2);
	}

	
	public void setCity(String city) {
		 Select select = new Select(this.city.get(0));
		    select.selectByVisibleText(city);
	}
	
	public void setState(String state) {
		 Select select = new Select(this.state.get(0));
		    select.selectByVisibleText(state);
	}
	
	public void clickElement() {
		status.click();
		
	}
	

		public void clickNext() {
		 next.click();
	}

		
	
}
