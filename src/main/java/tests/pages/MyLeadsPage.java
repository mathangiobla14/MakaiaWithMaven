package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadsPage extends WebDriverServiceImpl{

	
	public MyLeadsPage(EventFiringWebDriver driver, ExtentTest test ) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText = "Create Lead")
	WebElement eleCreate;
	
	@And("click CreateLead button")
	public CreateLeadPage clickCreateLead() {
		click(eleCreate);
		return new CreateLeadPage(driver, test);
	}
}
