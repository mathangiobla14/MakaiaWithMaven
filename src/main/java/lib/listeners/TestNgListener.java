package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestNgListener implements IAnnotationTransformer, IRetryAnalyzer{

	int maxcount=1;
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		//System.out.println("The classname is " +testClass);
		System.out.println("The methodname is " +testMethod);

		annotation.setInvocationCount(1);
		annotation.setTimeOut(15);
		annotation.setRetryAnalyzer(this.getClass());

		if(testMethod.getName().equals("delete")) {
			annotation.setEnabled(false);
		}
	
	}

	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && maxcount<2) {
			maxcount++;
			
			return true;
		}
			
		return false;
	}
	


}
