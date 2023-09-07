package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AppiumListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // Implement listener logic if needed
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Implement listener logic if needed
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Implement listener logic if needed
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Implement listener logic if needed
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Implement listener logic if needed
    }

    @Override
    public void onStart(ITestContext context) {
        // Implement listener logic if needed
    }

    @Override
    public void onFinish(ITestContext context) {
        // Implement listener logic if needed
    }
}
