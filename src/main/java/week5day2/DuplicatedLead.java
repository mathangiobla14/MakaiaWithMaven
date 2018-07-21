package week5day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;

public class DuplicatedLead extends PreAndPostGen {

	@Test(dataProvider= "SIT")
	public void Duplicate(String email) {

		

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleLeads =  locateElement("XPath", "//a[text()='Leads']");
		click(eleLeads);

		WebElement eleFindLead = locateElement("link", "Find Leads");
		click(eleFindLead);

		WebElement eleEmail = locateElement("XPath", "//span[text()='Email']");
		click(eleEmail);

		WebElement eleEid = locateElement("Name", "emailAddress");
		type(eleEid, email);

		WebElement eleFindEmail = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindEmail);

		WebElement FirstName = locateElement("XPath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a");
		String Name = getText(FirstName);
		click(FirstName);


		WebElement eleDupLead = locateElement("link", "Duplicate Lead");
		click(eleDupLead);

		boolean verifyExactTitle = verifyExactTitle("Duplicate Lead");
		System.out.println(verifyExactTitle);


		WebElement EleCreate = locateElement("Name", "submitButton");
		click(EleCreate);

		WebElement EleDupName = locateElement("id", "viewLead_firstName_sp");
		getText(EleDupName);

		verifyExactText(EleDupName, Name);

		//closeActiveBrowser();

	}
	
	@DataProvider(name="SIT")
	public String[][] dataprov()
	{
		String[][] data = new String[2][1];
		data[0][0] = "test";
	
		data[1][0] = ".com";
		return data;

}
}