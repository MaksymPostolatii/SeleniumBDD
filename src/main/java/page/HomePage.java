package page;

import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//a[contains(text(),'Увійдіть')]")
    private ButtonElement logIn;

    public void navigateToLogIn() {
        logIn.click();
    }
}