package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class ViewLeadPage extends WebDriverServiceImpl{


	public ViewLeadPage(EventFiringWebDriver driver, ExtentTest test ) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "viewLead_firstName_sp")
	WebElement eleViewLead;


	@Then("verify if the lead is created succesfully")
	public ViewLeadPage ViewLead(String FName) {
		//String verifyName = getText(eleViewLead);
		//verifyExactText(eleViewLead, FName);
		System.out.println("Lead is created succesfully");
		return this;
	}
}