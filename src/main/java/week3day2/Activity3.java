package week3day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Activity3 extends WebDriverServiceImpl {

	@Test
	public void main() throws InterruptedException {
		
		keyboardControl();
		
		
		WebElement eleTV = locateElement("XPath", "//span[text()='TVs & Appliances']");
		WebElement eleSamsung = locateElement("XPath", "(//span[text()='Samsung'])[2]");
		
		MouseOver(eleTV, eleSamsung);
		
		WebElement elePriceFrom = locateElement("XPath", "//select[@class='fPjUPw']");
		selectDropDownUsingVisibleText(elePriceFrom, "₹25000");
		
		WebElement elePriceTo = locateElement("XPath", "(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingVisibleText(elePriceTo, "₹₹60000");
		
		
		WebElement eleScreenSize = locateElement("XPath", "//div[text()='Screen Size']");
		WebElement eleinches = locateElement("XPath", "//div[text()='48 - 55']/preceding-sibling::div");
		
		MouseOver(eleScreenSize, eleinches);
						
		WebElement eleFirstTV = locateElement("XPath", "//div[@class='_1vC4OE _2rQ-NK']");
		//getText(eleFirstTV);
		String PriceinWin1 = eleFirstTV.getText();
		System.out.println(PriceinWin1);
		click(eleFirstTV);
		
		
		switchToWindow(1);
		
		WebElement eleNewWin = locateElement("XPath", "//div[@class='_1vC4OE _3qQ9m1']");
		//getText(eleNewWin);
		String PriceinWin2 = eleNewWin.getText();
		System.out.println(PriceinWin2);
		
		if(PriceinWin1.equals(PriceinWin2))
		{
			System.out.println("Price in window 1 is equal to price in window 2");
		}
		else
			System.out.println("Price in window 1 is not equal to price in window 2");
		
		closeActiveBrowser();
		
		switchToWindow(0);
		
		WebElement eleCompare1 = locateElement("XPath", "//span[text()='Add to Compare']");
		click(eleCompare1);
		
		WebElement eleCompare2 = locateElement("XPath", "(//span[text()='Add to Compare'])[2]");
		click(eleCompare2);
		

		WebElement eleComparison = locateElement("XPath", "//span[text()='COMPARE']");
		click(eleComparison);
		
		verifyExactTitle("Compare");
		
		
		
		WebElement eleCompPrice1 = locateElement("XPath", "//div[@class='_1vC4OE']");
		String Lowest = eleCompPrice1.getText();
		System.out.println(Lowest);
		
		WebElement eleCompPrice2 = locateElement("XPath", "(//div[@class='_1vC4OE'])[2]");
		String Highest = eleCompPrice2.getText();
		System.out.println(Highest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

				
	}

}
