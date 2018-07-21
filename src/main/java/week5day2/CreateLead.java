package week5day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPostGen;
import lib.selenium.WebDriverServiceImpl;

public class CreateLead extends PreAndPostGen{

	@Test(dataProvider= "UAT")
	public void createLead(String compName, String FName, String LName, String Source, int PhNo) {
		

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		
		WebElement eleCompany = locateElement("id", "createLeadForm_companyName");
		type(eleCompany,compName);

		WebElement eleFirName = locateElement("id", "createLeadForm_firstName");
		type(eleFirName,FName);
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,LName);
		
		WebElement eleSource =locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource, Source);
		
		WebElement elePhNo =locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhNo,""+PhNo);
		
		
		WebElement eleCreate = locateElement("class", "smallSubmit");
		click(eleCreate);
		
		
	}
		@DataProvider(name="UAT")
		public Object[][] getdata() {
			
			Object[][] data = new Object[1][5];
			data[0][0]="TestLeaff";
			data[0][1]="Test";
			data[0][2]="Leaf";
			data[0][3]="Conference";
			data[0][4]=656463;
			
			
			
			/*data[1][0]="Temenos";
			data[1][1]="Teme";
			data[1][2]="Nos";
			data[1][3]="Employee";
			data[0][4]=656463;*/
			return data;
		}
		
		//closeActiveBrowser();
		
		
		
		
	}
	
	





