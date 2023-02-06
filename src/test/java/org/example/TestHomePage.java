package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import utility.ExcelReader;

public class TestHomePage extends Base {
    Logger LOG = LogManager.getLogger(TestContact.class.getName());

    @Test
    public void validateTitle() {
        HeaderPage HeaderPage = new HeaderPage(driver);
        ExcelReader excelReader = new ExcelReader("C:\\Users\\Mebre\\Desktop\\projets_clonés\\exam_part2\\dataFiles\\data.xlsx", "dataTestExam");
        String actual = getPageTitle();
        String expected = excelReader.getDataForGivenHeaderAndKey("key", "home page title");
        Assert.assertEquals(actual, expected);
        LOG.info("page title validation success");
    }

    @Test
    public void validateElementHeaderDisplayed() {
        HeaderPage HeaderPage = new HeaderPage(driver);

        //validate if elements of header are displayed
        Assert.assertTrue(HeaderPage.validateAboutUsDisplayed());
        LOG.info("About Us is displayed success");

        Assert.assertTrue(HeaderPage.validateServicesDisplayed());
        LOG.info("Services is displayed success");

        Assert.assertTrue(HeaderPage.validateCareerDisplayed());
        LOG.info("Career is displayed success");

        Assert.assertTrue(HeaderPage.validateBlogDisplayed());
        LOG.info("Blog is displayed success");

        Assert.assertTrue(HeaderPage.validateRequestAQuoteDisplayed());
        LOG.info("Request a quote is displayed success");

        Assert.assertTrue(HeaderPage.validateResourcesDisplayed());
        LOG.info("Resources is displayed success");

        Assert.assertTrue(HeaderPage.validateContactUsDisplayed());
        LOG.info("Contact is displayed success");


    }

    @Test
    public void validateButtonHeaderPage() {
        HeaderPage HeaderPage = new HeaderPage(driver);
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.validateKnowMoreButtonDisplayed());
        LOG.info("Know Button is displayed");

        Assert.assertTrue(homePage.validateReadMoreButtonDisplayed());
        LOG.info("Read More Button is displayed");
    }


    @Test
    public void homePageSendMessageFormDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.usernameFieldIsDisplayed());
        LOG.info("userName is displayed");

        Assert.assertTrue(homePage.usernameFieldIsDisplayed());
        LOG.info("emailField is displayed");


        Assert.assertTrue(homePage.phoneFieldIsDisplayed());
        LOG.info("phoneField is displayed");

        Assert.assertTrue(homePage.messageFieldIsDisplayed());
        LOG.info("messageTextArea is displayed");

        Assert.assertTrue(homePage.submitBtnIsDisplayed());
        LOG.info("submit Button is displayed");
    }

    @Test
    public void testerColorItemHeader() throws InterruptedException {

    HeaderPage headerPage = new HeaderPage(driver);
    Assert.assertEquals(headerPage.getItemColor(),"rgba(71, 71, 71, 1)");
}

}
