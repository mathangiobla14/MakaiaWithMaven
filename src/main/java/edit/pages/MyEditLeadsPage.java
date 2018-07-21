package edit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import duplicate.pages.FindDupLeadsPage;
import lib.selenium.PreAndPost;

public class MyEditLeadsPage extends PreAndPost{


	public MyEditLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Find Leads")
	WebElement eleClickFind;

	public FindLeadsPage clickFindLead() {
		click(eleClickFind);
		return new FindLeadsPage(driver, test);


	}
}
