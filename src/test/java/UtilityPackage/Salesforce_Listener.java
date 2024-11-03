package UtilityPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext; 
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Salesforce_Listener implements ITestListener{
	private Logger myLog = LogManager.getLogger(Salesforce_Listener.class);
	private ExtentReportsUtility extentReport = ExtentReportsUtility.getInstance();
	@Override
	public void onStart(ITestContext context) {
		myLog.info(context.getName()+" started..............");
		extentReport.startExtentReport();
	}
	@Override
	public void onFinish(ITestContext context) {
		myLog.info(context.getName()+"has been completed........");
		extentReport.endReport();
	}
	@Override
	public void onTestStart(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" has started..........");
		extentReport.startSingleTestReport(result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" has succeeded.........");
		extentReport.logTestpassed(result.getMethod().getMethodName()+" ended with success......................");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" has failed..............");
		extentReport.logTestFailed(result.getMethod().getMethodName()+" ended with failure.......................");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		myLog.info(result.getMethod().getMethodName()+" has been skipped..............");
		extentReport.logTestFailed(result.getMethod().getMethodName()+" skipped...........................");
	}
}
