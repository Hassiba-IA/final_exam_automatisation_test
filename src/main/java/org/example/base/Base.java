package org.example.base;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import reporting.ExtentManager;
import reporting.ExtentTestManager;
import utility.Utility;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import static org.openqa.selenium.remote.http.DumpHttpExchangeFilter.LOG;

public class Base {

    public static WebDriver driver;
    public  Properties prop = Utility.loadProperties();
    String implicitWait= prop.getProperty("implicit.wait","8");
    String windowMaximize = prop.getProperty("window.maximize", "true");

    public static com.relevantcodes.extentreports.ExtentReports extent;

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @Parameters("url")
    @BeforeMethod
    public void setUp(String url){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicitWait)));
        if (windowMaximize.equalsIgnoreCase("true")) {
            driver.manage().window().maximize();
        }

        driver.get(url);
        System.out.println("success open browser");
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();

        driver.quit();
        LOG.info("browser close success");
    }


    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    //@Parameters("url")


    public void waitForElement(WebDriver driver,WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
    public void type(WebElement elem, String text) {
        elem.sendKeys(text);
    }
    public void clickOn(WebElement element){

        element.click();
    }

    public boolean isDisplayed(WebElement element){
        return element.isDisplayed();
    }
    public String getWebElementText(WebElement element) {
        return element.getText();
    }

    public void hoverOver(WebDriver driv, WebElement element){
        Actions action = new Actions(driv);
        action.moveToElement(element).perform();
    }
    public static String  getElementCss(WebElement element){
        return element.getCssValue("color");
}
}
