package delete.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.PreAndPost;

public class FindLeadsPage extends PreAndPost{


	public String phoneId;
	public FindLeadsPage(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//span[text()='Phone']")
	WebElement elePhone;

	@FindBy(xpath = "//input[@name = 'phoneNumber']")
	WebElement typePhone;

	@FindBy(xpath = "//button[text()='Find Leads']")
	WebElement eleClickPhone;
	
	@FindBy(xpath = "(//a[@class = 'linktext'])[4]")
	WebElement eleClickID;
	
	@FindBy( xpath = "//input[@name='id']")
	WebElement eleCapturedId;
	
	
	@FindBy( xpath = "//button[text()='Find Leads']")
	WebElement findCapturedId;

	
	@FindBy( xpath = "//div[text()='No records to display']")
	WebElement compareresult;




	public FindLeadsPage findPhone() {

		click(elePhone);
		return this;
	}

	public FindLeadsPage enterPhone(String PhNo) {

		type(typePhone, PhNo);
		return this;
	}

	public FindLeadsPage findPhoneno() {
		click(eleClickPhone);
		return this;	
	
	}
	
	public FindLeadsPage captureLead() {
		phoneId = getText(eleClickID);
		System.out.println("The id of the entered phno is " +phoneId);
		return this;
	}
	
	public ViewLead clickLeadId() throws InterruptedException {
		Thread.sleep(5000);
		click(eleClickID);
		return new ViewLead(driver, test);
	}
	
	
	public FindLeadsPage getCapturedLead() throws InterruptedException {
		Thread.sleep(5000);
		type(eleCapturedId, returnedtext);
		return this;
		
	}
	
	public FindLeadsPage findresultLead() {
		click(findCapturedId);
		return this;
		
	}
	
	public FindLeadsPage compareresultLead() {
		String result = getText(compareresult);
		verifyExactText(compareresult,result );
		return this;
		
	}
	
	
	
}
