package page;

import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'Log in')] | //a[contains(text(),'Увійдіть')]")
    private ButtonElement logIn;

    public void navigateToLogIn() {
        logIn.click();
    }

    public Boolean isLogInButtonDisplayed() {
        return logIn.isDisplayed();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}