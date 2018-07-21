package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPostGen {

	@Test(dataProvider= "sanity")
	public void delete(int phone) throws InterruptedException
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
		type(elePhNo, ""+phone);

		WebElement eleFindPh = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindPh);


		WebElement LeadId = locateElement("XPath", "(//a[@class = 'linktext'])[4]");
		String ID = getText(LeadId);
		click(LeadId);

		WebElement eleDelete = locateElement("XPath", "//a[text()='Delete']");
		click(eleDelete);


		WebElement eleFindLead1 = locateElement("XPath", "//a[text()='Find Leads']");
		click(eleFindLead1);

		WebElement eleCapturedId = locateElement("XPath", "//input[@name='id']");
		//type(eleCapturedId, getText(LeadId));
		type(eleCapturedId, ID);

		WebElement eleFindCapturedId = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindCapturedId);

		WebElement EleError = locateElement("class", "x-paging-info");
		String Error = getText(EleError);

		verifyExactText(EleError, Error);

		//closeActiveBrowser();

	}

		
		@DataProvider(name="sanity")
		public int[][] dataprov()
		{
			int[][] data = new int[4][1];
			data[0][0] = 4;
			data[1][0] = 9;
			data[2][0] = 7;
			data[3][0] = 8;
			return data;








	}



}

