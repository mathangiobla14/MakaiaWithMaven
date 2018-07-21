package delete.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import duplicate.pages.FindDupLeadsPage;
import lib.selenium.PreAndPost;

public class MyLeadsPage extends PreAndPost{


	public MyLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Find Leads")
	WebElement eleClickFind;


	@FindBy( xpath = "//a[text()='Find Leads']")
	WebElement eleFindDeletedLead;



	public FindLeadsPage clickFindLead() {
		click(eleClickFind);
		return new FindLeadsPage(driver, test);
	}
	
	public FindLeadsPage clickcapturedLead() {
		click(eleFindDeletedLead);
		return new FindLeadsPage(driver, test);
	}









}
