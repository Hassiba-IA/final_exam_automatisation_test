package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends Base {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public HeaderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#menu-item-288")
    WebElement aboutUs;

    @FindBy(css="#menu-item-294")
    WebElement services ;

    @FindBy(css="#menu-item-293")
    WebElement career;

    @FindBy(css="#menu-item-289")
    WebElement blog;

    @FindBy(css="#menu-item-292")
    WebElement requestAQuote;

    @FindBy(css="#menu-item-2087")
    WebElement resources;

    @FindBy(css="#menu-item-290")
    WebElement contactUs;

    public void clickOnContactUs(){

        clickOn(contactUs);
    }

    public void clickOnRequestAQuote(){

        clickOn(requestAQuote);
    }
    public boolean validateAboutUsDisplayed(){

        return isDisplayed(aboutUs);
    }
    public boolean validateServicesDisplayed(){
        return isDisplayed(services);
    }
    public boolean validateCareerDisplayed(){
        return isDisplayed(career);
    }
    public boolean validateBlogDisplayed(){
        return isDisplayed(blog);
    }
    public boolean validateRequestAQuoteDisplayed(){
        return isDisplayed(requestAQuote);
    }
    public boolean validateResourcesDisplayed(){
        return isDisplayed(resources);
    }
    public boolean validateContactUsDisplayed(){
        return isDisplayed(contactUs);
    }
    public void hoveroversources(WebDriver driver){
        hoverOver(driver,resources);

    }
    public String getItemColor(){
        return getElementCss(aboutUs);
    }
    public void hoverOver(WebDriver driv){

        Actions action = new Actions(driv);
        action.moveToElement(contactUs).perform();
    }

}

