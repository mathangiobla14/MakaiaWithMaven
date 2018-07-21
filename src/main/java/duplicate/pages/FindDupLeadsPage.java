package duplicate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class FindDupLeadsPage extends PreAndPost{


	public FindDupLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//span[text()='Email']")
	WebElement eleEmail;

	@FindBy(name = "emailAddress")
	WebElement typeEmail;

	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement eleClickEmail;
	
	@FindBy(xpath = "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")
	WebElement eleClickID;




	public FindDupLeadsPage findEmail() {

		click(eleEmail);
		return this;
	}

	public FindDupLeadsPage enterEmail(String email) {

		type(typeEmail, email);
		return this;
	}

	public FindDupLeadsPage findid() {
		click(eleClickEmail);
		return this;	
	
	}
	public ViewLead clickLeadId() {
		click(eleClickID);
		return new ViewLead(driver, test);
	}
}
