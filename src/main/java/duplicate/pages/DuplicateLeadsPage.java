package duplicate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class DuplicateLeadsPage extends PreAndPost{


	public DuplicateLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "sectionHeaderTitle_leads")
    WebElement Title;

	@FindBy(name = "submitButton")
	WebElement eleClickCreate;

	
	public DuplicateLeadsPage getTitleName() {
		String DuplicateTitle = getText(Title);
		verifyExactTitle(DuplicateTitle);
		return this;
	}
	
	
	public ViewLead clickCreateLead() {
		click(eleClickCreate);
		return new ViewLead(driver, test);


	}
}
