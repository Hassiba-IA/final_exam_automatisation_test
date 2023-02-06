package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utility.ExcelReader;
import utility.Utility;


public class TestSubmitHomePage extends Base {
    Logger LOG = LogManager.getLogger(TestSubmitHomePage.class.getName());
    ExcelReader excelReader = new ExcelReader("C:\\Users\\Mebre\\Desktop\\projets_clonés\\exam_part2\\dataFiles\\data.xlsx","dataTestExam");

    //String email= excelReader.getDataForGivenHeaderAndKey("key","email");
    @Test
    public void positifSubmit() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //inter userName

        homePage.typeUsername("Hassiba");
      LOG.info("enter userName success");

        //inter email
        homePage.typeEmail(excelReader.getDataForGivenHeaderAndKey("key","email"));
      LOG.info("enter email success");

        //inter phone number
        homePage.typeNumberPhone("0605528330");
      LOG.info("enter phone number success");

        //inter message
        homePage.typeMessage("Hello i am Hassiba ZEROUKLANE");
      LOG.info("enter messageTextArea success");

        //click on submit button
        homePage.clickOnSubmitButton();
        Thread.sleep(3000);

        String infoMsgDisplayed = homePage.getAlertMessageOk();
        Thread.sleep(3000);

        Assert.assertEquals("Thank you for your message. It has been sent.",infoMsgDisplayed);
      LOG.info("sent message success");
    }

    @Test
    public void userNameFieldIsEmpty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //inter userName
        homePage.typeUsername("");
      LOG.info("enter userName success");

        //inter email

        homePage.typeEmail(excelReader.getDataForGivenHeaderAndKey("key","email"));
      LOG.info("enter emailField success");

        //inter phone number
        homePage.typeNumberPhone("0605528330");
      LOG.info("enter phoneField success");

        //inter message
        homePage.typeMessage("Hello i am Hassiba ZEROUKLANE");
      LOG.info("enter messageTextArea success");

        //click on submit button
        homePage.clickOnSubmitButton();

        Thread.sleep(3000);
        //WebElement alertInfo = driver.findElement(By.xpath());

        String infoMsgDisplayed = homePage.getAlertMessageError();
        Thread.sleep(3000);

        Assert.assertEquals("One or more fields have an error. Please check and try again.",infoMsgDisplayed);
      LOG.info("error message validation success");
    }
    @Test
    public void emailFieldIsEmpty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //inter userName
        homePage.typeUsername("Hassiba");
      LOG.info("enter userName success");

        //inter email
        homePage.typeEmail("");
      LOG.info("enter emailField success");

        //inter phone number
        homePage.typeNumberPhone("0605528330");
      LOG.info("enter phoneField success");

        //inter message
        homePage.typeMessage("Hello i am Hassiba ZEROUKLANE");
      LOG.info("enter messageTextArea success");

        //click on submit button
        homePage.clickOnSubmitButton();
        //Thread.sleep(3000);

        String infoMsgDisplayed = homePage.getAlertMessageError();
        //Thread.sleep(3000);

        Assert.assertEquals("One or more fields have an error. Please check and try again.",infoMsgDisplayed);
      LOG.info("error message validation success");
    }
    @Test
    public void phoneFieldIsEmpty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //inter userName
        homePage.typeUsername("Hassiba");
      LOG.info("enter userName success");

        //inter email
        homePage.typeEmail(excelReader.getDataForGivenHeaderAndKey("key","email"));
      LOG.info("enter emailField success");

        //inter phone number
        homePage.typeNumberPhone("");
      LOG.info("enter phoneField success");

        //inter message
        homePage.typeMessage("Hello i am Hassiba ZEROUKLANE");
      LOG.info("enter messageTextArea success");

        //click on submit button
        homePage.clickOnSubmitButton();
        //Thread.sleep(3000);

        String infoMsgDisplayed = homePage.getAlertMessageError();
        //Thread.sleep(3000);

        Assert.assertEquals("One or more fields have an error. Please check and try again.",infoMsgDisplayed);
      LOG.info("error message validation success");
    }
    @Test
    public void textAreaIsEmpty() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //inter userName
        homePage.typeUsername("Hassiba");
      LOG.info("enter userName success");

        //inter email
        homePage.typeEmail(excelReader.getDataForGivenHeaderAndKey("key","email"));
      LOG.info("enter emailField success");

        //inter phone number
        homePage.typeNumberPhone("0605528330");
      LOG.info("enter phoneField success");

        //inter message
        homePage.typeMessage("");
      LOG.info("enter messageTextArea success");

        //click on submit button
        homePage.clickOnSubmitButton();
        //Thread.sleep(3000);

        String infoMsgDisplayed = homePage.getAlertMessageError();
        //Thread.sleep(3000);

        Assert.assertEquals("One or more fields have an error. Please check and try again.",infoMsgDisplayed);
      LOG.info("error message validation success");

    }
}
