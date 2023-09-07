package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.*;

public class AppiumTestReports {
    private ExtentReports extent;
    private ExtentTest test;

    public AppiumTestReports(String reportFileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportFileName);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    public void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public void logInfo(String message) {
        test.log(Status.INFO, message);
    }

    public void logPass(String message) {
        test.log(Status.PASS, message);
    }

    public void logFail(String message) {
        test.log(Status.FAIL, message);
    }

    public void flushReport() {
        extent.flush();
    }
}