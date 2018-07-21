package week6day1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.reader.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;
import tests.pages.MyHomePage;

public class EditLead extends PreAndPost {

	@BeforeTest
	public void setValue()
	{
		testCaseName = "EditLead";
		testDesc = "TestCase to Edit existing Lead";
		nodeName = "Lead";
		author = "mathangi";
		category = "smoke";
		excelFileName = "EditLead";
	}

	
	@Test(dataProvider= "UAT")
	public void edit(String FName, String ChangeCompany) throws InterruptedException
	{

		new edit.pages.MyHomePage(driver, test).clickLeads().
		clickFindLead().enterFname(FName).sleep().
		clickLeadId().verifyTitle().clickEditLead().
		editCompany().ChangeCompany(ChangeCompany).
		submitChanges().viewLead();
		
		/*WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
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

		Thread.sleep(1000);
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
*/
		/*verifySelected(eleChangedComp);
		if (!ChangedName.equals(CName)) {
			System.out.println("The company is changed");
		}
		else
			System.out.println("The company is not changed");*/
	}

	/*@Override
	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		super.closeActiveBrowser();*/


/*
	@DataProvider(name="UAT")
	public String[][] dataprov() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] read = excel.readexcel("EditLead");
		return read;
	}
*/

}








