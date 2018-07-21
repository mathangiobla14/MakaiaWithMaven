package week5day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPostGen {

	@Test(invocationCount=2)
	public void delete() throws InterruptedException
	{

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
		click(eleLeads);

		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		WebElement elePhone = locateElement("XPath", "//span[text()='Phone']");
		click(elePhone);



		WebElement elePhNo=locateElement("XPath", "//input[@name = 'phoneNumber']");
		type(elePhNo, "1");

		WebElement eleFindPh = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindPh);


		WebElement LeadId = locateElement("XPath", "(//a[@class = 'linktext'])[4]");
		getText(LeadId);
		click(LeadId);

		WebElement eleDelete = locateElement("XPath", "//a[text()='Delete']");
		click(eleDelete);


		WebElement eleFindLead1 = locateElement("XPath", "//a[text()='Find Leads']");
		click(eleFindLead1);

		WebElement eleCapturedId = locateElement("XPath", "//input[@name='id']");
		//type(eleCapturedId, getText(LeadId));
		type(eleCapturedId, "11347");

		WebElement eleFindCapturedId = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindCapturedId);

		WebElement EleError = locateElement("XPath", "//div[text()='No records to display']");
		getText(EleError);

		verifyExactText(EleError, "No records to display");

		//closeActiveBrowser();













	}



}

