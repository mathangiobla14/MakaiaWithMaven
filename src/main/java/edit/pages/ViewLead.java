package edit.pages;

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


	@FindBy(id = "sectionHeaderTitle_leads")
	WebElement elegetTitle;


	@FindBy(xpath = "//a[@class='subMenuButtonDangerous']/preceding::a[1]")
	WebElement eleEdit;

	@FindBy(id = "viewLead_companyName_sp")
	WebElement eleViewLead;

	public ViewLead verifyTitle() {
		verifyExactTitle("elegetTitle");
		return this;
	}
	public EditLeadPage clickEditLead() {
		click(eleEdit);
		return new EditLeadPage(driver, test);

	}
	
	public ViewLead viewLead() {
		String changedCompany = getText(eleViewLead);
		return this;
		
	}
	
}
