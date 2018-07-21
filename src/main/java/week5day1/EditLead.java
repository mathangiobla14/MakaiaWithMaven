package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class EditLead extends PreAndPostGen {

	@Test(groups= {"smoke"})
	public void edit() throws InterruptedException
	{
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

		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		Thread.sleep(4000);


		WebElement eleFirName =  locateElement("XPath", "(//input[@name='firstName'])[3]");
		type(eleFirName, "M");

		WebElement eleFindleads =  locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindleads);

		Thread.sleep(4000);

		WebElement eleLeadId =  locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		click(eleLeadId);


		boolean title = verifyExactTitle("View Lead");

		WebElement eleEditLead =  locateElement("XPath", "//a[@class='subMenuButtonDangerous']/preceding::a[1]");
		click(eleEditLead);

		WebElement eleClear =  locateElement("XPath", "(//input[@name='companyName'])[2]");
		clear(eleClear);

		WebElement eleenter = locateElement("id", "updateLeadForm_companyName");
		//Thread.sleep(4000);

		type(eleenter, "Babu");

		getText(eleClear);

		WebElement eleSubmit =  locateElement("Name", "submitButton");
		click(eleSubmit);

		WebElement eleChangedComp = locateElement("id", "viewLead_companyName_sp");
		getText(eleChangedComp);

		verifySelected(eleChangedComp);
		if (eleChangedComp.equals("LeafTest")) {
			System.out.println("The company is changed");
		}
		else
			System.out.println("The company is not changed");
	}

	/*@Override
	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		super.closeActiveBrowser();*/
}











