package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class MergeLead extends PreAndPostGen{

	@Test(groups= {"sanity"})
	public void main() throws InterruptedException {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
		click(eleLeads);

		WebElement eleMergeLead = locateElement("link", "Merge Leads");
		click(eleMergeLead);

		WebElement eleFromLead = locateElement("XPath", "//img[@src='/images/fieldlookup.gif']");
		click(eleFromLead);

		switchToWindow(1);

		WebElement eleFromLeadId =  locateElement("XPath", "//input[@name='firstName']");
		type(eleFromLeadId, "test");

		WebElement eleFromLeadconfirm = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFromLeadconfirm);

		Thread.sleep(2000);
		
		String text = locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		WebElement eleFromLead1 = locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleFromLead1);
        switchToWindow(0);

       
		WebElement eleToLead = locateElement("XPath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(eleToLead);

		switchToWindow(1);

		WebElement eleToLeadId =  locateElement("XPath", "//input[@name='firstName']");
		type(eleToLeadId, "super");

		WebElement eleFromLeadconfirm1 = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFromLeadconfirm1);
		Thread.sleep(2000);
		
		WebElement eleToLead1 = locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(eleToLead1);
        switchToWindow(0);

		WebElement eleMergeLeads = locateElement("XPath", "//a[text()='Merge']");
		click(eleMergeLeads);

		acceptAlert();

		WebElement eleFindFromLead = locateElement("link", "Find Leads");
		click(eleFindFromLead);
		
		WebElement eleFromLead2= locateElement("XPath", "//input[@name='id']");
		type(eleFromLead2, text);

		WebElement eleFindMergedLead = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindMergedLead);
		Thread.sleep(2000);
		
		WebElement error = locateElement("class", "x-paging-info");
		verifyExactText(error, "No records to display");


		//closeActiveBrowser();

	}

}
