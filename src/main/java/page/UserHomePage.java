package page;

import element.ButtonElement;
import element.InputElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private ButtonElement profileButton;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private InputElement userSearchInputField;

    @FindBy(xpath = "//div/img")
    private ButtonElement userImage;

    public ButtonElement getProfileButton() {
        return profileButton;
    }

    public InputElement getUserSearchInputField() {
        return userSearchInputField;
    }

    public ButtonElement getUserImage() {
        return userImage;
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }
}
