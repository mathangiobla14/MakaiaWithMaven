package week6day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporter {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub

		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC1_CreateLead", "CreateLead");
		
		test.pass("The Url is entered succesfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build());
		test.fail("The username is entered succesfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap2.jpg").build());
		test.warning("The pwd is entered succesfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap3.jpg").build());
		
		
		test.assignCategory("smoke");
		test.assignAuthor("Mathangi");
		extent.flush();
		
		
		
	}

}
