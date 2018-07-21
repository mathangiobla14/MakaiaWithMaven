package duplicate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class ViewLead extends PreAndPost{


	public ViewLead(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Duplicate Lead")
	WebElement eleDupLead;
	
	@FindBy(id = "viewLead_firstName_sp")
	WebElement getDupName;


	public DuplicateLeadsPage clickDupLead() {
		click(eleDupLead);
		return new DuplicateLeadsPage(driver,test);
	}
	
	public ViewLead matchTitle() {
		getText(getDupName);
		return this;
	}

	

}

