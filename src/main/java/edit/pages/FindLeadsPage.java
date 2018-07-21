package edit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class FindLeadsPage extends PreAndPost{


	public FindLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//input[@name='firstName'])[3]")
	WebElement enterFName;

	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement eleFindFName;

	@FindBy(xpath = "div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")
	WebElement eleLeadId;




	public FindLeadsPage enterFname(String FName) {
		type(enterFName, FName);
		click(eleFindFName);
		return this;
	}
	
	public FindLeadsPage sleep() throws InterruptedException {
		Thread.sleep(5000);
		return this;
	}
	public ViewLead clickLeadId() {
		click(eleLeadId);
		return new ViewLead(driver, test);
	}
}
