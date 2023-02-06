package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import pages.QaEtTestingVideoPage;

public class TestQaEtTestingVideoPage extends Base {
    Logger LOG = LogManager.getLogger(TestQaEtTestingVideoPage.class.getName());
    @Test
    public void validateQaEtTestingPage() throws InterruptedException {
        HomePage homePage =new HomePage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        QaEtTestingVideoPage qaEtTestingVideoPage= new QaEtTestingVideoPage(driver);
        headerPage.hoveroversources(driver);
        homePage.clickOnQaEtTestingVideo();
        Thread.sleep(6000);

        Assert.assertEquals("QA & Testing Videos | Visual Representation of Our Software Testing Services | TestOrigen",getPageTitle());

      LOG.info("user land on Qa & testing Videos page success");
        Assert.assertTrue(qaEtTestingVideoPage.subscribeButtonIsDisplayed());
      LOG.info("subscribe button is displayed success");


    }



}
