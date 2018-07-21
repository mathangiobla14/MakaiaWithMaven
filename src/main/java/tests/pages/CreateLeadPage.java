package tests.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class CreateLeadPage extends WebDriverServiceImpl{


	public CreateLeadPage(EventFiringWebDriver driver, ExtentTest test ) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "createLeadForm_companyName")
	WebElement eleCompName;

	@FindBy(id = "createLeadForm_firstName")
	WebElement eleFirstName;

	@FindBy(id = "createLeadForm_lastName")
	WebElement eleLastName;

	@FindBy(name = "submitButton")
	WebElement eleClickCreate;


	@When("Enter the company as (.*),Firstname as (.*) and Lastname as (.*)")
	public CreateLeadPage CreateLead(String compName, String fName, String lName) {
		type(eleCompName, compName );
		type(eleFirstName, fName);
		type(eleLastName, lName);
		return this;
	}
	
	@When("Enter the name of the company as (.*),Firstname as (.*)")
	public CreateLeadPage CreateLead(String compName, String fName) {
		type(eleCompName, compName );
		type(eleFirstName, fName);
		return this;
	}
	
	

	@And("click on Create")
	public ViewLeadPage ClickCreateLead() {
		click(eleClickCreate);
		return new ViewLeadPage(driver, test);
	}
}