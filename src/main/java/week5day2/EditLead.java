package week5day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class EditLead extends PreAndPostGen {

	@Test(dataProvider= "UAT")
	public void edit(String FName, String ChangeCompany) throws InterruptedException
	{
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
		click(eleLeads);

		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		Thread.sleep(4000);


		WebElement eleFirName =  locateElement("XPath", "(//input[@name='firstName'])[3]");
		type(eleFirName, FName);

		WebElement eleFindleads =  locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindleads);

		Thread.sleep(4000);

		WebElement eleLeadId =  locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a");
		click(eleLeadId);


		boolean title = verifyExactTitle("View Lead");

		WebElement eleEditLead =  locateElement("XPath", "//a[@class='subMenuButtonDangerous']/preceding::a[1]");
		click(eleEditLead);

		WebElement eleClear =  locateElement("XPath", "(//input[@name='companyName'])[2]");
		String CName = getText(eleClear);
		clear(eleClear);

		WebElement eleenter = locateElement("id", "updateLeadForm_companyName");
		//Thread.sleep(4000);

		type(eleenter, ChangeCompany);

		//getText(eleClear);

		WebElement eleSubmit =  locateElement("Name", "submitButton");
		click(eleSubmit);

		WebElement eleChangedComp = locateElement("id", "viewLead_companyName_sp");
		String ChangedName = getText(eleChangedComp);

		verifySelected(eleChangedComp);
		if (!ChangedName.equals(CName)) {
			System.out.println("The company is changed");
		}
		else
			System.out.println("The company is not changed");
	}

	/*@Override
	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		super.closeActiveBrowser();*/
	


@DataProvider(name="UAT")
public String[][] dataprov()
{
	String[][] data = new String[3][2];
	data[0][0] = "A";
	data[0][1] = "Mathangi";
	

	/*data[1][0] = "B";
	data[1][1] = "Test";
	
	data[2][0] = "C";
	data[2][1] = "TestLeaf";*/
	return data;
	
	
	
	
}


}








