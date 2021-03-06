package week5day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class MergeLead extends PreAndPostGen{

	@Test(dataProvider= "Beta")
	public void merge(String FromLead, String ToLead) throws InterruptedException {

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
		type(eleFromLeadId, FromLead);

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
		type(eleToLeadId, ToLead);

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
		String MergeError = getText(error);
		verifyExactText(error, MergeError);



		//closeActiveBrowser();

	}

	@DataProvider(name="Beta")
	public String[][] dataprov()
	{
		String[][] data = new String[2][2];
		data[0][0] = "t";
		data[0][1] = "e";

		data[1][0] = "s";
		data[1][1] = "t";
		return data;

	}
}