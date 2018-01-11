package page;

import element.ButtonElement;
import element.InputElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private InputElement userNameInputField;
    @FindBy(xpath = "//input[@name='password']")
    private InputElement userPasswordInputField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private ButtonElement logInButton;

    public InputElement getUserNameInputField() {
        return userNameInputField;
    }

    public InputElement getUserPasswordInputField() {
        return userPasswordInputField;
    }

    public ButtonElement getLogInButton() {
        return logInButton;
    }

    @Override
    public WebDriver getDriver() {
        return super.getDriver();
    }
}