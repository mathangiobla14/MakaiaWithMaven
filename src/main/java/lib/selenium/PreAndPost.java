package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.reader.ReadExcel;
import lib.selenium.WebDriverServiceImpl;

public class PreAndPost extends WebDriverServiceImpl{

	public String testCaseName, testDesc, nodeName, author, category, excelFileName;
	
	@Parameters({"url","userid","password"})
	@BeforeMethod
	public void beforeMethod(String url, String user, String Pwd) {
		//for reports
		startTestModule(nodeName, author,category);
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, user);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, Pwd);
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		click(locateElement("link", "CRM/SFA"));
	}

	@AfterMethod
	public void afterMethod() {
		closeActiveBrowser();
	}

	@BeforeClass
	public void beforeClass() {
		startTestCase(testCaseName, testDesc);		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}


	@AfterSuite
	public void afterSuite() {
		endResult();
	}

	
	@DataProvider(name="UAT",indices=1)
	public Object[][] getdata() throws IOException {
		
		ReadExcel excel = new ReadExcel();
		Object[][] read = excel.readexcel(excelFileName);
		return read;
	}
	
	
	
	
	
	
	
}
