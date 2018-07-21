package week6day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import delete.pages.MyHomePage;
import lib.selenium.PreAndPost;
import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost {

	@BeforeTest
	public void setValue()
	{
		testCaseName = "DeleteLead";
		testDesc = "TestCase to Delete existing Lead";
		nodeName = "Lead";
		author = "mathangi";
		category = "Beta";
		excelFileName = "DeleteLead";
	}
	@Test(dataProvider= "UAT")
	public void delete(String Phno) throws InterruptedException
	{

		new MyHomePage(driver, test).clickLeads().
		clickFindLead().findPhone().enterPhone(Phno).
		findPhoneno().captureLead().clickLeadId().
		clickDelLead().clickcapturedLead().
		getCapturedLead().findresultLead().
		compareresultLead();

		/*WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
		click(eleLeads);

		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		WebElement elePhone = locateElement("XPath", "//span[text()='Phone']");
		click(elePhone);

		WebElement elePhNo=locateElement("XPath", "//input[@name = 'phoneNumber']");
		type(elePhNo, Phno);

		WebElement eleFindPh = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindPh);

		Thread.sleep(2000);		

		WebElement LeadId = locateElement("XPath", "(//a[@class = 'linktext'])[4]");
		getText(LeadId);
		String id = getText(LeadId);
		System.out.println("The captured id is " +id);
		click(LeadId);

		WebElement eleDelete = locateElement("XPath", "//a[text()='Delete']");
		click(eleDelete);


		WebElement eleFindLead1 = locateElement("XPath", "//a[text()='Find Leads']");
		click(eleFindLead1);

		WebElement eleCapturedId = locateElement("XPath", "//input[@name='id']");
		//type(eleCapturedId, getText(LeadId));
		type(eleCapturedId, returnedtext);

		WebElement eleFindCapturedId = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindCapturedId);

		WebElement EleError = locateElement("XPath", "//div[text()='No records to display']");
		String errorMsg = getText(EleError);

		verifyExactText(EleError, errorMsg);

		//closeActiveBrowser();

*/

	}



}

