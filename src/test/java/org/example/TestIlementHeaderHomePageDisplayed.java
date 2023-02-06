package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;

public class TestIlementHeaderHomePageDisplayed extends Base {
    Logger LOG = LogManager.getLogger(TestIlementHeaderHomePageDisplayed.class.getName());
@Test
    public void validateHeader(){
        HomePage homePage =new HomePage(driver);
    HeaderPage headerPage =new HeaderPage(driver);

        //validate if elements of header are displayed
        Assert.assertTrue(headerPage.validateAboutUsDisplayed());
        System.out.println("About Us is displayed success");

        Assert.assertTrue(headerPage.validateServicesDisplayed());
        System.out.println("Services is displayed success");

        Assert.assertTrue(headerPage.validateCareerDisplayed());
        System.out.println("Career is displayed success");

        Assert.assertTrue(headerPage.validateBlogDisplayed());
        System.out.println("Blog is displayed success");

        Assert.assertTrue(headerPage.validateRequestAQuoteDisplayed());
        System.out.println("Request a quote is displayed success");

        Assert.assertTrue(headerPage.validateResourcesDisplayed());
        System.out.println("Resources is displayed success");

        Assert.assertTrue(headerPage.validateContactUsDisplayed());
        System.out.println("Contact is displayed success");

        Assert.assertTrue(homePage.validateNumberPhoneHeaderDisplayed());
        System.out.println("number phone header is displayed success");

        Assert.assertTrue(homePage.validateEmailHeaderDisplayed());
        System.out.println("email header is displayed success");

        Assert.assertTrue(homePage.validateFacebookIconDisplayed());
        System.out.println("facebookIcon is displayed success");

        Assert.assertTrue(homePage.validateTwitterIconDisplayed());
        System.out.println("twitterIcon is displayed success");

        Assert.assertTrue(homePage.validateLinkedinIconDisplayed());
        System.out.println("linkedinIcon is displayed success");
    }
}
