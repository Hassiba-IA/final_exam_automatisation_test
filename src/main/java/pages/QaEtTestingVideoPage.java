package pages;

import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaEtTestingVideoPage extends Base {
    public QaEtTestingVideoPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
   @FindBy(css = ".et_pb_button.et_pb_button_0.et_pb_bg_layout_light")
    WebElement subscribeButton;

    public boolean subscribeButtonIsDisplayed(){

        return isDisplayed(subscribeButton);
    }
}
