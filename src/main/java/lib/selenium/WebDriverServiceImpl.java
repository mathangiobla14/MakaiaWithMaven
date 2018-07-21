package lib.selenium;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public String returnedtext=null;
	
	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "XPath" : return driver.findElement(By.xpath(locValue));

			case "Name" : return  driver.findElement(By.name(locValue));

			case "PartialLink"  :  return driver.findElement(By.partialLinkText(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("The element with locator" +locator+ " and the value is " +locValue+ " not found");
			throw new RuntimeException("Element not found");
		}
		catch (Exception e) {
			System.err.println("The element was not found in the dom");
			throw new RuntimeException();
		}
		return null;
	}


	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportSteps("The Data "+data+" is Entered Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The Data "+data+" is not Entered Successfully", "fail");
		}	

	}

	public void click(WebElement ele) {
		try {
			ele.click();
			reportSteps("The element "+ele+" is clicked Successfully", "pass");
		} catch (Exception e) {
			reportSteps("The element "+ele+" is not clicked Successfully", "fail");
		}	

	}

	public void clear(WebElement ele)
	{
		try {
			driver.unregister(this);
			ele.clear();
			driver.register(this);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("No element "+ele+ " found to clear");
		}
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		System.out.println("The captured value is " +text);
		returnedtext=text;
		System.out.println(returnedtext);
		return returnedtext;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {

		Select sel = new Select(ele);
		sel.selectByVisibleText(value);
		System.out.println("The specified value is selected from the dropdown");

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub

		Select dropdown = new Select(ele);
		dropdown.selectByValue(value);


	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub


	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
	 String title = driver.getTitle();
	 System.out.println("The title of the current Page is " +title);
	 
	 if(title.equals(expectedTitle))
		 return true;
	 else
		
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		if (text.equals(expectedText)) {
			System.out.println("Text captured is same as the expected text");
		}
		else
		{
			System.out.println("Text captured is not same as the expected text");
		}
		

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

		String Partial = ele.getText();
		if (Partial.equals(expectedText)) {
			System.out.println("Text captured is same as the expected text");
		}
		else
		{
			System.out.println("Text captured is not same as the expected text");
		}

	

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub



	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub

		Set<String> CurrentWindow = driver.getWindowHandles();
		List<String> AllWindows = new ArrayList<String>();
		AllWindows.addAll(CurrentWindow);
		driver.switchTo().window(AllWindows.get(index));
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub


	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}
	
	public void keyboardControl( )
	{
		
	 driver.getKeyboard().sendKeys(Keys.ESCAPE);
		
		}
	
	
	public void MouseOver(WebElement source, WebElement target)
	{
		Actions builder = new Actions(driver);
/*		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(target));
		builder.moveToElement(source).click(target).perform();*/
	 builder.moveToElement(source).perform();
	 try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
		builder.click(target).perform();
	}



	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}


	public void closeActiveBrowser() {
		driver.close();
		// TODO Auto-generated method stub

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
