package tests.ParabankTests;

import ExtentReport.ExtentReportJava;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
ExtentTest test;
    ExtentReports extent= ExtentReportJava.getReportObject();

    @Override
    public void onTestStart(ITestResult result) {
        // Code to be executed when a test method starts execution.
     test=   extent.createTest(result.getMethod().getMethodName());



    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Code to be executed when a test method successfully passes without any exceptions.

        test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Code to be executed when a test method fails due to an exception.
        //test.log(Status.FAIL,"Test Failed");
        test.fail(result.getThrowable());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Code to be executed when a test method is skipped.
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Code to be executed when a test method fails within the success percentage defined in the testng.xml file.
    }

    @Override
    public void onStart(ITestContext context) {
        // Code to be executed before the test suite starts execution.
    }

    @Override
    public void onFinish(ITestContext context) {
        // Code to be executed after the test suite finishes execution.
    }
}
