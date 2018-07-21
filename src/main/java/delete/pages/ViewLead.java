package delete.pages;

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

	@FindBy(xpath = "//a[text()='Delete']")
	WebElement eleDelete;






	public MyLeadsPage clickDelLead() {
		click(eleDelete);
		return new MyLeadsPage(driver,test);
	}


}


