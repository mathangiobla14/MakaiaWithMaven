package steps;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadSteps {

	ChromeDriver driver;

	/* @Given("Launch Leaftaps")
	public void launchleafTaps() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}


	@And("enter the Username as (.*) and Password as (.*)")
	public void loginLeafTaps(String userName, String passWord) {

		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(passWord);
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("click the crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}*/
	

	/*@When("Click Leads button")
	public void leads() {
		driver.findElementByLinkText("Leads");
	}
	
	@And("click CreateLead button")
	public void createLead() {
		driver.findElementByLinkText("Create Lead").click();

	}

	@When("Enter the company as (.*),Firstname as (.*) and Lastname as (.*)")
	public void mandDet(String company,String fName,String lName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

	}
	
	@When("Enter the name of the company as (.*),Firstname as (.*)")
	public void mandDetNegative(String company,String fName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);


	}


	@And("click on Create")
	public void create() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("verify if the lead is created succesfully")
	public void verifylead() {
		System.out.println("Lead is created succesfully");	
	}

	

*/
}
