package week3day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Activity1 extends WebDriverServiceImpl {

	@Test
	public void main() {
		

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleAccount = locateElement("link", "Accounts");
		click(eleAccount);
		
		WebElement eleCreateAccount = locateElement("link", "Create Account");
		click(eleCreateAccount);
		
		WebElement eleAccName = locateElement("class", "inputBox");
		type(eleAccName, "currentname");
		
		WebElement eleCurrency = locateElement("XPath", "//select[@id='currencyUomId']");
		selectDropDownUsingVisibleText(eleCurrency, "RUR - Russian Rouble");
		
		WebElement eleIndustry = locateElement("Name", "industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "Distribution");
		
		WebElement eleSource = locateElement("id", "dataSourceId");
		selectDropDownUsingValue(eleSource, "LEAD_COLDCALL");
		
		WebElement eleMarketing = locateElement("id", "marketingCampaignId");
		selectDropDownUsingValue(eleMarketing, "CATRQ_AUTOMOBILE");
		
		WebElement elePhone = locateElement("XPath", "//input[@id='primaryPhoneNumber']");
		type(elePhone, "91-4643213");
		
		WebElement eleMail = locateElement("XPath", "//input[@id='primaryEmail']");
		type(eleMail, "xxx@yyy.com");
		
		WebElement eleCity = locateElement("id", "generalCity");
		type(eleCity, "Mangalore");
		
		WebElement eleCountry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingValue(eleCountry, "IND");

		WebElement eleState = locateElement("XPath", "//select[@id='generalStateProvinceGeoId']");
		selectDropDownUsingVisibleText(eleState, "KARNATAKA");
		
		
		WebElement eleCreateAcc = locateElement("class", "smallSubmit");
		click(eleCreateAcc);
		
		String eleCaptureId = locateElement("XPath", "(//span[@class='tabletext'])[3]").getText();
		String replaceid = eleCaptureId.replaceAll("[a-zA-Z ()]", "");
		System.out.println(replaceid);
		String replacename = eleCaptureId.replaceAll("[0-9 ()]", "");
		System.out.println(replacename);
		

		WebElement eleFindAccount = locateElement("link", "Find Accounts");
		click(eleFindAccount);
		
		
		WebElement eleAcctId = locateElement("XPath", "//input[@name='id']");
		type(eleAcctId, replaceid);
		
		WebElement eleAcctName = locateElement("XPath", "(//input[@name='accountName'])[2]");
		type(eleAcctName, replacename);
		
		WebElement eleFindAcc = locateElement("XPath", "//button[text()='Find Accounts']");
		click(eleFindAcc);
		
		String eleVerifyId = locateElement("XPath", "(//a[@class='linktext'])[4]").getText();
		System.out.println(eleVerifyId);
		if(eleVerifyId.equals(replaceid)) {
			System.out.println("The id resulted is same as that of the id created");
		}
		else
			System.out.println("The id resulted is different from the id created");
		
		
		String eleVerifyName = locateElement("link", "currentname").getText();
		if(eleVerifyName.equals(replacename)) {
			System.out.println("The name resulted is same as that of the name created");
		}
		else
			System.out.println("The name resulted is different from the name created");
		
			
			
		
		
		//closeActiveBrowser();
		
		

		
		
		
		
	}

}
