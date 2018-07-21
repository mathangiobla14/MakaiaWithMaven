package week5day1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends PreAndPostGen{

	@Test(groups= {"smoke"})
	public void createLead() {
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCompany = locateElement("id", "createLeadForm_companyName");
		type(eleCompany,"TestLeaff");

		WebElement eleFirName = locateElement("id", "createLeadForm_firstName");
		type(eleFirName,"Testing");
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,"Leaff");
		
		WebElement eleSource =locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource, "Conference");
		
		WebElement eleCreate = locateElement("class", "smallSubmit");
		click(eleCreate);
		
		//closeActiveBrowser();
		
		
		
		
	}
	
	
}




