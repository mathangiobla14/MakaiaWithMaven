package lib.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PreAndPostGen extends WebDriverServiceImpl {
 
@Parameters({"url","userid","password"})
  @BeforeMethod
  public void beforeMethod(String url, String user, String Pwd) {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();

		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, user);
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, Pwd);
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
  }
  

  @AfterMethod
  public void afterMethod() {
	  closeActiveBrowser();
	  System.out.println("AfterMethod is executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass is executed");}

  @AfterClass
  public void afterClass() {
	  System.out.println("Afterclass is executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("AfterMethod is executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("beforeTest is executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite is executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite is executed");
  }

}
