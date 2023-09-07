package Tests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.CalculatorPage;


import java.net.MalformedURLException;

public class CalculatorTests extends MainClass.BaseTest {
    private CalculatorPage calculatorPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        initializeDriver();
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    public void testAddition() {
        calculatorPage.performAddition(5, 3);
        String result = calculatorPage.getResult();
        Assert.assertEquals(result, "8");
    }

    @Test
    public void testSubtraction() {
        calculatorPage.performSubtraction(10, 4);
        String result = calculatorPage.getResult();
        Assert.assertEquals(result, "6");
    }

    @AfterClass
    public void tearDown() {
        quitDriver();
    }
}
