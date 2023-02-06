package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    Logger LOG = LogManager.getLogger(HomePage.class.getName());
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //objects
    @FindBy(css="input[name='your-name']")
    WebElement userNameField;
    @FindBy(css="input[name='your-email']")
    WebElement emailField;
    @FindBy(css="input[name='your-phone']")
    WebElement phoneField;
    @FindBy(css="textarea[name='your-message']")
    WebElement messageField;
    @FindBy(css=".wpcf7-form-control.wpcf7-submit")
    WebElement submitButton;

    @FindBy(css=".ls-layer-link")
    WebElement knowMoreButton;

    @FindBy(css=".et_pb_button.et_pb_promo_button")
    WebElement readMoreButton;

    @FindBy(css=".wpcf7-response-output.wpcf7-display-none.wpcf7-mail-sent-ok")
    WebElement alertMessageOk;

    @FindBy(css=".wpcf7-response-output.wpcf7-display-none.wpcf7-validation-errors")
    WebElement alertMessageError;

    @FindBy(xpath="//a[@href='tel:01204123632']")
    WebElement phoneNumberHeader;

    @FindBy(css="#et-info-email")
    WebElement emailHeader;

    @FindBy(xpath="//a[@href='https://www.facebook.com/testorigen']")
    WebElement facebookIcon;

    @FindBy(xpath="//a[@href='https://twitter.com/Test_Origen']")
    WebElement twitterIcon;

    @FindBy(xpath="//a[@href='https://www.linkedin.com/company/testorigen/?trk=biz-companies-cym']")
    WebElement linkedIcon;

    @FindBy(css ="#menu-item-9216")
    WebElement linkQaEtTestingVideoPage;

    //steps
    public boolean usernameFieldIsDisplayed(){
        return isDisplayed(userNameField);
    }
    public void typeUsername(String username){
        type(userNameField, username);
    }
    public boolean emailFieldIsDisplayed(){
        return isDisplayed(emailField);
    }
    public void typeEmail(String email){
        type(emailField, email);
    }
    public boolean phoneFieldIsDisplayed(){
        return isDisplayed(phoneField);

    }
    public void typeNumberPhone(String number){
        type(phoneField, number);
    }
    public boolean messageFieldIsDisplayed(){

        return isDisplayed(phoneField);
    }
    public void typeMessage(String msg){
        type(messageField, msg);
    }
    public boolean submitBtnIsDisplayed(){

        return isDisplayed(submitButton);
    }
    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }
    public String getAlertMessageOk(){
        return getWebElementText(alertMessageOk);
    }
    public String getAlertMessageError(){
        return getWebElementText(alertMessageError);
    }


    public boolean validateKnowMoreButtonDisplayed(){

        return isDisplayed(knowMoreButton);
    }
    public boolean validateReadMoreButtonDisplayed(){

        return isDisplayed(readMoreButton);
    }

    public boolean validateNumberPhoneHeaderDisplayed(){
        return isDisplayed(phoneNumberHeader);
    }

    public boolean validateEmailHeaderDisplayed(){
        return isDisplayed(emailHeader);
    }
    public boolean validateFacebookIconDisplayed(){
        return isDisplayed(facebookIcon);
    }
    public boolean validateTwitterIconDisplayed(){
        return isDisplayed(twitterIcon);
    }
    public boolean validateLinkedinIconDisplayed(){
        return isDisplayed(linkedIcon);
    }


    public void clickOnQaEtTestingVideo(){

        clickOn(linkQaEtTestingVideoPage);
    }

}
