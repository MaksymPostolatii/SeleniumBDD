package page;

import element.ButtonElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends AbstractPage {

    //private static final String REMEMBER_ME_BUTTON_LOCATOR = "//button[contains(text(), 'Remember')]";
    @FindBy(xpath = "//button[contains(text(),'Options')]")
    private ButtonElement optionsButton;

    @FindBy(xpath = "//button[contains(text(), 'Remember')]")
    private List<WebElement> rememberMeButton;

    public ButtonElement getOptionsButton() {
        return optionsButton;
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }


    public List<WebElement> getRememberMeButton() {
        return rememberMeButton;
        //  return driver.findElements(By.xpath(REMEMBER_ME_BUTTON_LOCATOR));
    }
}
