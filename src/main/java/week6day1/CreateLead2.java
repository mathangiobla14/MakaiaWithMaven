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

public class CreateLead2 extends PreAndPost{
	
	@BeforeTest
	public void setValue()
	{
		testCaseName = "CreateLead";
		testDesc = "TestCase to Create new Lead";
		nodeName = "Lead";
		author = "mathangi";
		category = "sanity";
		excelFileName = "CreateLead";
	}

	@Test(dataProvider= "UAT")
	public void createLead(String compName, String FName, String LName, String Email, String PhNo) {
		

		new MyHomePage(driver, test).clickLead().clickCreateLead().CreateLead(compName, FName, LName).ClickCreateLead().ViewLead(FName);
		
		/*
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCompany = locateElement("id", "createLeadForm_companyName");
		type(eleCompany,compName);

		WebElement eleFirName = locateElement("id", "createLeadForm_firstName");
		type(eleFirName,FName);
		getText(eleFirName);
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,LName);
		
		WebElement eleSource =locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource, Source);
		
		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail,Email);

		WebElement elePhNo =locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhNo,PhNo);
		
		
		WebElement eleCreate = locateElement("class", "smallSubmit");
		click(eleCreate);
		
		WebElement eleViewFName = locateElement("id", "viewLead_firstName_sp");
		verifyExactText(eleViewFName, returnedtext);
		
*/		
	}
		
		
		//closeActiveBrowser();
		
		
		
		
	}
	
	





