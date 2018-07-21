package lib.reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Reports {

	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest testSuite, test;

	//@BeforeSuite
	public void startReport() {
		html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(false);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(html);		
	}

	//@BeforeClass
	public ExtentTest startTestCase(String testCaseName, String testDescription) {
		testSuite = extent.createTest(testCaseName, testDescription);
		return testSuite;
	}

	//@BeforeMethod
	public ExtentTest startTestModule(String nodes, String author, String category) {
		test = testSuite.createNode(nodes);
		test=testSuite.assignAuthor(author);
		test=testSuite.assignAuthor(category);


		return test;
	}

	//@AfterSuite
	public void endResult() {
		extent.flush();
	}

	public abstract long takeSnap();

	public void reportSteps(String desc,String status) {

		MediaEntityModelProvider img = null;

		long snapNumber = 1000000L;
		snapNumber = takeSnap();


		try {
			img = MediaEntityBuilder.createScreenCaptureFromPath("./../report/images/"+snapNumber+".png").build();
		} catch (IOException e) {			
		}		

		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc, img);		
		}else if(status.equalsIgnoreCase("FAIL")) {
			test.fail(desc, img);
			throw new RuntimeException();
		}else if(status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);		
		}else {
			test.info(desc);
		}
	}



}
