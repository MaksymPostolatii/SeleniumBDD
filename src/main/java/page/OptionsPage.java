package page;

import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class OptionsPage extends AbstractPage {

    @FindBy(xpath = "//button[contains(text(),'Log Out')]")
    private ButtonElement logOutButton;

    public ButtonElement getLogOutButton() {
        return logOutButton;
    }
}
