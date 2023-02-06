package pages;

import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContactUsPage extends Base {
    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css=".et_pb_module.et_pb_text.et_pb_text_2.txtContact.et_pb_bg_layout_light.et_pb_text_align_left.et_had_animation")
    WebElement location;

    //@FindBy(css=".tawk-custom-color.tawk-custom-border-color.tawk-button.tawk-button-circle.tawk-button-large")
    @FindBy(css="button[class='tawk-custom-color tawk-custom-border-color tawk-button tawk-button-circle tawk-button-large']")
    WebElement chatIcon;
    @FindBy(xpath="//a[@href='https://www.facebook.com/testorigen']")
    WebElement facebookIcon;

    @FindBy(xpath="//a[@href='https://twitter.com/Test_Origen']")
    WebElement twitterIcon;

    @FindBy(xpath="//a[@href='https://www.linkedin.com/company/testorigen/?trk=biz-companies-cym']")
    WebElement linkedIcon;

    @FindBy(css=".wpcf7")
    WebElement form;

    @FindBy(css=".wpcf7-form-control.wpcf7-text.wpcf7-validates-as-required")
    WebElement name;

    @FindBy(css=".wpcf7-form-control.wpcf7-text.wpcf7-email.wpcf7-validates-as-required.wpcf7-validates-as-email")
    WebElement emailAdresse;

    @FindBy(css=".wpcf7-form-control.wpcf7-textarea")
    WebElement message;

    @FindBy(css=".wpcf7-form-control.wpcf7-submit")
    WebElement sendMessageButton;




    public  boolean contactInfoIsDisplayed(){
        return isDisplayed(location);
    }
    public boolean chatIconIsDisplayed(){
        return isDisplayed(chatIcon);
    }
    public  boolean facebookIconIsDisplayed(){
        return isDisplayed(facebookIcon);
    }
    public  boolean twitterIcoIsDisplayed(){
        return isDisplayed(twitterIcon);
    }
    public  boolean linkedinIconIsDisplayed(){
        return isDisplayed(linkedIcon);
    }

    public  boolean formIsDisplayed(){
        return isDisplayed(form);
    }
    public  boolean nameIsDisplayed(){
        return isDisplayed(name);
    }
    public  boolean EmailAdresseIsDisplayed(){
        return isDisplayed(emailAdresse);
    }
    public  boolean messageIsDisplayed(){
        return isDisplayed(message);
    }
    public  boolean sendMessageButtonIsDisplayed(){
        return isDisplayed(sendMessageButton);
    }
}
