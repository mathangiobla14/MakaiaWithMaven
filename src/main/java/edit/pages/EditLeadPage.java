package edit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class EditLeadPage extends PreAndPost {

	public EditLeadPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "updateLeadForm_companyName")
	WebElement eleCompany;

	@FindBy(name = "submitButton")
	WebElement eleUpdate;




	public EditLeadPage editCompany() {

		getText(eleCompany);
		clear(eleCompany);
		return this;
	}

	public EditLeadPage ChangeCompany(String ChangeCompany) {
		type(eleCompany, ChangeCompany);
		return this;
	}


	public ViewLead submitChanges() {
		click(eleUpdate);
		return new ViewLead(driver, test);
	}




}
