package demo.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomITestListener implements ITestListener  {

	  public void onTestFailure(ITestResult result) {
		    System.out.println("Test has failed and this message is from the ITestListner interface");
		  }
	  
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("Test has passed from ITestListner interface!");
		  }
	
}
