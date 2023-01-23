package com.obsqura.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportListener implements ITestListener {
	public ExtentSparkReporter spark;
    public ExtentTest logger;
    public ExtentReports extent;
 private static String getTestMethodName(ITestResult iTestResult)
  {
	return iTestResult.getMethod().getConstructorOrMethod().getName();
	  
  }

	public void onTestStart(ITestResult result) {
		logger = extent.createTest(result.getName());
	    Reporter.log(result.getName()+" test case started",2,true);
	    System.out.println(result.getName()+" test case started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
	    logger.log(Status.PASS,result.getName()+ " has been successfully tested");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the testcase failed is :"+result.getName());
	    logger.log(Status.FAIL,result.getName()+ " validation failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		spark = new ExtentSparkReporter("Sparks.html");
	    extent = new ExtentReports();
	    extent.attachReporter(spark);
	    extent.setSystemInfo("Host name", "localhost");
	    extent.setSystemInfo("Environemnt", "QA");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
