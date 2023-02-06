package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FooterPage;
import pages.HomePage;

public class TestFooter extends Base {
    Logger LOG = LogManager.getLogger(TestContact.class.getName());
    @Test
    public void validateElementHeaderDisplayed() throws InterruptedException {
        FooterPage footerPage = new FooterPage(driver);
        //Thread.sleep(4000);

        //validate if elements of footer are displayed
        Assert.assertTrue(footerPage.twitterTimeLineFooterIsDisplayed());
        LOG.info("twitter time line footer is displayed success");

        Assert.assertTrue(footerPage.followUsFooterIsDisplayed());
        LOG.info("Follow Us footer is displayed success");

        Assert.assertTrue(footerPage.validateSectionFooterIsDisplayed());
        LOG.info("Footer Section is displayed success");
    }
}
