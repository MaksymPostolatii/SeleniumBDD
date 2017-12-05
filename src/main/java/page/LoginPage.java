package page;

import element.ButtonElement;
import element.InputElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private InputElement userName;
    @FindBy(xpath = "//input[@name='password']")
    private InputElement userPassword;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    private ButtonElement logIn;

    public void enterLogin(String username) {
        userName.sendKeys(username);
    }

    public void enterPassword(String password) {
        userPassword.sendKeys(password);
    }

    public void clickLogIn() {
        logIn.click();
    }

}