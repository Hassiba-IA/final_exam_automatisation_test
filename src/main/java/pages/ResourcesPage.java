package pages;

import org.example.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends Base {
    public ResourcesPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
}
