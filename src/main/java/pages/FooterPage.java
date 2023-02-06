package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends Base {

    Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public FooterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css=".footerSection")
    WebElement footerSection;

    @FindBy(css=".twitter-timeline.twitter-timeline-rendered")
    WebElement twitterTimeLineFooter;

    @FindBy(css=".icon.et_pb_with_border")
    WebElement followUsFooter;


    public boolean validateSectionFooterIsDisplayed(){

        return isDisplayed(footerSection);
    }
    public boolean twitterTimeLineFooterIsDisplayed(){

        return isDisplayed(twitterTimeLineFooter);
    }

    public boolean followUsFooterIsDisplayed(){

        return isDisplayed(followUsFooter);
    }

}
