package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HeaderPage;

public class TestContact extends Base {
    Logger LOG = LogManager.getLogger(TestContact.class.getName());
    @Test
    //click on contact
    public void contact () throws InterruptedException {
        HeaderPage headerPage = new HeaderPage(driver);
        ContactUsPage contactUsPage =new ContactUsPage(driver);

        headerPage.clickOnContactUs();
        //Thread.sleep(6000);

        Assert.assertEquals("Contact us | Best Software Testing Services Providers in Noida | TestOrigen",getPageTitle());

        LOG.info("user land on contact page success");

        Assert.assertTrue(contactUsPage.contactInfoIsDisplayed());
        LOG.info("Contact Info is displayed success");

        Assert.assertTrue(contactUsPage.facebookIconIsDisplayed());
        LOG.info("facebook icon is displayed success");

        Assert.assertTrue(contactUsPage.twitterIcoIsDisplayed());
        LOG.info("twitter icon is displayed success");

        Assert.assertTrue(contactUsPage.linkedinIconIsDisplayed());
        LOG.info("linkedin icon is displayed success");

        Assert.assertTrue(contactUsPage.formIsDisplayed());
        LOG.info("form is displayed success");

        //Assert.assertTrue(contactPage.chatIconIsDisplayed());
        //System.out.println("chat icon is displayed success");

        Assert.assertTrue(contactUsPage.sendMessageButtonIsDisplayed());
        LOG.info("Name field contact is displayed");

        Assert.assertTrue(contactUsPage.sendMessageButtonIsDisplayed());
        LOG.info("Email Adresse field contact is displayed");

        Assert.assertTrue(contactUsPage.sendMessageButtonIsDisplayed());
        LOG.info("text Area Field contact is displayed");

        Assert.assertTrue(contactUsPage.sendMessageButtonIsDisplayed());
        LOG.info("send message button contact is displayed");

    }




}
