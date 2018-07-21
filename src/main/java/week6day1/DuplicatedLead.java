package week6day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import duplicate.pages.MyHomePage;
import lib.selenium.PreAndPost;
import lib.selenium.PreAndPostGen;

public class DuplicatedLead extends PreAndPost {
	
	@BeforeTest
	public void setValue()
	{
		testCaseName = "DuplicateLead";
		testDesc = "TestCase to Duplicate existing Lead";
		nodeName = "Lead";
		author = "mathangi";
		category = "regression";
		excelFileName = "DuplicateLead";
	}

	@Test(dataProvider= "UAT")
	public void Duplicate(String email) {

       new MyHomePage(driver,test).clickLeads().
       clickFindLead().findEmail().enterEmail(email).
       findid().clickLeadId().clickDupLead().
       getTitleName().clickCreateLead().matchTitle();
/*
		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		WebElement eleEmail = locateElement("XPath", "//span[text()='Email']");
		click(eleEmail);

		WebElement eleEid = locateElement("Name", "emailAddress");
		type(eleEid, email);

		WebElement eleFindEmail = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindEmail);

		WebElement FirstName = locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a");
		String Name = getText(FirstName);
		click(FirstName);


		WebElement eleDupLead = locateElement("link", "Duplicate Lead");
		click(eleDupLead);

		boolean verifyExactTitle = verifyExactTitle("Duplicate Lead");
		System.out.println(verifyExactTitle);


		WebElement EleCreate = locateElement("Name", "submitButton");
		click(EleCreate);

		WebElement EleDupName = locateElement("id", "viewLead_firstName_sp");
		getText(EleDupName);

		verifyExactText(EleDupName, Name);

*/		//closeActiveBrowser();

	}

	private Object MyHomePage(EventFiringWebDriver driver, ExtentTest test) {
		// TODO Auto-generated method stub
		return null;
	}



}
