package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private final AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private AndroidElement digit1;

    @AndroidFindBy(id = "com.android.calculator2:id/op_add")
    private AndroidElement plus;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private AndroidElement digit2;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private AndroidElement equals;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private AndroidElement result;

    public CalculatorPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void performAddition(int num1, int num2) {
        digit1.click();
        plus.click();
        digit2.click();
        equals.click();
    }

    public String getResult() {
        return result.getText();
    }

	public void performSubtraction(int i, int j) {
		// TODO Auto-generated method stub
		  digit1.click();
	        plus.click();
	        digit2.click();
	        equals.click();
	}
}
