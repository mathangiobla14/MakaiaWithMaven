package duplicate.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import duplicate.pages.FindDupLeadsPage;
import lib.selenium.PreAndPost;

public class MyDupLeadsPage extends PreAndPost{


	public MyDupLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(linkText = "Find Leads")
	WebElement eleClickFind;

	public FindDupLeadsPage clickFindLead() {
		click(eleClickFind);
		return new FindDupLeadsPage(driver, test);


	}
}
